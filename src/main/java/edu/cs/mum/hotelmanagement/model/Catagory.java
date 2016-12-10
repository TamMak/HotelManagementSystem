package edu.cs.mum.hotelmanagement.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Catagory{ 

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String catagoryName;
	@OneToMany(mappedBy = "catagory", cascade = CascadeType.ALL)//fetch = FetchType.EAGER,
	@JsonManagedReference
	private List<Room> rooms;

	public Catagory() {
		
	}

	public Catagory(String catagoryName) {
		
		this.catagoryName = catagoryName;
		this.rooms = new ArrayList<>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCatagorName() {
		return catagoryName;
	}

	public void setCatagorName(String catagorName) {
		this.catagoryName = catagorName;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

}
