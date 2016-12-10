package edu.cs.mum.hotelmanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cs.mum.hotelmanagement.model.Address;
import edu.cs.mum.hotelmanagement.model.Hotel;
@Repository
public interface HotelDao extends JpaRepository<Hotel, Long> {
	public List<Hotel> findByHotelName(String hotelName);
	public List<Hotel> findByAddress(Address address);


}
