package edu.cs.mum.hotelmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.cs.mum.hotelmanagement.model.Room;
import edu.cs.mum.hotelmanagement.service.GuestService;
import edu.cs.mum.hotelmanagement.service.RoomService;

@RestController
public class RoomController {
	@Autowired
	private RoomService roomService;
	
	@Autowired
	private GuestService guestService;
	
	@RequestMapping(value = "/room", method=RequestMethod.GET, produces="application/json")
	public List<Room> getRoom() {
		
		return this.roomService.getAllRooms();
	}
	
	@RequestMapping(value = "/room/{id}", method=RequestMethod.GET, produces="application/json")
	public Room getRoomById(@RequestParam(value="id") Long id,Model model) {
		
		return this.roomService.getRoomById(id);
	}
	

}
