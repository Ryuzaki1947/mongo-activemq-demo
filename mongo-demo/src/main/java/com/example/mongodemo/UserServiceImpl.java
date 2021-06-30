package com.example.mongodemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl {
	@Autowired
	UserRepo userRepo;
	@Autowired
	JMSmsg jmsmsg;
	String save(User user) {
		User saved=userRepo.save(user);
		jmsmsg.sender(user);
		
		return saved.id;
		
	}

}
