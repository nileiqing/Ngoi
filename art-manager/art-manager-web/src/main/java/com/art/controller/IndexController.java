package com.art.controller;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
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
	@RequestMapping("/{page}")
	public String showpage(@PathVariable String page, Model model ) {
		model.addAttribute("hiddentype", 0);
		return page;
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

