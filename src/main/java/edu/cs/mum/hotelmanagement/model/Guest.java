package edu.cs.mum.hotelmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Guest extends Person {

	
	private Long id;
	String guestNumber;

	public Guest() {
				
	}

	public String getGuestNumber() {
		return guestNumber;
	}

	public void setGuestNumber(String guestNumber) {
		this.guestNumber = guestNumber;
	}
	
	
}
