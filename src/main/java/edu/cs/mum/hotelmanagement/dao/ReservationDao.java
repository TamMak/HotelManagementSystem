package edu.cs.mum.hotelmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cs.mum.hotelmanagement.model.Reservation;

@Repository
public interface ReservationDao 
extends JpaRepository<Reservation, Long>{
//extends CrudRepository<Reservation, Long>{
	
	
}	

//	public <S extends Reservation> S save(S entity)
//public List<Reservation> findAll() 
//public List<Reservation> findAll(Sort sort) 
//	public Reservation findOne(Long id) 
//	public boolean exists(Long id) 
//	public long count() 
//	public List<Reservation> findAll(Iterable<Long> ids) 
//	public <S extends Reservation> List<S> save(Iterable<S> entities) 
//	public Reservation getOne(Long id) 
//	public <S extends Reservation> List<S> findAll(Example<S> example) 
//	public <S extends Reservation> List<S> findAll(Example<S> example, Sort sort) 
//public void deleteAll() 
//public void delete(Long id)
//public void delete(Reservation entity) 	
//public Page<Reservation> findAll(Pageable pageable) 
	

//	public void delete(Iterable<? extends Reservation> entities) 
//	public <S extends Reservation> S findOne(Example<S> example)
//	public <S extends Reservation> Page<S> findAll(Example<S> example, Pageable pageable) 
//	public <S extends Reservation> long count(Example<S> example)
//	public <S extends Reservation> boolean exists(Example<S> example) 
//	public void flush()
//	public <S extends Reservation> S saveAndFlush(S entity) 
//	public void deleteInBatch(Iterable<Reservation> entities) 
//	public void deleteAllInBatch() 

