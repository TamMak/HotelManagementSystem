package edu.cs.mum.hotelmanagement.service;

import java.util.List;

import edu.cs.mum.hotelmanagement.model.Guest;


public interface GuestService {

	Guest getGuestById(long id);
	Guest getGuestByEmail(String email);
	List<Guest> getAllGuests();
	Guest saveGuest(Guest person);
	Guest updateGuest(long id);
	void deleteGuest(long id);
}
