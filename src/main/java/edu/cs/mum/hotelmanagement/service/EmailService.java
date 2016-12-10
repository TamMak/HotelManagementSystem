package edu.cs.mum.hotelmanagement.service;

import org.springframework.mail.SimpleMailMessage;

import edu.cs.mum.hotelmanagement.model.Reservation;

public interface EmailService {
	
	void sendReservationConfermationEmail(Reservation reservation);
	
	void sendGenericEmailMessage(SimpleMailMessage message);

}
