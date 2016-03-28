package rs.enjoying.service;

import rs.enjoying.data.AddressData;
import rs.enjoying.model.Address;

public interface AddressService {
	public long createAddress(AddressData address);

	public Address findByUserId(long id);
}
