package edu.cs.mum.hotelmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Dinner {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String dinnerName;
	private String cuisine;
	private String description;
	private String serviceHours;
	private String smokingStatus;
	@ManyToOne
	@JoinColumn(name = "hotelId", nullable = false)
	private Hotel hotel;

	public Dinner() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getServiceName() {
		return dinnerName;
	}

	public void setServiceName(String serviceName) {
		this.dinnerName = serviceName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getServiceHours() {
		return serviceHours;
	}

	public void setServiceHours(String serviceHours) {
		this.serviceHours = serviceHours;
	}

	public String getSmokingStatus() {
		return smokingStatus;
	}

	public void setSmokingStatus(String smokingStatus) {
		this.smokingStatus = smokingStatus;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

}
