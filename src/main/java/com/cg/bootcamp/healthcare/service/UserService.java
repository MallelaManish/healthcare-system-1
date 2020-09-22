package com.cg.bootcamp.healthcare.service;

import java.util.List;
import java.util.Optional;

import com.cg.bootcamp.healthcare.entity.User;

public interface UserService {
	
	public String register(User user);
	
	public boolean update(User user);
	
	public boolean delete(int userId);
	
	public List<User> UsersList();
	
	public Optional<User> FindUser(int userId);
	
}
