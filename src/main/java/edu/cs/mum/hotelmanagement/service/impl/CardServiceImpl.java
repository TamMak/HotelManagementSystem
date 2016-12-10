package edu.cs.mum.hotelmanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cs.mum.hotelmanagement.dao.CardDao;
import edu.cs.mum.hotelmanagement.model.Card;
import edu.cs.mum.hotelmanagement.model.Reservation;
import edu.cs.mum.hotelmanagement.service.CardService;

@Service
@Transactional
public class CardServiceImpl implements CardService {

	@Autowired
	private CardDao cardDao;

	@Override
	public List<Card> getAll() {
		
		List<Card> cardLists = (List<Card>) cardDao.findAll();
		return cardLists.size() != 0? cardLists : new ArrayList<>();
	}

	@Override
	public Card findMyCardByCreditCardNo(long creditCardNo) {
		
		return cardDao.findOne(creditCardNo);
	}

	@Override
	public Card save(Card card) {
		
		return cardDao.save(card);
	}

}
