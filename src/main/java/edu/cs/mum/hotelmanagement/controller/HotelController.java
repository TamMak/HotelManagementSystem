package edu.cs.mum.hotelmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.cs.mum.hotelmanagement.model.Hotel;
import edu.cs.mum.hotelmanagement.service.HotelService;

@RestController
public class HotelController {
	@Autowired
	private HotelService hotelService;
	
	
	@RequestMapping(value = "/hotel", method=RequestMethod.GET, produces="application/json")
	public List<Hotel> getHotels() {	
		
		return this.hotelService.getAllHotels();
	}
	
	@RequestMapping(value = "/hotel/{id}", method=RequestMethod.GET, produces="application/json")
	public Hotel getHotelById(@PathVariable(value="id") Long id,Model model) {	
		
		
	
		Hotel hotel = this.hotelService.getHotelById(id);
		
		return hotel;
	}

}
