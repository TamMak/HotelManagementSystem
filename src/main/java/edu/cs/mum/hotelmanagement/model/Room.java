package edu.cs.mum.hotelmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String roomNumber;
	
    @ManyToOne
	@JoinColumn(name="catagoryId")
    @JsonBackReference	
	private Catagory catagory;
	
	private String roomType;
	private double price;
	private boolean avilability;
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "hotelId")
	@JsonBackReference	
	private Hotel hotel;

	public Room() {
		
	}

	public Room(String roomNumber,  String roomType, double price, boolean avilability,
			String description) {
		super();
		this.roomNumber = roomNumber;
//		this.catagory = catagory;
		this.roomType = roomType;
		this.price = price;
		this.avilability = avilability;
		this.description = description;
//		this.hotel = hotel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvilability() {
		return avilability;
	}

	public void setAvilability(boolean avilability) {
		this.avilability = avilability;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Catagory getCatagory() {
		return catagory;
	}

	public void setCatagory(Catagory catagory) {
		this.catagory = catagory;
	}

}
