package com.yueying.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yueying.dao.IPersonDao;
import com.yueying.dao.IUserDao;
import com.yueying.pojo.Person;
import com.yueying.pojo.User;
import com.yueying.service.IPersonService;
import com.yueying.service.IUserService;

@Service("personService")
public class PersonServiceImpl implements IPersonService {

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

	@Override
	public PageInfo<Person> queryByPage(Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null ? 1 : pageNo;
		pageSize = pageSize == null ? 10 : pageSize;
		PageHelper.startPage(pageNo, pageSize);
		List<Person> list = personDao.selectAllPerson();
		// 用PageInfo对结果进行包装
		PageInfo<Person> page = new PageInfo<Person>(list);
		// 测试PageInfo全部属性
//		System.out.println(page.getPageNum());
//		System.out.println(page.getPageSize());
//		System.out.println(page.getStartRow());
//		System.out.println(page.getEndRow());
//		System.out.println(page.getTotal());
//		System.out.println(page.getPages());
//		System.out.println(page.getFirstPage());
//		System.out.println(page.getLastPage());
//		System.out.println(page.isHasPreviousPage());
//		System.out.println(page.isHasNextPage());
		return page;
	}

}
