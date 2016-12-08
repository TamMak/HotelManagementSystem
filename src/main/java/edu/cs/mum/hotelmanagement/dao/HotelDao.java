package edu.cs.mum.hotelmanagement.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cs.mum.hotelmanagement.model.Catagory;
import edu.cs.mum.hotelmanagement.model.Hotel;
import edu.cs.mum.hotelmanagement.model.Room;
@Transactional
public interface HotelDao extends JpaRepository<Hotel, Long> {
	public List<Hotel> findByHotelName(String hotelName);


}
