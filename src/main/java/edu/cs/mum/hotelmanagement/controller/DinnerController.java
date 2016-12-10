package edu.cs.mum.hotelmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.cs.mum.hotelmanagement.model.Dinner;
import edu.cs.mum.hotelmanagement.service.DinnerService;

@RestController
public class DinnerController {
	@Autowired
	private DinnerService dinnerService;
	
	@RequestMapping(value = "/dinner", method=RequestMethod.GET, produces="application/json")
	public List<Dinner> getDinner() {
		
		return this.dinnerService.getAllDinners();
	}
	
	@RequestMapping(value = "/dinner/{id}", method=RequestMethod.GET, produces="application/json")
	public Dinner getDinnerById(@PathVariable(value="id") Long id,Model model) {
		
		return this.dinnerService.getDinnerById(id);
	}

}
