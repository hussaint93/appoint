package com.tcs.appointment.Appointment.repository;

import org.springframework.data.repository.CrudRepository;

import com.tcs.appointment.Appointment.entity.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment,Integer>{

}
