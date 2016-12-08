package edu.cs.mum.hotelmanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.cs.mum.hotelmanagement.dao.GuestDao;
import edu.cs.mum.hotelmanagement.model.Guest;
import edu.cs.mum.hotelmanagement.service.GuestService;

public class GuestServiceImpl implements GuestService {

	private GuestDao guestDao;
	@Autowired
	public GuestServiceImpl(GuestDao guestDao) {
		super();
		this.guestDao = guestDao;
	}

	@Override
	public Guest getGuestById(long id) {
		return this.guestDao.findOne(id);
	}

	@Override
	public Guest getGuestByEmail(String email) {

		return this.guestDao.findOneByEmail(email);
	}

	@Override
	public List<Guest> getAllGuests() {
		return this.guestDao.findAll();
	}

	@Override
	public Guest saveGuest(Guest person) {

		return null;
	}

	@Override
	public Guest updateGuest(long id) {

		return null;
	}

	@Override
	public void deleteGuest(long id) {

		this.guestDao.delete(id);

	}

}