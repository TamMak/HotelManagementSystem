package edu.cs.mum.hotelmanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cs.mum.hotelmanagement.model.Catagory;
import edu.cs.mum.hotelmanagement.model.Room;
@Repository
public interface RoomDao extends JpaRepository<Room, Long> {
	public List<Room> findByCatagory(Catagory catagory);

	public List<Room> findByRoomNumber(String roomNumber);

	public List<Room> findByPrice(double price);

	public List<Room> findByCatagoryAndPrice(Catagory catagory, double price);

	public List<Room> findByCatagoryAndRoomNumber(Catagory catagory, String roomNumber);

	public List<Room> findByRoomNumberAndPrice(String roomNumber, double price);

	public List<Room> findByCatagoryAndPriceAndRoomNumber(Catagory catagory, double price, String roomNumber);

}
