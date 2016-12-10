package edu.cs.mum.hotelmanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cs.mum.hotelmanagement.model.Dinner;

@Repository
public interface DinnerDao extends JpaRepository<Dinner, Long> {
	public List<Dinner> findByDinnerName(String dinnerName);
	public List<Dinner> findByCuisine(String cuisine);
	public List<Dinner> findByServiceHours(String serviceHours);
	public List<Dinner> findBySmokingStatus(String smokingStatus);
	
	
}
