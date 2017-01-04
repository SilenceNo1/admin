package com.fh.interceptor.session;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.danga.MemCached.MemCachedClient;
import com.danga.MemCached.SockIOPool;

public class SessionService {

	private static SessionService instance = null;

	private SockIOPool pool = null;

	private String poolName = "sidsock";

	public static synchronized SessionService getInstance() {
		if (instance == null) {
			instance = new SessionService();
		}
		return instance;
	}

	private SessionService() {
		ClassLoader cl = Thread.currentThread().getContextClassLoader();
		InputStream infile = cl.getResourceAsStream("memcached.properties");
		Properties props = new Properties();
		String serverlist = "127.0.0.1:11211";
		try {
			props.load(infile);
			serverlist = props.getProperty("serverlist", "127.0.0.1:11211");
			poolName = props.getProperty("poolname", "sidsock");

		} catch (Exception e) {
			e.printStackTrace();
		}

		String[] servers = serverlist.split(",");
		pool = SockIOPool.getInstance(poolName);
		pool.setServers(servers);
		pool.setFailover(true);
		pool.setInitConn(10);
		pool.setMinConn(5);
		pool.setMaxConn(250);
		pool.setMaintSleep(30);
		pool.setNagle(false);
		pool.setSocketTO(3000);
		pool.setAliveCheck(true);
		pool.initialize();
	}

	public Map getSession(String id) {
		MemCachedClient mc = this.getMemCachedClient();

		Map session = (Map) mc.get(id);
		if (session == null) {
			session = new HashMap();
			mc.add(id, session);
		}
		return session;
	}

	public void saveSession(String id, Map session) {
		MemCachedClient mc = this.getMemCachedClient();
		mc.replace(id, session);
	}

	public void removeSession(String id) {
		MemCachedClient mc = this.getMemCachedClient();
		mc.delete(id);
	}

	private MemCachedClient getMemCachedClient() {
		MemCachedClient mc = new MemCachedClient();
		mc.setPoolName(poolName);
		mc.setCompressEnable(false);
		mc.setCompressThreshold(0);
		return mc;
	}

	protected void finalize() {
		if (this.pool != null) {
			this.pool.shutDown();
		}
	}

}
