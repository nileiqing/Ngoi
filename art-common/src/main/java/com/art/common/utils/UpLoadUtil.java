package com.art.common.utils;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class UpLoadUtil {
      /**
       * 于立波
       * 上传图片的工具类
       * @param stream  输入流
       * @param path   上传到服务器的路径
       * @param filename
       * @return
       * @throws IOException
       */
	  public static void SaveFileFromInputStream(InputStream stream,String path,String filename) throws IOException
	    {      
	        FileOutputStream fs=new FileOutputStream( path + filename);
	        byte[] buffer =new byte[1024*1024];
	        int bytesum = 0;
	        int byteread = 0; 
	        while ((byteread=stream.read(buffer))!=-1)
	        {
	           bytesum+=byteread;
	           fs.write(buffer,0,byteread);
	           fs.flush();
	        } 
	        fs.close();
	        stream.close();      
	    }       
}
