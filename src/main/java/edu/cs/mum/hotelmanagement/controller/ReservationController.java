package edu.cs.mum.hotelmanagement.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.cs.mum.hotelmanagement.model.Guest;
import edu.cs.mum.hotelmanagement.service.ReservationService;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

	@Autowired
	private ReservationService reservationService;

	@RequestMapping
	public String greeting( Model model) {
		
		model.addAttribute("reservations", reservationService.findAll());		
		return "reservations";
		
	}

	@RequestMapping(value = "/guest", method = RequestMethod.GET)
	public String getreserveForm(@ModelAttribute("guest") Guest guest, Model model) {	
		return "guest";
	}
	
	@RequestMapping(value = "/guest", method = RequestMethod.POST)
	public String reserve(@Valid @ModelAttribute("guest") Guest guest, BindingResult bindingResult, Model model,RedirectAttributes redirectAttributes ) {
				//return "redirect:/reservations/guest";
		
		return "ok...";
	}
	
}
