package com.art.service.impl;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.art.common.utils.FtpUtil;
import com.art.common.utils.IDUtils;
import com.art.common.utils.UpLoadUtil;
import com.art.service.PictureService;
@Service
public class PictureServiceImpl implements PictureService {
	@Value("${FTP_ADDRESS}")
	private String FTP_ADDRESS;//图片的访问路径（即nginx的访问路径)
	@Value("${FTP_PORT}")
	private Integer FTP_PORT;//端口号
	@Value("${FTP_USERNAME}")
	private String FTP_USERNAME;//用户名
	@Value("${FTP_PASSWORD}")
	private String FTP_PASSWORD;//密码
	@Value("${FTP_BASE_PATH}")
	private String FTP_BASE_PATH;//基础路径
	@Value("${IMAGE_BASE_URL}")
	private String IMAGE_BASE_URL;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PictureServiceImpl.class);
	
	@Override
	/**
	 * 尼雷清
	 * 上传图片
	 */
	public Map uploadFile(MultipartFile uploadFile) throws Exception {
		Map resultMap=new HashMap<>();
		try {
			//生成一个新的文件名
			//取原始文件名
			String oldName=uploadFile.getOriginalFilename();
			//生成新的文件名
			String newName=IDUtils.genImageName();
			newName=newName+oldName.substring(oldName.lastIndexOf("."));
			String filePath=new DateTime().toString("/yyyy/MM/dd");
			//图片上传
			boolean result=FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USERNAME, FTP_PASSWORD, FTP_BASE_PATH, 
					filePath, newName, uploadFile.getInputStream());
			//返回结果
			LOGGER.info("日志已经生效。");
			LOGGER.info("图片上传的结果为：", result);
			if(!result) {
				resultMap.put("error", 1);
				resultMap.put("message", "文件上传失败");
				return resultMap;
			}else {
				resultMap.put("error", 0);
				resultMap.put("url", IMAGE_BASE_URL+filePath+"/"+newName);
				return resultMap;
			}
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.error("图片上传出现异常", e);
			resultMap.put("error", 1);
			resultMap.put("message", "文件上传异常");
			return resultMap;
		}
		
}
}