package com.roam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roam.dao.UserDao;
import com.roam.entity.User;
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
	@Autowired  
    private UserDao userDao;
	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId);
	}

}
