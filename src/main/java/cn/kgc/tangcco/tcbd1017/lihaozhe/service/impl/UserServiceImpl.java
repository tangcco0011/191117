package cn.kgc.tangcco.tcbd1017.lihaozhe.service.impl;

import cn.kgc.tangcco.tcbd1017.lihaozhe.dao.UserDao;
import cn.kgc.tangcco.tcbd1017.lihaozhe.dao.impl.UserDaoImpl;
import cn.kgc.tangcco.tcbd1017.lihaozhe.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();
	@Override
	public void saveUser() {
		System.out.println("开启事务");
		userDao.insertUser();
		System.out.println("提交事务");
	}

}
