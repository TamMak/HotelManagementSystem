package edu.cs.mum.hotelmanagement.model;

import java.util.Date;

import lombok.Data;

public class Reservation {

   Long id;
  private String reservationNumber;   
  private Date checkInDate;
  private Date checkOutDate;
  private  Date  reservationDate;
  private  String remark;
  
  
	
}
