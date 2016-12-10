package edu.cs.mum.hotelmanagement.service;

import java.util.List;

import edu.cs.mum.hotelmanagement.model.Card;

public interface CardService {
	
	public List<Card> getAll();

	public Card findMyCardByCreditCardNo(long creditCardNo);

	public Card save(Card card);

}
