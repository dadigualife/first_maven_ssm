package com.yueying.service;

import com.yueying.pojo.User;

public interface IUserService {
	
	public User selectUserById(Integer userId);
	
	public boolean selectUserByName(String userName,String password);
	
	public int addUser(User user);

}
