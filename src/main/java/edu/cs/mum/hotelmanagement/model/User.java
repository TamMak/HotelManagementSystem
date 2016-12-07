package edu.cs.mum.hotelmanagement.model;

import javax.persistence.Entity;

@Entity
public class User extends Person {

	  private String staffNumber;

	  public User(String firstName,String lastName,String email, String phoneNumber,String password,String staffNumber){
			super(firstName,lastName,email,phoneNumber,password);
			this.staffNumber = staffNumber;
	 }

	public String getStaffNumber() {
		return staffNumber;
	}

	public void setStaffNumber(String staffNumber) {
		this.staffNumber = staffNumber;
	}

}
