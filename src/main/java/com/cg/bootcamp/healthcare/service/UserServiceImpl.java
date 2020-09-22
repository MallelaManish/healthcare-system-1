package com.cg.bootcamp.healthcare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bootcamp.healthcare.dao.UserDao;
import com.cg.bootcamp.healthcare.entity.User;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public String register(User user) {
		
		userDao.save(user);
		return null;
	}

	@Override
	public boolean update(User user) {
		
		
		userDao.flush();
		return false;
	}

	@Override
	public boolean delete(int userId) {
		
		userDao.deleteById(userId);
		return false;
	}

	
	@Override
	@Transactional
	public List<User> UsersList() {
		
		
			return userDao.findAll();
		
		
	}

	@Override
	@Transactional
	public Optional<User> FindUser(int userId) {
		
		return userDao.findById(userId);
	}

	@Override
	public Optional<User> loginVerification(int userId, String password) {
		
		String passwordVerification;
		
		passwordVerification=userDao.findById(userId).get().getUserPassword();
		if(passwordVerification==password) {
			return userDao.findById(userId);
		}
		
		else return null;
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
