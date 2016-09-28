package com.roam.dao;

import com.roam.entity.User;

public interface UserDao {
	/** * @param userId * @return User */
    public User selectUserById(Integer userId);  
}
