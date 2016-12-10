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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cardType;
	private Long cardNumber;
	private Date expirationDate;
	private int securityNumber;
	
	@OneToMany(mappedBy = "card",cascade = CascadeType.ALL, fetch = FetchType.LAZY)//mappedBy = "reservation", 
	private List<Payment> payments = new ArrayList<>();
	
	@OneToOne
	private Person person;
	
	
	public Card() {
		
	}
	
	
	public Card(String cardType, Long cardNumber, Date expirationDate, int securityNumber) {
		super();
		this.cardType = cardType;
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.securityNumber = securityNumber;
	}
	
		
	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public Long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public int getSecurityNumber() {
		return securityNumber;
	}
	public void setSecurityNumber(int securityNumber) {
		this.securityNumber = securityNumber;
	}
	public Long getId() {
		return id;
	}
		
}
