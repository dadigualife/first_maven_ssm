package com.yueying.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yueying.pojo.User;
import com.yueying.service.IUserService;




@Controller
@RequestMapping("/")
public class LoginRegisterController {
	
	@Resource
	private IUserService userService;

	@RequestMapping("/login")
	public String toIndex(HttpServletRequest request,HttpSession session) {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");;
		
		boolean flag = this.userService.selectUserByName(username, password);
		
		if(flag){
			User u = new User();
			u.setUserName(username);
			u.setUserPassword(password);
			session.setAttribute("user", u);
			
			return "redirect:/person/personlist";
		}else {
			return "login";
		}
		
		
//		int userId = Integer.parseInt(request.getParameter("id"));  获取地址栏后的参数
//		User user = this.userService.selectUserById(userId);
//		model.addAttribute("user", user);
		
	}
	
	
	@RequestMapping("/initregister")
	public String initRegister(){
		
		return "user/register";
	}
	
	
	@RequestMapping("/register")
	public String register(HttpServletRequest request){
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		String secondPassword = request.getParameter("secondpassword");
		
		if(password.equals(secondPassword)){
			User user = new User();
			user.setUserName(userName);
			user.setUserPassword(password);
			int t = userService.addUser(user);
			
			return "login";
		}else{
			return "user/register";
		}
		
		
	}
	
	
	

}
