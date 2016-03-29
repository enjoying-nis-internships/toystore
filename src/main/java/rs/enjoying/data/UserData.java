package rs.enjoying.data;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public class UserData {

	private long id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String username;


	private String password;
	
	private byte[] image;
	

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getImage() {
		return Base64.encode(image);
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
}
