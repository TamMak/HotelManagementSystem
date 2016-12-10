package edu.cs.mum.hotelmanagement.service;

import java.util.List;

import edu.cs.mum.hotelmanagement.model.Dinner;

public interface DinnerService {
	List<Dinner> getAllDinners();

	Dinner getDinnerById(Long id);

	void addNewDinner(Dinner dinner);

	List<Dinner> SearchDinner(String cuisine);
	
	List<Dinner> SearchServiceHours(String from, String to);
	
	List<Dinner> SearchSmokingStatus(String smokingStatus);
	
	Dinner updateDinner(Long id, Dinner dinner);

	void deleteHotel(Long id);

}
