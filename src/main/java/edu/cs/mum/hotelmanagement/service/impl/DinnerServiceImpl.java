package edu.cs.mum.hotelmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cs.mum.hotelmanagement.dao.DinnerDao;
import edu.cs.mum.hotelmanagement.service.DinnerService;
@Service
public class DinnerServiceImpl implements DinnerService{
	@Autowired
	private DinnerDao dinnerDao;
}
