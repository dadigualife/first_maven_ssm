package com.yueying.service;

import java.util.List;

import javax.xml.registry.infomodel.PersonName;

import com.yueying.pojo.Person;

public interface IPersonService {
	
	public List<Person> selectAllPerson();
	
	public int addPerson(Person person);
	
	public int deletePerson(int id);
	
	public Person selectPersonById(int id);
	
	public int updatePerson(Person person);

}
