package edu.cs.mum.hotelmanagement.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cs.mum.hotelmanagement.model.Dinner;
import edu.cs.mum.hotelmanagement.model.Hotel;
@Transactional
public interface DinnerDao extends JpaRepository<Dinner, Long> {
	public List<Dinner> findByDinnerName(String dinnerName);
	public List<Dinner> findByCuisine(String cuisine);
	public List<Dinner> findByServiceHours(String serviceHours);
	public List<Dinner> findBySmokingStatus(String smokingStatus);
	
	
}
