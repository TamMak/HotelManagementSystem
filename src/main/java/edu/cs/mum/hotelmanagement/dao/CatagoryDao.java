package edu.cs.mum.hotelmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cs.mum.hotelmanagement.model.Catagory;

@Repository
public interface CatagoryDao extends JpaRepository<Catagory, Long> {
	public Catagory findByCatagoryName(String catagoryName);

}
