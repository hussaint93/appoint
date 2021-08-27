package com.tcs.appointment.Appointment.repository;

import org.springframework.data.repository.CrudRepository;

import com.tcs.appointment.Appointment.entity.User;

public interface UserRepository extends CrudRepository<User,Integer>{

}
