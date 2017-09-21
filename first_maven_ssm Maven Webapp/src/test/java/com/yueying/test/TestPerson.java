package com.yueying.test;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.yueying.pojo.Person;
import com.yueying.pojo.User;
import com.yueying.service.IPersonService;
import com.yueying.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:application.xml" })
public class TestPerson {

	private static Logger logger = Logger.getLogger(TestPerson.class);

	@Resource
	private IPersonService personService = null;
/*
	@Test
	public void test1() {
		for(int i = 0 ; i < 50 ; i ++){
			Person p = new Person();
			p.setName("测试"+i);
			p.setAge(20+i);
			if(i%2==0){
				p.setSex("男");
			}else{
				p.setSex("女");
			}
			
			p.setIncome(2000f+i*1000);
			personService.addPerson(p);
			
		}
	}
	*/
	
	@Test  
    public void queryByPageTest(){  
        PageInfo<Person> page =  personService.queryByPage(1, 10);
        System.out.println(page);
    }

}
