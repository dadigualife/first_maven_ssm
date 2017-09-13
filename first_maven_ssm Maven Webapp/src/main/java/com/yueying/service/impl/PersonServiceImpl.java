package com.yueying.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yueying.dao.IPersonDao;
import com.yueying.dao.IUserDao;
import com.yueying.pojo.Person;
import com.yueying.pojo.User;
import com.yueying.service.IPersonService;
import com.yueying.service.IUserService;


@Service("personService")
public class PersonServiceImpl implements IPersonService{
	
	 @Resource  
	 private IPersonDao personDao;

	@Override
	public List<Person> selectAllPerson() {
		
		return personDao.selectAllPerson();
	}

	@Override
	public int addPerson(Person person) {
		
		return personDao.addPerson(person);
	}

	@Override
	public int deletePerson(int id) {
		
		return personDao.deletePersonById(id);
	}

	@Override
	public Person selectPersonById(int id) {
		
		return personDao.selectPersonById(id);
	}

	@Override
	public int updatePerson(Person person) {
		
		return personDao.updatePerson(person);
	}

	
	
	
	
}
