package com.roam.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.roam.entity.User;
import com.roam.service.UserService;

public class UserServiceTest extends SpringTestCase {
	@Autowired(required=true)
	private UserService userService;

	@Test
	public void selectUserByIdTest() {
		User user = userService.selectUserById(1);
		System.out.println(user.getUserName() + ":" + user.getUserPassword());
	}
}
