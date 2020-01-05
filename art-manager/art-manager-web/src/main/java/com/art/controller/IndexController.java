package com.art.controller;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.art.pojo.TUser;
import com.art.service.UserService;

@Controller
public class IndexController {
	@Autowired
	private UserService UserService;
	@RequestMapping("/")
	public String showIndex() {
		return "login";
	}
	/**
	 * 于立波
	 * 跳转到登录页面
	 * @return
	 */
	@RequestMapping("/login")
	public ModelAndView login(){
		ModelAndView  modelAndView=new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;	
	}
	/**
	 * 于立波
	 * 退出
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/logout")
	public String logout(HttpSession session) throws Exception {
	// 清除session
	session.invalidate();
    // 重定向到商品列表页面
	 return "login";
}
	/**
	 * 于立波
	 * 展示其他页面
	 * <p>Title: showpage</p>
	 * <p>Description: </p>
	 * @param page
	 * @return
	 */
	//一级路径
	@RequestMapping("/{page}")
	public String showpage(@PathVariable String page, Model model ) {
		return page;
	}
	/*
	* 由于用的Jsp并没有前后端分离
	* 此处还需进行页面跳转的控制,为简化页面跳转进行如下页面跳转，只固定对应文件夹的开头 home team 等
	* 如不固定开头会影响到 js css 等静态资源的映射路径
	* */
	//二级路径
	@RequestMapping("/home/{dirpath}/{filepath}")
	public ModelAndView showhomepage(@PathVariable String dirpath,@PathVariable String filepath,String categoryId ) {
		ModelAndView modelAndView=new ModelAndView();
		String path="home/" + dirpath;
		modelAndView.addObject("categoryId",categoryId);
		modelAndView.addObject("path",path);
		modelAndView.setViewName(path + "/" + filepath);
		return modelAndView;
	}
	//二级路径
	@RequestMapping("/team/{dirpath}/{filepath}")
	public ModelAndView showteampage(@PathVariable String dirpath,@PathVariable String filepath,String categoryId ) {
		ModelAndView modelAndView=new ModelAndView();
		String path="team/" + dirpath;
		modelAndView.addObject("categoryId",categoryId);
		modelAndView.addObject("path",path);
		modelAndView.setViewName(path+"/"+filepath);
		return modelAndView;
	}
	//二级路径
	@RequestMapping("/team/{dirpath1}/{dirpath2}/{filepath}")
	public ModelAndView showteamalumipage(@PathVariable String dirpath1,@PathVariable String dirpath2,@PathVariable String filepath,String categoryId ) {
		ModelAndView modelAndView=new ModelAndView();
		String path="team/" + dirpath1+"/"+dirpath2;
		modelAndView.addObject("categoryId",categoryId);
		modelAndView.addObject("path",path);
		modelAndView.setViewName(path+"/"+filepath);
		return modelAndView;
	}
	//二级路径
	@RequestMapping("/research/{filepath}")
	public ModelAndView showresearchpage(@PathVariable String filepath,String categoryId ) {
		ModelAndView modelAndView=new ModelAndView();
		String path="research";
		modelAndView.addObject("categoryId",categoryId);
		modelAndView.addObject("path",path);
		modelAndView.setViewName(path+"/"+filepath);
		return modelAndView;
	}
	//二级路径
	@RequestMapping("/publication/{dirpath}/{filepath}")
	public ModelAndView showpublicationpage(@PathVariable String dirpath,@PathVariable String filepath,String categoryId ) {
		ModelAndView modelAndView=new ModelAndView();
		String path="publication/" + dirpath;
		modelAndView.addObject("categoryId",categoryId);
		modelAndView.addObject("path",path);
		modelAndView.setViewName(path+"/"+filepath);
		return modelAndView;
	}
	//二级路径
	@RequestMapping("/frame/{dirpath}/{filepath}")
	public ModelAndView showframepage(@PathVariable String dirpath,@PathVariable String filepath,String categoryId ) {
		ModelAndView modelAndView=new ModelAndView();
		String path="frame/" + dirpath;
		modelAndView.addObject("categoryId",categoryId);
		modelAndView.addObject("path",path);
		modelAndView.setViewName(path+"/"+filepath);
		return modelAndView;
	}
	//二级路径
	@RequestMapping("/events/{dirpath}/{filepath}")
	public ModelAndView showeventspage(@PathVariable String dirpath,@PathVariable String filepath,String categoryId ) {
		ModelAndView modelAndView=new ModelAndView();
		String path="events/" + dirpath;
		modelAndView.addObject("categoryId",categoryId);
		modelAndView.addObject("path",path);
		modelAndView.setViewName(path+"/"+filepath);
		return modelAndView;
	}
	//一级路径
	@RequestMapping("/activities/{filepath}")
	public ModelAndView showactivitiespage(@PathVariable String filepath,String categoryId ) {
		ModelAndView modelAndView=new ModelAndView();
		String path="activities";
		modelAndView.addObject("categoryId",categoryId);
		modelAndView.addObject("path",path);
		modelAndView.setViewName(path+"/"+filepath);
		return modelAndView;
	}
	//一级路径
	@RequestMapping("/contact/{filepath}")
	public ModelAndView showcontactpage(@PathVariable String filepath,String categoryId ) {
		ModelAndView modelAndView=new ModelAndView();
		String path="contact";
		modelAndView.addObject("categoryId",categoryId);
		modelAndView.addObject("path",path);
		modelAndView.setViewName(path+"/"+filepath);
		return modelAndView;
	}
	//一级路径
	@RequestMapping("/open_position/{filepath}")
	public ModelAndView showopenpositionpage(@PathVariable String filepath,String categoryId ) {
		ModelAndView modelAndView=new ModelAndView();
		String path="open_position";
		modelAndView.addObject("categoryId",categoryId);
		modelAndView.addObject("path",path);
		modelAndView.setViewName(path+"/"+filepath);
		return modelAndView;
	}
	/**
	 * 于立波 
	 * 跳转到修改人员信息界面
	 * @param session
	 * @return
	 */
	@RequestMapping("/user-editjsp")
	public ModelAndView showUserInfo(HttpSession session) {
		ModelAndView modelAndView=new ModelAndView();
		String username = (String) session.getAttribute("username");
		TUser user=UserService.findUser(username);
		session.setAttribute("id", user.getId());
		modelAndView.addObject("userInfo", user);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String createtime=sdf.format(user.getCreated());
		String updatetime=sdf1.format(user.getUpdated());
		modelAndView.addObject("createtime", createtime);
		modelAndView.addObject("updatetime", updatetime);
		modelAndView.setViewName("user-edit");
		return modelAndView;	
	}
}

