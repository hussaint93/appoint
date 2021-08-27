package com.tcs.appointment.Appointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.appointment.Appointment.entity.User;
import com.tcs.appointment.Appointment.service.UserService;

@RestController
@ControllerAdvice
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/use")
	public User SaveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
}
