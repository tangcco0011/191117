package cn.kgc.tangcco.tcbd1017.lihaozhe.service;

import org.junit.Test;

import cn.kgc.tangcco.tcbd1017.lihaozhe.service.impl.UserServiceImpl;

public class UserServiceTest {
	private UserService userService = new UserServiceImpl();
	@Test
	public void saveUser() {
		userService.saveUser();
	}
	@Test
	public void updateUser() {
		userService.updateUser();
	}
}
