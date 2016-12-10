package edu.cs.mum.hotelmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cs.mum.hotelmanagement.model.Person;

@Repository
public interface UserDao extends JpaRepository<Person, Long> {

	Person findOneByEmail(String email);
}
