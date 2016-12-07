package edu.cs.mum.hotelmanagement.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Guest extends Person {

	private String guestNumber;

	@OneToMany(mappedBy = "guest")
	private List<SavedReservation> savedReservations;

	public Guest(String firstName,String lastName,String email, String phoneNumber,String password,String guestNumber){
		super(firstName,lastName,email,phoneNumber,password);
		this.guestNumber = guestNumber;
		this.savedReservations =new ArrayList<>();
	}


	public String getGuestNumber() {
		return guestNumber;
	}


	public void setGuestNumber(String guestNumber) {
		this.guestNumber = guestNumber;
	}


	public List<SavedReservation> getSavedReservations() {
		return savedReservations;
	}

	public void setSavedReservations(List<SavedReservation> savedReservations) {
		this.savedReservations = savedReservations;
	}

	public void addReservations(SavedReservation savedReservation){
		this.savedReservations.add(savedReservation);
	}
}

