package com.cg.bootcamp.healthcare.service;

import com.cg.bootcamp.healthcare.entity.User;

public interface UserService {
	
	public String register(User user);
	
	public boolean update(User user);
	
	public boolean delete(User user);
	
}
