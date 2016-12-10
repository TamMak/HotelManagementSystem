package edu.cs.mum.hotelmanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cs.mum.hotelmanagement.model.Guest;
import edu.cs.mum.hotelmanagement.model.SavedRoom;
@Repository
public interface SavedRoomDao extends JpaRepository<SavedRoom, Long>{
	public List<SavedRoom> findByGuest(Guest guest);
}
