package edu.cs.mum.hotelmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.cs.mum.hotelmanagement.model.Catagory;
import edu.cs.mum.hotelmanagement.service.CatagoryService;

@RestController
public class CatagoryController {
	@Autowired
	private CatagoryService catagoryService;
	
	@RequestMapping(value = "/catagory", method=RequestMethod.GET, produces="application/json")
	public List<Catagory> getCatacory() {
		List<Catagory> catagory = this.catagoryService.getAllCatagorys();
		System.out.println(catagory);
		return catagory;
	}
	
	@RequestMapping(value = "/catagory/{id}", method=RequestMethod.GET, produces="application/json")
	public Catagory getCatacoryById(@RequestParam(value="id") Long id,Model model) {
		
		return this.catagoryService.getCatagoryById(id);
	}
}
