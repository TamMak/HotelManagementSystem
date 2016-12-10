package edu.cs.mum.hotelmanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.cs.mum.hotelmanagement.dao.PaymentDao;
import edu.cs.mum.hotelmanagement.model.Card;
import edu.cs.mum.hotelmanagement.model.Payment;
import edu.cs.mum.hotelmanagement.service.PaymentService;

public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	PaymentDao paymentDao;

	@Override
	public List<Payment> getAll() {

		List<Payment> PaymentLists = (List<Payment>) paymentDao.findAll();
		return PaymentLists.size() != 0? PaymentLists : new ArrayList<>();
		
	}

	@Override
	public Payment findMyPaymentByReservationNumber(String reservationNumber) {
		
		return paymentDao.findMyPaymentByReservationNumbeReservationNumber(reservationNumber);
	}

	@Override
	public Payment save(Payment payment) {		
		return paymentDao.save(payment);
	}

}
