package edu.cs.mum.hotelmanagement.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Guest extends Person {

	private String guestNumber;

	@OneToMany(mappedBy = "guest")
	private List<SavedRoom> savedRooms;

	public Guest(String firstName,String lastName,String email, String phoneNumber,String password,String guestNumber){
		super(firstName,lastName,email,phoneNumber,password);
		this.guestNumber = guestNumber;
		this.savedRooms =new ArrayList<>();
	}


	public String getGuestNumber() {
		return guestNumber;
	}


	public void setGuestNumber(String guestNumber) {
		this.guestNumber = guestNumber;
	}


	public List<SavedRoom> getSavedRoom() {
		return savedRooms;
	}

	public void setSavedReservations(List<SavedRoom> savedRooms) {
		this.savedRooms = savedRooms;
	}

	public void addReservations(SavedRoom savedRoom){
		this.savedRooms.add(savedRoom);
	}
}

