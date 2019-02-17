package com.fh.service.easybook.easybookgua.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.fh.dao.DaoSupport;
import com.fh.entity.Page;
import com.fh.util.PageData;
import com.fh.service.easybook.easybookgua.EasyBookGuaManager;

/** 
 * 说明： 挂
 * 创建人：Silence13161618211
 * 创建时间：2018-06-16
 * @version
 */
@Service("easybookguaService")
public class EasyBookGuaService implements EasyBookGuaManager{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception{
		dao.save("EasyBookGuaMapper.save", pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception{
		dao.delete("EasyBookGuaMapper.delete", pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception{
		dao.update("EasyBookGuaMapper.edit", pd);
	}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)dao.findForList("EasyBookGuaMapper.datalistPage", page);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("EasyBookGuaMapper.listAll", pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("EasyBookGuaMapper.findById", pd);
	}
	/**通过gua_code获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findByCode(PageData pd)throws Exception{
		return (PageData)dao.findForObject("EasyBookGuaMapper.findByCode", pd);
	}
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		dao.delete("EasyBookGuaMapper.deleteAll", ArrayDATA_IDS);
	}
	
}

