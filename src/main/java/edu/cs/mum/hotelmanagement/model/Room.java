package edu.cs.mum.hotelmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Room {
	
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long id;
	 private String roomNumber;
	 private String roomType;
	 private double price;
	 private  boolean avilability;
	 private  String description;
	   
	public Room() {
		
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
	   

}
