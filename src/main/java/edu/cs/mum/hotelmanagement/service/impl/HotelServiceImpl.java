package edu.cs.mum.hotelmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cs.mum.hotelmanagement.dao.HotelDao;
import edu.cs.mum.hotelmanagement.dao.RoomDao;
import edu.cs.mum.hotelmanagement.service.hotelService;
@Service
public class HotelServiceImpl implements hotelService{
	@Autowired
	private HotelDao hotelDao;

}
