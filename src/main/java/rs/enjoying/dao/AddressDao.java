package rs.enjoying.dao;

import rs.enjoying.model.Address;

public interface AddressDao {

	public long saveAddress(Address a);

	public Address findByUserId(long id);

}
