package edu.cs.mum.hotelmanagement.service;

import java.util.List;

import edu.cs.mum.hotelmanagement.model.Person;

public interface UserService {

	Person getUserById(long id);
	Person getUserByEmail(String email);
	List<Person> getAllUsers();
	Person saveUser(Person person);
	Person updateUser(long id);
	void deleteUser(long id);

}
