package com.fh.service.information.pictures;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

public interface OssService {

	Map<String,Object> uploadPicture(MultipartFile uploadFile,boolean isOldName,String gua);
}
