package edu.cs.mum.hotelmanagement.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Payment {
	  
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long id;
	  private String reservationNumber;
	  private double amount;
	  private Date paymentDate;
	  
	 private boolean paid = false;
	 
	 @ManyToOne(fetch = FetchType.EAGER)
	 private Card card;
	 
	 @OneToOne(mappedBy = "payment",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	 private Reservation reservation;
	 
	   
	public Payment() {
				
	}
	
	//to be done
	public boolean pay(double price) {
		
		return paid;
	}
	
	
	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Long getId() {
		return id;
	}

	public String getReservationNumber() {
		return reservationNumber;
	}
	public void setReservationNumber(String reservationNumber) {
		this.reservationNumber = reservationNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}	
	   
	
}
