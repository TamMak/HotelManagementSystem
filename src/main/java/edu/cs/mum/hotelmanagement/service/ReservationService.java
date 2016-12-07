package edu.cs.mum.hotelmanagement.service;

import java.util.List;

import edu.cs.mum.hotelmanagement.model.Reservation;

public interface ReservationService {
	
	public Reservation	save(Reservation reservation) ;
	public List<Reservation> findAll() ;
	public Reservation findOne(Long id);
	
	//public void deleteAll() 
	//public void delete(Long id)
	//public void delete(Reservation entity) 	
	//public Page<Reservation> findAll(Pageable pageable)
    //public boolean exists(Long id) 
    //public long count() 
	//public List<Reservation> findAll(Sort sort) 
	
}
