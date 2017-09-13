package com.yueying.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yueying.pojo.User;
import com.yueying.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;

	@RequestMapping("/personlist")
	public String toIndex(HttpServletRequest request, Model model) {
		
		
//		int userId = Integer.parseInt(request.getParameter("id"));
//		User user = this.userService.selectUserById(userId);
//		model.addAttribute("user", user);
		
		
		return "user/person_list";
	}
}




