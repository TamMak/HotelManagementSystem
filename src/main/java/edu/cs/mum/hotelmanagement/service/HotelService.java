package edu.cs.mum.hotelmanagement.service;

import java.util.List;

import edu.cs.mum.hotelmanagement.model.Address;
import edu.cs.mum.hotelmanagement.model.Hotel;

public interface HotelService {
	List<Hotel> getAllHotels();

	Hotel getHotelById(Long id);

	void addNewHotel(Hotel hotel);

	List<Hotel> SearchHotel(Address address);

	Hotel updateHotel(Long id, Hotel hotel);

	void deleteHotel(Long id);

}
