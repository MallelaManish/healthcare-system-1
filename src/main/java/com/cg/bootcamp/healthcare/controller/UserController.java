package com.cg.bootcamp.healthcare.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bootcamp.healthcare.entity.User;
import com.cg.bootcamp.healthcare.service.UserServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	private UserServiceImpl userService;
	
	//To save new user
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody User user) {
		
		userService.register(user);
		return new ResponseEntity<String>("Working",HttpStatus.OK);
	}
	
	//To update user information
	@PutMapping()
	public ResponseEntity<Boolean> update(User user){
		
		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	}
	
	//To Delete user
	@DeleteMapping("deleteuser/{userId}")
	public ResponseEntity<Boolean> delete(@PathVariable int userId ){
		
		userService.delete(userId);
		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	}
	
	//To Find particular User
	@GetMapping("/User/{userId}")
	public ResponseEntity<Optional<User>> loginContoller(@PathVariable int userId)
	{
		Optional<User> user=userService.FindUser(userId);
		if(user.isPresent())
			return new ResponseEntity<Optional<User>>(user,HttpStatus.OK);
		  return new ResponseEntity<Optional<User>>(user,HttpStatus.NOT_FOUND);
	}

	
	//List of Users
	@GetMapping("/usersList")
	public ResponseEntity<List<User>> loginDetails()
	{
		List<User> users=userService.UsersList();
		if(users.isEmpty())
			return new ResponseEntity<List<User>>(users,HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<User>>(users ,HttpStatus.OK);
		
		
	}
	
	
	
	
}
