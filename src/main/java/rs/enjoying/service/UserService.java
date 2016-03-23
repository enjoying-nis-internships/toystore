package rs.enjoying.service;

import rs.enjoying.data.UserData;

public interface UserService {

	public UserData getById(long id);
	public void create(String firstname, String lastname, String email, String password, String username);
}
