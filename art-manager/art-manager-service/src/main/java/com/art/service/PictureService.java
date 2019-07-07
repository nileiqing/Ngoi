package com.art.service;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

public interface PictureService {
  /**
   * 于立波
   * 上传图片
   * @param uploadFile
   * @return
   * @throws Exception
   */
	Map  uploadFile(MultipartFile uploadFile)throws Exception;
}
