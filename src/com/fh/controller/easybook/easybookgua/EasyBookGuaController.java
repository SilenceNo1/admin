package com.fh.controller.easybook.easybookgua;

import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fh.controller.base.BaseController;
import com.fh.entity.Page;
import com.fh.service.easybook.easybookgua.EasyBookGuaManager;
import com.fh.util.AppUtil;
import com.fh.util.Jurisdiction;
import com.fh.util.ObjectExcelView;
import com.fh.util.PageData;
import com.fh.util.Tools;

/** 
 * 说明：挂
 * 创建人：Silence13161618211
 * 创建时间：2018-06-16
 */
@Controller
@RequestMapping(value="/easybookgua")
public class EasyBookGuaController extends BaseController {
	
	String menuUrl = "easybookgua/list.do"; //菜单地址(权限用)
	@Resource(name="easybookguaService")
	private EasyBookGuaManager easybookguaService;
	
	/**保存
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/save")
	public ModelAndView save() throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"新增EasyBookGua");
		if(!Jurisdiction.buttonJurisdiction(menuUrl, "add")){return null;} //校验权限
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.remove("ID");
		pd.put("CREATE_TIME", Tools.date2Str(new Date()));	//create_time
		pd.put("UPDATE_TIME", Tools.date2Str(new Date()));	//update_time
		easybookguaService.save(pd);
		mv.addObject("msg","success");
		mv.setViewName("save_result");
		return mv;
	}
	
	/**删除
	 * @param out
	 * @throws Exception
	 */
	@RequestMapping(value="/delete")
	public void delete(PrintWriter out) throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"删除EasyBookGua");
		if(!Jurisdiction.buttonJurisdiction(menuUrl, "del")){return;} //校验权限
		PageData pd = new PageData();
		pd = this.getPageData();
		easybookguaService.delete(pd);
		out.write("success");
		out.close();
	}
	
	/**修改
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/edit")
	public ModelAndView edit() throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"修改EasyBookGua");
		if(!Jurisdiction.buttonJurisdiction(menuUrl, "edit")){return null;} //校验权限
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		easybookguaService.edit(pd);
		mv.addObject("msg","success");
		mv.setViewName("save_result");
		return mv;
	}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(Page page) throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"列表EasyBookGua");
		//if(!Jurisdiction.buttonJurisdiction(menuUrl, "cha")){return null;} //校验权限(无权查看时页面会有提示,如果不注释掉这句代码就无法进入列表页面,所以根据情况是否加入本句代码)
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		String keywords = pd.getString("keywords");				//关键词检索条件
		if(null != keywords && !"".equals(keywords)){
			pd.put("keywords", keywords.trim());
		}
		page.setPd(pd);
		List<PageData>	varList = easybookguaService.list(page);	//列出EasyBookGua列表
		mv.setViewName("easybook/easybookgua/easybookgua_list");
		mv.addObject("varList", varList);
		mv.addObject("pd", pd);
		mv.addObject("QX",Jurisdiction.getHC());	//按钮权限
		return mv;
	}
	
	/**去新增页面
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/goAdd")
	public ModelAndView goAdd()throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		mv.setViewName("easybook/easybookgua/easybookgua_edit");
		mv.addObject("msg", "save");
		mv.addObject("pd", pd);
		return mv;
	}	
	
	 /**去修改页面
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/goEdit")
	public ModelAndView goEdit()throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd = easybookguaService.findById(pd);	//根据ID读取
		mv.setViewName("easybook/easybookgua/easybookgua_edit");
		mv.addObject("msg", "edit");
		mv.addObject("pd", pd);
		return mv;
	}	
	
	 /**批量删除
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/deleteAll")
	@ResponseBody
	public Object deleteAll() throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"批量删除EasyBookGua");
		if(!Jurisdiction.buttonJurisdiction(menuUrl, "del")){return null;} //校验权限
		PageData pd = new PageData();		
		Map<String,Object> map = new HashMap<String,Object>();
		pd = this.getPageData();
		List<PageData> pdList = new ArrayList<PageData>();
		String DATA_IDS = pd.getString("DATA_IDS");
		if(null != DATA_IDS && !"".equals(DATA_IDS)){
			String ArrayDATA_IDS[] = DATA_IDS.split(",");
			easybookguaService.deleteAll(ArrayDATA_IDS);
			pd.put("msg", "ok");
		}else{
			pd.put("msg", "no");
		}
		pdList.add(pd);
		map.put("list", pdList);
		return AppUtil.returnObject(pd, map);
	}
	
	 /**导出到excel
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/excel")
	public ModelAndView exportExcel() throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"导出EasyBookGua到excel");
		if(!Jurisdiction.buttonJurisdiction(menuUrl, "cha")){return null;}
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		Map<String,Object> dataMap = new HashMap<String,Object>();
		List<String> titles = new ArrayList<String>();
		titles.add("id");	//1
		titles.add("gua_code");	//2
		titles.add("name");	//3
		titles.add("title");	//4
		titles.add("quick_judge_img");	//5
		titles.add("title_img");	//6
		titles.add("origin_content");	//7
		titles.add("explain_content");	//8
		titles.add("picture_content");	//9
		titles.add("explain_picture_content");	//10
		titles.add("modern_explain_content");	//11
		titles.add("modern_explain_picture_content");	//12
		titles.add("enlightenment");	//13
		titles.add("modern_explain_gua");	//14
		titles.add("duan_yi_tian_ji");	//15
		titles.add("duan_yi_tian_ji_img");	//16
		titles.add("main_idea");	//17
		titles.add("story");	//18
		titles.add("create_time");	//19
		titles.add("update_time");	//20
		dataMap.put("titles", titles);
		List<PageData> varOList = easybookguaService.listAll(pd);
		List<PageData> varList = new ArrayList<PageData>();
		for(int i=0;i<varOList.size();i++){
			PageData vpd = new PageData();
			vpd.put("var1", varOList.get(i).get("ID").toString());	//1
			vpd.put("var2", varOList.get(i).getString("GUA_CODE"));	    //2
			vpd.put("var3", varOList.get(i).getString("NAME"));	    //3
			vpd.put("var4", varOList.get(i).getString("TITLE"));	    //4
			vpd.put("var5", varOList.get(i).getString("QUICK_JUDGE_IMG"));	    //5
			vpd.put("var6", varOList.get(i).getString("TITLE_IMG"));	    //6
			vpd.put("var7", varOList.get(i).getString("ORIGIN_CONTENT"));	    //7
			vpd.put("var8", varOList.get(i).getString("EXPLAIN_CONTENT"));	    //8
			vpd.put("var9", varOList.get(i).getString("PICTURE_CONTENT"));	    //9
			vpd.put("var10", varOList.get(i).getString("EXPLAIN_PICTURE_CONTENT"));	    //10
			vpd.put("var11", varOList.get(i).getString("MODERN_EXPLAIN_CONTENT"));	    //11
			vpd.put("var12", varOList.get(i).getString("MODERN_EXPLAIN_PICTURE_CONTENT"));	    //12
			vpd.put("var13", varOList.get(i).getString("ENLIGHTENMENT"));	    //13
			vpd.put("var14", varOList.get(i).getString("MODERN_EXPLAIN_GUA"));	    //14
			vpd.put("var15", varOList.get(i).getString("DUAN_YI_TIAN_JI"));	    //15
			vpd.put("var16", varOList.get(i).getString("DUAN_YI_TIAN_JI_IMG"));	    //16
			vpd.put("var17", varOList.get(i).getString("MAIN_IDEA"));	    //17
			vpd.put("var18", varOList.get(i).getString("STORY"));	    //18
			vpd.put("var19", varOList.get(i).getString("CREATE_TIME"));	    //19
			vpd.put("var20", varOList.get(i).getString("UPDATE_TIME"));	    //20
			varList.add(vpd);
		}
		dataMap.put("varList", varList);
		ObjectExcelView erv = new ObjectExcelView();
		mv = new ModelAndView(erv,dataMap);
		return mv;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format,true));
	}
	
}
