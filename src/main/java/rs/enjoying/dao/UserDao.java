package rs.enjoying.dao;

import rs.enjoying.model.User;

public interface UserDao {
	public User findById(long id);
	public void create(String firstname, String lastname, String email, String password, String username);
}
