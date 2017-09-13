package com.yueying.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yueying.dao.IUserDao;
import com.yueying.pojo.User;
import com.yueying.service.IUserService;


@Service("userService")
public class UserServiceImpl implements IUserService{
	
	 @Resource  
	 private IUserDao userDao;

	@Override
	public User selectUserById(Integer userId) {
		// TODO Auto-generated method stub
		return userDao.selectUserById(userId);
	}
	
	
	@Override
	public boolean selectUserByName(String userName,String password) {
		// TODO Auto-generated method stub
		
		User user = userDao.selectUserByName(userName);
		
		if(user == null){
			return false;
		}else{
			if(user.getUserPassword().equals(password)){
				return true;
			}else{
				return false;
			}
		}
		
	}


	@Override
	public int addUser(User user) {
		
		return userDao.addUser(user);
	}  

}
