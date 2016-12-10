package edu.cs.mum.hotelmanagement.service;

import java.util.List;

import edu.cs.mum.hotelmanagement.model.Catagory;
import edu.cs.mum.hotelmanagement.model.Guest;
import edu.cs.mum.hotelmanagement.model.Room;
import edu.cs.mum.hotelmanagement.model.SavedRoom;

public interface RoomService {
	List<Room> getAllRooms();

	List<Room> getRoomsByCategory(Catagory catagory);

	Room getRoomById(Long id);

	void addNewRoom(Room room);

	void addRoomToSaved(SavedRoom sRoom);

	List<Room> SearchRoom(Catagory catagory, double minPrice, double maxPrice, String roomType);

	List<SavedRoom> getSavedRooms(Guest guest);

	Room updateRoom(Long id, Room room);

	void deleteRoom(Long id);

}
