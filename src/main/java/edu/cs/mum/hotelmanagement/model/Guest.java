package edu.cs.mum.hotelmanagement.model;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

@Entity
public class Guest extends Person {

	private String guestNumber;
	@OneToMany(mappedBy = "guest")
	private List<SavedReservation> savedReservations;

	public Guest(String firstName,String lastName,String email, String phoneNumber,String password,String guestNumber){
		super(firstName,lastName,email,phoneNumber,password);
		this.guestNumber = guestNumber;
		this.savedReservations =new ArrayList<>();
	}

	public List<SavedReservation> getSavedReservations() {
		return savedReservations;
	}

	public void setSavedReservations(List<SavedReservation> savedReservations) {
		this.savedReservations = savedReservations;
	}

	public void saveReservation(SavedReservation savedReservation){
		this.savedReservations.add(savedReservation);
=======
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Guest extends Person {

	
	private Long id;
	String guestNumber;

	public Guest() {
				
>>>>>>> 60ae5fa97abc48a5abb434151c1b367097139147
	}

	public String getGuestNumber() {
		return guestNumber;
	}

	public void setGuestNumber(String guestNumber) {
		this.guestNumber = guestNumber;
	}
<<<<<<< HEAD


=======
	
	
>>>>>>> 60ae5fa97abc48a5abb434151c1b367097139147
}
