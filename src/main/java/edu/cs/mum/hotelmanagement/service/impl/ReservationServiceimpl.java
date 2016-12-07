package edu.cs.mum.hotelmanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cs.mum.hotelmanagement.dao.ReservationDao;
import edu.cs.mum.hotelmanagement.model.Reservation;
import edu.cs.mum.hotelmanagement.service.ReservationService;

@Service
@Transactional
public class ReservationServiceimpl implements ReservationService {

	@Autowired
	private ReservationDao reservationDao;
	
	@Override
	public Reservation save(Reservation reservation) {		
		return reservationDao.save(reservation);
	}

	@Override
	public List<Reservation> findAll() {		
	List<Reservation> reservationLists = (List<Reservation>) reservationDao.findAll();
	return reservationLists.size() != 0? reservationLists : new ArrayList<>();
	}

	@Override
	public Reservation findOne(Long id) {
		return reservationDao.findOne(id);
	}

	
}
