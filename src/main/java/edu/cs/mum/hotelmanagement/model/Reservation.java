package edu.cs.mum.hotelmanagement.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Reservation {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  
  private String reservationNumber;   
  
  //for search purpose
 // private Hotel hotel;
  
  @Temporal(TemporalType.DATE)
  private Date checkInDate;
  
  @Temporal(TemporalType.DATE)
  private Date checkOutDate;
  
  @Temporal(TemporalType.DATE)  
  private  Date  reservationDate;
  
  private  String remark;
  
  @ManyToOne(fetch = FetchType.EAGER)//no cascadint for ManyToOne & fetch has to be eager
  private Guest guest;
  //List<Hotel> hotels;
  
  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)//mappedBy = "reservation", 
  private List<Room> rooms = new ArrayList<>();
  
  @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private Payment payment;
  
  //handle later annotation
 // private ReservationState state;
  
	public Reservation() {
	
     }  

	public Reservation(String reservationNumber,  Date reservationDate) {//,	Hotel hotel
		super();
		this.reservationNumber = reservationNumber;
		this.reservationDate = reservationDate;
	//	this.hotel = hotel;
	}
	
	public Reservation(String reservationNumber, Date checkInDate, Date checkOutDate, Date reservationDate,
			String remark) {//, Guest guest
		super();
		this.reservationNumber = reservationNumber;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.reservationDate = reservationDate;
		this.remark = remark;
		//this.guest = guest;
	}

	
	
//	public enum statusType{
//  PENDING,OPEN,CLOSED,CANCELLED;
//}
//
//@Enumerated(EnumType.STRING)
//private statusType status;
	
	

	public Long getId() {
		return id;
	}

	//ck and delete
//	public Hotel getHotel() {
//		return hotel;
//	}
//	//ck and delete
//	public void setHotel(Hotel hotel) {
//		this.hotel = hotel;
//	}

	//amnot sure do i need this or not
	public void addRooms(Room room) {
		this.rooms.add(room);
	}
	

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public List<Room> getRooms() {
		return java.util.Collections.unmodifiableList(rooms);
	}
	

	public String getReservationNumber() {
		return reservationNumber;
	}
	public void setReservationNumber(String reservationNumber) {
		this.reservationNumber = reservationNumber;
	}
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public Date getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public Guest getGuest() {
		return guest;
	}
	
	public void setGust(Guest guest) {
		this.guest = guest;
	}
	
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
//	public ReservationState getState() {
//		return state;
//	}
//	public void setState(ReservationState state) {
//		this.state = state;
//	}
//  
}
