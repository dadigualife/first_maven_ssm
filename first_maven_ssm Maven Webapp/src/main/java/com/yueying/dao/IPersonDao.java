package com.yueying.dao;

import java.util.List;

import com.yueying.pojo.Person;


public interface IPersonDao {
	
	//查询person列表
	public List<Person> selectAllPerson();
	
	//通过id删除Person
	public int deletePersonById(int id);
	
	//新增Person
	public int addPerson(Person person);
	
	//查询person通过id
	public Person selectPersonById(int id);
	
	//修改person
	public int updatePerson(Person person);
	
	

}
