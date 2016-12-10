package edu.cs.mum.hotelmanagement.service;

import java.util.List;

import edu.cs.mum.hotelmanagement.model.Catagory;

public interface CatagoryService {
	List<Catagory> getAllCatagorys();
	
	Catagory getCatagoryByName(String catagoryName);
	
	Catagory getCatagoryById(Long id);

	void addNewCatagory(Catagory catagory);
	
	Catagory updateCatagory(Long id, Catagory catagory);

	void deleteCatagory(Long id);

}
