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
	public void create(String firstname, String lastname, String email, String password, String username) {		
		Query query = getSession().createSQLQuery("insert into user (email, first_name, last_name, password, username) values(:em, :fn, :ln, :ps, :un)");
		query.setParameter("em", email);
		query.setParameter("fn", firstname);
		query.setParameter("ln", lastname);
		query.setParameter("ps", password);
		query.setParameter("un", username);
		
		query.executeUpdate();
	}
}
