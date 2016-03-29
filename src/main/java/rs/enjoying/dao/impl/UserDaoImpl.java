package rs.enjoying.dao.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import rs.enjoying.dao.AbstractDao;
import rs.enjoying.dao.UserDao;
import rs.enjoying.model.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Long, User> implements UserDao {

	@Override
	public User findById(long id) {
		return getByKey(id);
	}
	
	@Override
	public void create(User us) {	
		persist(us);
		
	}
}
