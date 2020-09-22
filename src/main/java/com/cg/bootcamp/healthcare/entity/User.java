package com.cg.bootcamp.healthcare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="user")
@SequenceGenerator(name="user_id",initialValue=1,allocationSize=1)
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="user_id")
	@Column(name="user_id")
	private int userId;
	@Column(name="user_password")
	private String userPassword;
	@Column(name="user_name")
	private String userName;
	@Column(name="user_contactnumber")
	private double UserContactNumber;
	@Column(name="user_email")
	private String userEmail;
	@Column(name="user_age")
	private int userAge;
	@Column(name="user_gender")
	private String gender;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public User(String userPassword, String userName, double userContactNumber, String userEmail) {
		super();
		this.userPassword = userPassword;
		this.userName = userName;
		UserContactNumber = userContactNumber;
		this.userEmail = userEmail;
	}



	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getUserContactNumber() {
		return UserContactNumber;
	}
	public void setUserContactNumber(double userContactNumber) {
		UserContactNumber = userContactNumber;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
	
	

}
