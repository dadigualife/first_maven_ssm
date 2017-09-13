package com.yueying.dao;

import com.yueying.pojo.User;

public interface IUserDao {
	
	 /**
     * @param userId
     * @return User
     */
    public User selectUserById(Integer userId);
    
    public User selectUserByName(String userName);
    
    public int addUser(User user);

}
