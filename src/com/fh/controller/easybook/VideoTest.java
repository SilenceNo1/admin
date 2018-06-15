package com.fh.controller.easybook;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.vod.model.v20170321.GetVideoPlayAuthRequest;
import com.aliyuncs.vod.model.v20170321.GetVideoPlayAuthResponse;

import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.DefaultAcsClient;

public class VideoTest {
	GetVideoPlayAuthResponse getVideoPlayAuth(DefaultAcsClient client) {
	    GetVideoPlayAuthRequest request = new GetVideoPlayAuthRequest();
	    request.setVideoId("e30860649f654d6ca3da628dac398f65");
	    GetVideoPlayAuthResponse response = null;
	    try {
	        response = client.getAcsResponse(request);
	    } catch (ServerException e) {
	        throw new RuntimeException("GetVideoPlayAuthRequest Server failed");
	    } catch (ClientException e) {
	    	e.printStackTrace();
	        throw new RuntimeException("GetVideoPlayAuthRequest Client failed");
	    }
	   System.out.println(response.getPlayAuth()); //response.getPlayAuth();              //播放凭证
	   System.out.println(response.getVideoMeta());             //视频Meta信息
	    return response;
	}
	public static void main(String[] args) {
		DefaultProfile profile = DefaultProfile.getProfile("cn-shanghai", "LTAI61NK5Xhi3OYp", "4F4AE4gUds3SynN2VGhCnXsbbG6nfP");
		DefaultAcsClient client = new DefaultAcsClient(profile);
		new VideoTest().getVideoPlayAuth(client).getPlayAuth();
	}
}
