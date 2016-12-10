package edu.cs.mum.hotelmanagement.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cs.mum.hotelmanagement.dao.DinnerDao;
import edu.cs.mum.hotelmanagement.model.Dinner;
import edu.cs.mum.hotelmanagement.service.DinnerService;

@Service
@Transactional
public class DinnerServiceImpl implements DinnerService{
	@Autowired
	private DinnerDao dinnerDao;

	@Override
	public List<Dinner> getAllDinners() {
		
		return dinnerDao.findAll();
	}

	@Override
	public Dinner getDinnerById(Long id) {
		
		return dinnerDao.getOne(id);
	}

	@Override
	public void addNewDinner(Dinner dinner) {
		dinnerDao.save(dinner);
		
	}

	@Override
	public List<Dinner> SearchDinner(String cuisine) {
		List<Dinner> dinners = dinnerDao.findByCuisine(cuisine);
		return dinners;
	}

	@Override
	public List<Dinner> SearchServiceHours(String from, String to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dinner> SearchSmokingStatus(String smokingStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dinner updateDinner(Long id, Dinner dinner) {
		
		return dinnerDao.save(dinner);
	}

	@Override
	public void deleteHotel(Long id) {
		dinnerDao.delete(id);
		
	}
}
