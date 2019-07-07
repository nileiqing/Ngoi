package com.art.controller;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.art.common.utils.JsonUtils;
import com.art.common.utils.PictureResult;
import com.art.service.PictureService;


@Controller
@RequestMapping("/pic")
public class PictureController {
	
	@Autowired
	private PictureService pictureService;
	
	@RequestMapping("/upload")
	@ResponseBody
	/**
	 * 尼雷清
	 * 上传图片处理
	 * @param uploadFile
	 * @return
	 */	
	public String upload(MultipartFile uploadFile) throws Exception  {
		//调用service上传图片
		Map result = pictureService.uploadFile(uploadFile);
		//返回上传结果
		String json=JsonUtils.objectToJson(result);
		return json;	
	}
}
