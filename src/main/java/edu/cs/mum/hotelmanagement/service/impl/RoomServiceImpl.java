package edu.cs.mum.hotelmanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cs.mum.hotelmanagement.dao.RoomDao;
import edu.cs.mum.hotelmanagement.dao.SavedRoomDao;
import edu.cs.mum.hotelmanagement.model.Catagory;
import edu.cs.mum.hotelmanagement.model.Guest;
import edu.cs.mum.hotelmanagement.model.Room;
import edu.cs.mum.hotelmanagement.model.SavedRoom;
import edu.cs.mum.hotelmanagement.service.roomService;

@Service
public class RoomServiceImpl implements roomService{
	@Autowired
	private RoomDao roomDao;
	
	@Autowired
	private SavedRoomDao savedDAO;

	@Override
	public List<Room> getAllRooms() {
		
		return roomDao.findAll();
	}

	@Override
	public List<Room> getRoomsByCategory(Catagory catagory) {
		
		return roomDao.findByCatagory(catagory);
	}

	@Override
	public Room getRoomById(Long id) {
		
		return roomDao.findOne(id);
	}

	@Override
	public void addNewRoom(Room room) {
		roomDao.save(room);
		
	}

	@Override
	public void addRoomToSaved(SavedRoom sRoom) {
		savedDAO.save(sRoom);
		
	}

	@Override
	public List<Room> SearchRoom(Catagory category, double minPrice, double maxPrice, String roomNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List<SavedRoom> getSavedRooms(Guest guest) {
		
		return savedDAO.findByGuest(guest);
	}

	@Override
	public Room updateRoom(Long id, Room room) {
		
		return roomDao.save(room);
	}

	@Override
	public void deleteRoom(Long id) {
		roomDao.delete(id);
		
	}

	
	
}
