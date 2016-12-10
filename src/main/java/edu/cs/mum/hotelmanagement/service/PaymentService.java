package edu.cs.mum.hotelmanagement.service;

import java.util.List;

import edu.cs.mum.hotelmanagement.model.Card;
import edu.cs.mum.hotelmanagement.model.Payment;

public interface PaymentService {
	
	public List<Payment> getAll();

	public Payment findMyPaymentByReservationNumber(String reservationNumber);

	public Payment save(Payment payment);

}
