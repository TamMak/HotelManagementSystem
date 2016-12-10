package edu.cs.mum.hotelmanagement.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cs.mum.hotelmanagement.dao.HotelDao;
import edu.cs.mum.hotelmanagement.model.Address;
import edu.cs.mum.hotelmanagement.model.Hotel;
import edu.cs.mum.hotelmanagement.service.HotelService;

@Service
@Transactional
public class HotelServiceImpl implements HotelService{
	@Autowired
	private HotelDao hotelDao;

	@Override
	public List<Hotel> getAllHotels() {
		
		return hotelDao.findAll();
	}

	@Override
	public Hotel getHotelById(Long id) {
		
		return hotelDao.getOne(id);
	}

	@Override
	public void addNewHotel(Hotel hotel) {
		hotelDao.save(hotel);
		
	}

	@Override
	public List<Hotel> SearchHotel(Address address) {
		List<Hotel> hotel = hotelDao.findByAddress(address);
		return hotel;
	}

	@Override
	public Hotel updateHotel(Long id, Hotel hotel) {
		
		return hotelDao.save(hotel);
	}

	@Override
	public void deleteHotel(Long id) {
		hotelDao.delete(id);
		
	}

}
