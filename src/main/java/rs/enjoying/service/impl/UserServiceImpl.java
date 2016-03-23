package rs.enjoying.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.enjoying.converter.UserConverter;
import rs.enjoying.dao.UserDao;
import rs.enjoying.data.UserData;
import rs.enjoying.model.User;
import rs.enjoying.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Autowired
	UserConverter userConverter;
	
	public UserData getById(long id) {
		User user = userDao.findById(id);
		UserData userData = null;
		if (user != null) {
			userData = new UserData();
			userConverter.copyFromEntityToData(user, userData);
		}
		return userData;
	}

	@Override
	public void create(String firstname, String lastname, String email, String password, String username) {
		userDao.create(firstname, lastname, email, password, username);
	}
	
}
