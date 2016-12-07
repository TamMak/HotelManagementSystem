package edu.cs.mum.hotelmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cs.mum.hotelmanagement.model.Person;

public interface UserDao extends JpaRepository<Person, Long> {

	Person findOneByEmail(String email);
}
