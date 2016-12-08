package edu.cs.mum.hotelmanagement.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cs.mum.hotelmanagement.model.Catagory;
import edu.cs.mum.hotelmanagement.model.Guest;
import edu.cs.mum.hotelmanagement.model.Room;
@Transactional
public interface RoomDao extends JpaRepository<Room, Long> {
	public List<Room> findByCatagory(Catagory catagory);

//	public List<Room> findByGuest(Guest guest);

	public List<Room> findByRoomNumber(String roomNumber);

	public List<Room> findByPrice(double price);

	public List<Room> findByCatagoryAndPrice(Catagory catagory, double price);

	public List<Room> findByCatagoryAndRoomNumber(Catagory catagory, String roomNumber);

	public List<Room> findByRoomNumberAndPrice(String roomNumber, double price);

	public List<Room> findByCatagoryAndPriceAndRoomNumber(Catagory catagory, double price, String roomNumber);

}
