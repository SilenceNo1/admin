package com.fh.controller.information.pictures;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.fh.service.information.pictures.OssService;

/**
 * 上传图片处理
 * <p>Title: OssController</p>
 * <p>Description: </p>
 * <p>Company: www.kcallme.com</p> 
 * @author	贾鑫
 * @date	2015年9月4日下午3:18:33
 * @version 1.0
 */
@Controller
public class OssController {

	@Autowired
	private OssService ossService;
	
	 @RequestMapping(value="/upPhoto",method = RequestMethod.POST)
	 @ResponseBody
	public Map<String,Object> pictureUpload(@RequestParam(value="file",required=false) MultipartFile uploadFile) {
		Map<String,Object> result = ossService.uploadPicture(uploadFile,true,"");
		return result;
	}
	 @RequestMapping(value="/gua/upPhoto",method = RequestMethod.POST)
	 @ResponseBody
	public Map<String,Object> guaPictureUpload(@RequestParam(value="file",required=false) MultipartFile uploadFile) {
		Map<String,Object> result = ossService.uploadPicture(uploadFile,true,"gua");
		return result;
	}
}
