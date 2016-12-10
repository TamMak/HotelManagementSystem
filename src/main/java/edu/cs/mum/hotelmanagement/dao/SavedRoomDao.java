package edu.cs.mum.hotelmanagement.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cs.mum.hotelmanagement.model.Guest;
import edu.cs.mum.hotelmanagement.model.SavedRoom;
@Transactional
public interface SavedRoomDao extends JpaRepository<SavedRoom, Long>{
	public List<SavedRoom> findByGuest(Guest guest);
}
