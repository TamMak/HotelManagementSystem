package edu.cs.mum.hotelmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cs.mum.hotelmanagement.dao.HotelDao;
import edu.cs.mum.hotelmanagement.service.HotelService;
@Service
public class HotelServiceImpl implements HotelService{
	@Autowired
	private HotelDao hotelDao;

}
