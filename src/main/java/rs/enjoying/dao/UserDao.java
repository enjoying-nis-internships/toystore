package rs.enjoying.dao;

import rs.enjoying.model.User;

public interface UserDao {
	public User findById(long id);
	public void create(User user);
}
