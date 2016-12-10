package edu.cs.mum.hotelmanagement.service;

import java.util.List;

import edu.cs.mum.hotelmanagement.model.Dinner;

public interface DinnerService {

	Dinner updateDinner(Long id, Dinner dinner);

	List<Dinner> SearchSmokingStatus(String smokingStatus);

	void deleteHotel(Long id);

	List<Dinner> SearchServiceHours(String from, String to);

	List<Dinner> SearchDinner(String cuisine);

	void addNewDinner(Dinner dinner);

	Dinner getDinnerById(Long id);

	List<Dinner> getAllDinners();

}
