package edu.cs.mum.hotelmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.cs.mum.hotelmanagement.model.Payment;

@Repository
public interface PaymentDao  extends JpaRepository<Payment, Long>{
	
	@Query("SELECT a FROM Payment a WHERE a.reservationNumber = :reservationNumber")
	public Payment findMyPaymentByReservationNumbeReservationNumber(
								@Param (value="reservationNumber")String reservationNumber);

}
