package edu.cs.mum.hotelmanagement.service;

import java.util.List;

import edu.cs.mum.hotelmanagement.model.Address;
import edu.cs.mum.hotelmanagement.model.Hotel;

public interface HotelService {

	List<Hotel> getAllHotels();

	Hotel getHotelById(Long id);

	void addNewHotel(Hotel hotel);

	Hotel updateHotel(Long id, Hotel hotel);

	List<Hotel> SearchHotel(Address address);

	void deleteHotel(Long id);

}
