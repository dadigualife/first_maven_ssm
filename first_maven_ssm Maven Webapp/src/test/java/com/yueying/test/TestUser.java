package com.yueying.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yueying.pojo.User;
import com.yueying.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestUser {

	private static Logger logger = Logger.getLogger(TestUser.class);

	@Resource
	private IUserService userService = null;

	@Test
	public void test1() {
		User user = userService.selectUserById(1);
	}

}
