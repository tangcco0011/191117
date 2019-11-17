package cn.kgc.tangcco.tcbd1017.lihaozhe.dao;

import org.junit.Test;

import cn.kgc.tangcco.tcbd1017.lihaozhe.dao.impl.UserDaoImpl;

public class UserDaoTest {
	private UserDao userDao = new UserDaoImpl();
	@Test
	public void insertUser() {
		userDao.insertUser();
	}
	
}
