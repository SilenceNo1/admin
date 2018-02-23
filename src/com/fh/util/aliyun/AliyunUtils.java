/**   
* @Title: AliyunUtils.java 
* @Package com.fh.util 
* @Description: TODO 
* @author 贾鑫   
* @date Feb 22, 2018 5:01:40 PM 
* @version V1.0   
*/
package com.fh.util.aliyun;
 
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import com.alibaba.druid.support.json.JSONUtils;
import com.fh.util.HttpUtils;

import net.sf.json.JSONObject;


public class AliyunUtils {
	
	public static String artificialIntelligence(String question) {
	    String host = "http://jisuznwd.market.alicloudapi.com";
	    String path = "/iqa/query";
	    String method = "GET";
	    String appcode = "fd98d3c733a54bfa9af061b9768e0822";
	    Map<String, String> headers = new HashMap<String, String>();
	    //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
	    headers.put("Authorization", "APPCODE " + appcode);
	    Map<String, String> querys = new HashMap<String, String>();
	    querys.put("question", question);


	    try {
	    	/**
	    	* 重要提示如下:
	    	* HttpUtils请从
	    	* https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/AliyunUtils.java
	    	* 下载
	    	*
	    	* 相应的依赖请参照
	    	* https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
	    	*/
	    	HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
	    	//System.out.println(response.toString());
	    	//获取response的body
	    	//System.out.println(EntityUtils.toString(response.getEntity()));
	    	return EntityUtils.toString(response.getEntity());
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
		return "对不起!你说啥我没听懂!";
	}
	public static void main(String[] args) {
		JSONObject jsonObject = (JSONObject) JSONObject.fromObject(artificialIntelligence("北京天气")).get("result");  
		System.out.println(jsonObject.get("content"));
	}
}