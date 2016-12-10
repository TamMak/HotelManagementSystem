package edu.cs.mum.hotelmanagement.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cs.mum.hotelmanagement.dao.CatagoryDao;
import edu.cs.mum.hotelmanagement.model.Catagory;
import edu.cs.mum.hotelmanagement.service.CatagoryService;

@Service
@Transactional
public class CatagoryServiceImpl implements CatagoryService{
	@Autowired
	private CatagoryDao catagoryDao;

	@Override
	public List<Catagory> getAllCatagorys() {
		
		return catagoryDao.findAll();
	}

	@Override
	public Catagory getCatagoryByName(String catagoryName) {
		
		return catagoryDao.findByCatagoryName(catagoryName);
	}

	@Override
	public Catagory getCatagoryById(Long id) {
		
		return catagoryDao.findOne(id);
	}

	@Override
	public void addNewCatagory(Catagory catagory) {

		catagoryDao.save(catagory);
		
	}

	@Override
	public Catagory updateCatagory(Long id, Catagory catagory) {
		
		return catagoryDao.save(catagory);
	}

	@Override
	public void deleteCatagory(Long id) {

		catagoryDao.delete(id);
		
	}

}
