package edu.cs.mum.hotelmanagement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SavedReservation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String reservationNumber;
	private String hotelNumber;
	private String roomNumber;
	private Date checkInDate;
	private Date checkOutDate;
	private Date reservationDate;
	private String remark;
	@ManyToOne()
	@JoinColumn(name = "guestId", nullable = false)
	private Guest guest;

	public SavedReservation(String reservationNumber, String hotelNumber, String roomNumber, Date checkInDate,
			Date checkOutDate, Date reservationDate, String remark) {
		//super();
		this.reservationNumber = reservationNumber;
		this.hotelNumber = hotelNumber;
		this.roomNumber = roomNumber;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.reservationDate = reservationDate;
		this.remark = remark;
	}
	public Long getId() {
		return id;
	}
	public String getReservationNumber() {
		return reservationNumber;
	}
	public void setReservationNumber(String reservationNumber) {
		this.reservationNumber = reservationNumber;
	}
	public String getHotelNumber() {
		return hotelNumber;
	}
	public void setHotelNumber(String hotelNumber) {
		this.hotelNumber = hotelNumber;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
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
	public void setGuest(Guest guest) {
		this.guest = guest;
	}


}
