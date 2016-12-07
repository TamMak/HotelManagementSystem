package edu.cs.mum.hotelmanagement.service;

import java.util.List;

import edu.cs.mum.hotelmanagement.model.Guest;
import edu.cs.mum.hotelmanagement.model.Person;


public interface GuestService {

	Guest getGuestById(long id);
	Guest getUserByEmail(String email);
	List<Guest> getAllUsers();
	Guest saveUser(Guest person);
	Guest updateUser(long id);
	void deleteUser(long id);
}
