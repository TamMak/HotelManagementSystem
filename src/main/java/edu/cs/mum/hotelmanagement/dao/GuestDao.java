package edu.cs.mum.hotelmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cs.mum.hotelmanagement.model.Guest;
@Repository
public interface GuestDao extends JpaRepository<Guest, Long> {
	Guest findOneByEmail(String email);
}
