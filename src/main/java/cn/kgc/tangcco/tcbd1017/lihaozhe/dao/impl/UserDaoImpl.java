package cn.kgc.tangcco.tcbd1017.lihaozhe.dao.impl;

import cn.kgc.tangcco.tcbd1017.lihaozhe.dao.UserDao;

public class UserDaoImpl implements UserDao {

	@Override
	public void insertUser() {
		System.out.println("持久层保持成功");
	}

	@Override
	public void updateUser() {
		System.out.println("持久层更新成功");
	}
	
}
