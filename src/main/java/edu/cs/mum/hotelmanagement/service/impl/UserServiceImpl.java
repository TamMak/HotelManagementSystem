package edu.cs.mum.hotelmanagement.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import edu.cs.mum.hotelmanagement.dao.UserDao;
import edu.cs.mum.hotelmanagement.model.Person;
import edu.cs.mum.hotelmanagement.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	private UserDao userDao;

	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public Person getUserById(long id) {
		return userDao.findOne(id);
	}

	@Override
	public Person getUserByEmail(String email) {
		return userDao.findOneByEmail(email);
	}

	@Override
	public List<Person> getAllUsers() {
		return userDao.findAll() ;
	}

	@Override
	public Person saveUser(Person person) {
		return userDao.save(person);
	}

	@Override
	public Person updateUser(long id) {
		return null;
	}

	@Override
	public void deleteUser(long id) {
		userDao.delete(id);
	}

}
