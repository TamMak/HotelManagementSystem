package edu.cs.mum.hotelmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cs.mum.hotelmanagement.model.Guest;

public interface GuestDao extends JpaRepository<Guest, Long> {
	Guest findOneByEmail(String email);
}
