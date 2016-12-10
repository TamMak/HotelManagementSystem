package edu.cs.mum.hotelmanagement.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.cs.mum.hotelmanagement.model.Guest;
import edu.cs.mum.hotelmanagement.model.Reservation;
import edu.cs.mum.hotelmanagement.model.Room;
import edu.cs.mum.hotelmanagement.service.EmailService;
import edu.cs.mum.hotelmanagement.service.ReservationService;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

	//logger
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ReservationController.class);
    //private Logger logger = LoggerFactory.getLogger(ReservationController.class);
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	private ReservationService reservationService;

	@RequestMapping
	public List<Reservation> greeting( Model model) {
		
		//logging
		log.info("Adding a model with info as: {}", model);
				
//		model.addAttribute("reservations", reservationService.findAll());		
//		return "reservations";
//		
		//List<Reservation> reservationLists = reservationService.findAll();
//		if (reservationLists == null) 
			List<Reservation> reservationLists	 = new ArrayList<>();
			List<Room> rooms = new ArrayList<>();
			
//			
		Reservation reservation = new Reservation();
		reservation.setCheckInDate(new Date());
		reservation.setCheckOutDate(new Date());
		reservation.setReservationDate(new Date());
		reservation.setReservationNumber("res001");
		reservation.setRooms(rooms);
			
//		reservation.getGuest().setFirstName("Tamx");
//		reservation.getGuest().setEmail("mussiestick@gmail.com");
		
		reservationLists.add(0, reservation);
		
//			try {
//				emailService.sendReservationConfermationEmail(reservation);
//			}catch( MailException e ){
//				// catch error
//				logger.info("Error Sending Email: " + e.getMessage());
//			}
//			
			return reservationLists;		
	}
	
	//this is to be done in the front end
	@RequestMapping(value = "/guest", method = RequestMethod.GET)
	public String getreserveForm(@ModelAttribute("guest") Guest guest, Model model) {	
		return "guest";
	}
	
	//this is to be done in the front end
	@RequestMapping(value = "/guest", method = RequestMethod.POST)
	public String reserve(@Valid @ModelAttribute("guest") Guest guest, BindingResult bindingResult, 
			Model model,RedirectAttributes redirectAttributes ) {
		//logging guest
		log.info("Adding aguest with info as: {}", guest);
				//return "redirect:/reservations/guest";
		
		return "ok...";
	}
	
}
