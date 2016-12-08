package edu.cs.mum.hotelmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cs.mum.hotelmanagement.dao.DinnerDao;
import edu.cs.mum.hotelmanagement.dao.RoomDao;
import edu.cs.mum.hotelmanagement.service.dinnerService;
@Service
public class DinnerServiceImpl implements dinnerService{
	@Autowired
	private DinnerDao dinnerDao;
}
