package com.example.mongodemo;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class User {

	  
	  public String id;
	  public String name;
	  public String age;
	  public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public UserAddress address;
//	  public Date dob;

//	public Date getDob() {
//		return dob;
//	}
//
//	public void setDob(Date dob) {
//		this.dob = dob;
//	}

	public UserAddress getAddress() {
		return address;
	}

	public void setAddress(UserAddress address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	  

}
