package com.yueying.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yueying.pojo.Person;
import com.yueying.pojo.User;
import com.yueying.service.IPersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	@Resource
	private IPersonService personService;

	@RequestMapping("/personlist")
	public String personList(HttpServletRequest request) {
		
		
//		int userId = Integer.parseInt(request.getParameter("id"));
//		User user = this.userService.selectUserById(userId);
//		model.addAttribute("user", user);
		List<Person> personList = personService.selectAllPerson();
		request.setAttribute("personlist", personList);
//		model.addAttribute("personlist", personList);
		User u = (User) request.getSession().getAttribute("user");
		request.setAttribute("username", u.getUserName());
//		model.addAttribute("username", u.getUserName());
		
		
		return "person/person_list";
	}
	
	
	@RequestMapping("/addperson")
	public String addPerson(HttpServletRequest request) {
		
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String sex = request.getParameter("sex");
		float income = Float.parseFloat(request.getParameter("income"));
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setSex(sex);
		person.setIncome(income);
		
		int t = personService.addPerson(person);
		
		if(t == 1){
			
		}else{
			
		}
		
		return "redirect:personlist";
	}
	
	
	
	@RequestMapping("/initaddperson")
	public String initAddPerson() {
		
		return "person/person_add";
	}
	
	
	@RequestMapping("/deleteperson")
	public String deletePerson(HttpServletRequest request) {
		
		
		int id = Integer.parseInt(request.getParameter("ids"));
		int t = personService.deletePerson(id);
		
		if(t == 1){
			
		}else{
			
		}
		
		
		return "redirect:personlist";
	}
	
	
	@RequestMapping("/initupdateperson")
	public String initUpdatePerson(HttpServletRequest request) {
		
		
		int id = Integer.parseInt(request.getParameter("id"));
		Person person = personService.selectPersonById(id);
		
		if(person == null){
			
		}else{
			
		}
		
		request.setAttribute("person", person);
		
		
		return "person/person_update";
	}
	
	@RequestMapping("/updateperson")
	public String updatePerson(HttpServletRequest request) {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String sex = request.getParameter("sex");
		float income = Float.parseFloat(request.getParameter("income"));
		
		Person person = new Person();
		person.setId(id);
		person.setName(name);
		person.setAge(age);
		person.setSex(sex);
		person.setIncome(income);
		
		int t = personService.updatePerson(person);
		
		if(t == 1){
			
		}else{
			
		}
		
		
		return "redirect:personlist";
	}
	
}




