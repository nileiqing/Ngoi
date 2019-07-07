package com.art.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.art.common.pojo.ArtResult;
import com.art.pojo.TUser;
import com.art.service.UserService;

@Controller
public class UserController {
@Autowired
private UserService  UserService;
/**
 * 根据用户名查询用户信息
 * @author lb_yu
 *
 */
@RequestMapping("/checkuser")
public String checkuser(TUser user,HttpServletRequest request){
	TUser user_C=UserService.findUser(user.getUsername());
	if(user_C==null){
	return "login";
}
else{
	String password_C=user_C.getPassword();
	if(user.getPassword().equals(password_C)){
		request.getSession().setAttribute("username", user.getUsername());
		return "index";
	}
	else{
		return "login";
	}
}
}
/**
 * 于立波
 * 添加人员
 * @param user
 * @return
 */
@RequestMapping("/adduser")
@ResponseBody
public ArtResult addUser(TUser user){
	ArtResult result=UserService.addUser(user);
	return result;
}
/**
 * 于立波
 * 更新人员
 * @param user
 * @return
 */
@RequestMapping("/updateuser")
@ResponseBody
public ArtResult updateuser(TUser user,HttpSession session){
	Long id=(Long) session.getAttribute("id");
	user.setId(id);
	ArtResult result=UserService.updateUser(user);
	//返回码为200则同步session
	if(result.getStatus()==200){
		session.setAttribute("username", user.getUsername());
		return result;
	}
	return result;
}
}
