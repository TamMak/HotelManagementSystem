package edu.cs.mum.hotelmanagement.service;

import org.springframework.mail.SimpleMailMessage;

import edu.cs.mum.hotelmanagement.model.Reservation;

public abstract class AbstractEmailService implements EmailService {

	protected SimpleMailMessage	prepareConfermationMessage(Reservation reservation) {
		
		SimpleMailMessage message = new SimpleMailMessage();		
		message.setFrom("mussiestick@gmail.com");
		//to be changed later
		message.setTo("mussiestick@gmail.com");//reservation.getGuest().getEmail());
		message.setSubject("MET Reservation Confermation of ");//+ reservation.getGuest().getFirstName());
//		message.setText("Date: " + new Date() +"\n" +
//		                "Reservation Number: " +reservation.getReservationNumber()+"\n" +
//		                "Room Number: " +reservation.getRooms().get(0).getRoomNumber()+"\n" +
//		                "Check in date: " +reservation.getCheckInDate()+"\n" +
//		                "Check out date: " +reservation.getCheckOutDate()+"\n" +
//		                "paid amount: " +reservation.getPayment().getAmount()+"\n" +		                
//		                "we are happy to welcome you!"
//				);
		
		message.setText( "we are happy to welcome you!"	);
		
		return message;
			}
	
	
	
	@Override
	public void sendReservationConfermationEmail(Reservation reservation) {
		sendGenericEmailMessage(prepareConfermationMessage(reservation));

	}

}
