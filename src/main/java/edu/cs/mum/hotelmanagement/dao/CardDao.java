package edu.cs.mum.hotelmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cs.mum.hotelmanagement.model.Card;

@Repository
public interface CardDao  extends JpaRepository<Card, Long>{
	
//	@Query("SELECT a FROM Card a WHERE a.credentials.username = :name")
//	public Card findMyCardByCreditCardNo(String creditCardNo);

}

//
//@Query("SELECT a FROM Admin a WHERE a.credentials.username = :name")
//public Admin findAdminByUserName(
//		@Param(value = "name") String name);