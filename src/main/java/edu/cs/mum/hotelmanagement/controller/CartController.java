package edu.cs.mum.hotelmanagement.controller;


import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import edu.cs.mum.hotelmanagement.model.Guest;
import edu.cs.mum.hotelmanagement.model.Reservation;
import edu.cs.mum.hotelmanagement.model.Room;
import edu.cs.mum.hotelmanagement.service.GuestService;
import edu.cs.mum.hotelmanagement.service.ReservationService;
import edu.cs.mum.hotelmanagement.service.RoomService;

//@Controller
@RestController
@RequestMapping("/cart")
@SessionAttributes("roomInCart")
public class CartController {
//Sample code
//	List<Reservation> reservationLists = (List<Reservation>) reservationDao.findAll();
//	return reservationLists.size() != 0? reservationLists : new ArrayList<>();
//	
//	private Logger logger = LoggerFactory.getLogger(CartController.class);
//	
//	@Autowired
//	private EmailService emailService;
	
	@Autowired
	private RoomService roomService;

	@Autowired
	private GuestService guestService;
	
	@Autowired
	private ReservationService reservationService;

//	@Autowired
//	private ReservationDetailService reservationDetailService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addToCart(@RequestParam("id") long id, Model model, HttpServletRequest request) {

		Room room = roomService.getRoomById(id);
		@SuppressWarnings("unchecked")
		List<Room> rooms = (List<Room>) request.getSession().getAttribute("roomInCart");
		if (rooms == null) {
			rooms = new ArrayList<>();
		}
		rooms.add(room);
		model.addAttribute("roomInCart", rooms);

		long hotelId = (Long) request.getSession().getAttribute("hotelId");

		//send him back to the page
		//return rooms;
		return "redirect:/hotels/hotel?id=" + hotelId;
		
	}
	
	@RequestMapping(value = "/backToRoom", method = RequestMethod.GET)
	public String backToCart(Model model, HttpServletRequest request) {

		
		return "redirect:/hotels";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String removeFromCart(@RequestParam("id") long id, Model model, HttpServletRequest request) {

		Room room = new Room();

		@SuppressWarnings("unchecked")
		List<Room> rooms = (List<Room>) request.getSession().getAttribute("roomInCart");
		if (rooms == null) {
			rooms = new ArrayList<>();
		} else {
			for (Room room2 : rooms) {
				if (id == room2.getId()) {
					room = room2;
					break;
				}
			}
		}

		rooms.remove(room);

		model.addAttribute("roomInCart", rooms);

		return "redirect:/cart";
	}

	@RequestMapping
	public String card_show(@ModelAttribute("newReservation") Reservation reservation, Model model,
			HttpServletRequest request) {

		@SuppressWarnings("unchecked")
		List<Room> roomsInCart = (List<Room>) request.getSession().getAttribute("roomInCart");

		model.addAttribute("rooms", roomsInCart);
		return "cart";
	}

	@SuppressWarnings("deprecation")
	@RequestMapping(method = RequestMethod.POST)
	public String checkOut(@ModelAttribute("newReservation") Reservation reservation, Model model,
			HttpServletRequest request, Principal principle) {

		@SuppressWarnings("unchecked")
		List<Room> roomsInCart = (List<Room>) request.getSession().getAttribute("roomInCart");
		if(roomsInCart == null || roomsInCart.size() == 0){
			return "redirect:/hotels"; 
		}
		
		Guest guest = guestService.getGuestByEmail(principle.getName());
				//findGuestByUsername(principle.getName());
	//	reservation.setGust(guest);
		Date date = new Date();
//		reservation.setReservationNumber("RV" + guest.getId() + "-" + date.getDay() + "" + date.getHours() + ""
//				+ date.getMinutes() + "" + date.getSeconds());
		
		reservation.setReservationNumber(guest.getGuestNumber()+"_" +reservation.getReservationDate().getYear()+
				reservation.getReservationDate().getMonth()+reservation.getReservationDate().getDate());
		Reservation updatedReservation = reservationService.save(reservation);
							 //reservation = reservationService.save(reservation);

		//update room avilability
		Double totalPrice = 0.0;
		for (Room room : roomsInCart) {
			Room updateRoom = roomService.getRoomById(room.getId());
			updateRoom.setAvilability(false);// .setAvaidability(true);
			totalPrice += updateRoom.getPrice();
			reservation.addRooms(updateRoom);
//			ReservationDetail reservationDetail = new ReservationDetail();
//			reservationDetail.setReservation(updatedReservation);
//
//			reservationDetail.setRoom(updateRoom);
//			reservationDetailService.save(reservationDetail);
		}
		
		//payment to be done
//		Payment payment = reservation.getPayment();
//		boolean paied = payment.pay(totalPrice);
//		
//		if (paied) {
//		//before saviong check payment
//		reservationService.save(updatedReservation);
//		  }else{
//			  
//			  System.out.println("wold you pay>>>>!");
//		  }
		
		roomsInCart = new ArrayList<>();
		model.addAttribute("roomInCart", roomsInCart);

		return "redirect:/hotels";
	}

}
