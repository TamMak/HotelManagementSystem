package edu.cs.mum.hotelmanagement.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String hotelName;
	private String number;
	private String description;
	@Embedded
	private Address address;
	
	@OneToMany(mappedBy = "hotel",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Room> rooms;
	
	@OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)//fetch = FetchType.EAGER,
	@JsonManagedReference
	private List<Dinner> dinners;

	private int rate;
	
	public Hotel(){
		
	}

	public Hotel(String hotelName, String number, String description, Address address, int rate) {
		this.hotelName = hotelName;
		this.number = number;
		this.description = description;
		this.address = address;
		this.rate = rate;
		this.rooms =new ArrayList<>();
		this.dinners = new ArrayList<>();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return hotelName;
	}

	public void setName(String name) {
		this.hotelName = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public List<Dinner> getDinner() {
		return dinners;
	}

	public void setDinner(List<Dinner> dinners) {
		this.dinners = dinners;
	}

}
