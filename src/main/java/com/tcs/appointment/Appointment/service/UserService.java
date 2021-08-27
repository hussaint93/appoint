package com.tcs.appointment.Appointment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.appointment.Appointment.entity.User;
import com.tcs.appointment.Appointment.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;

	public User saveUser(User user) {
		
		return userRepo.save(user);
	}
	
	
}
