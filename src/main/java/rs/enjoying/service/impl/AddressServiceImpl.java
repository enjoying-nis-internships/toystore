package rs.enjoying.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.enjoying.converter.AddressConverter;
import rs.enjoying.dao.AddressDao;
import rs.enjoying.data.AddressData;
import rs.enjoying.model.Address;
import rs.enjoying.service.AddressService;

@Service("addressService")
@Transactional
public class AddressServiceImpl implements AddressService {
	@Autowired
	AddressDao addressDao;
	
	@Autowired
	AddressConverter addressConverter;

	@Override
	public long createAddress(AddressData address) {
		Address a = new Address();
		addressConverter.copyFromDataToEntity(address, a);
		
		return addressDao.saveAddress(a);
	}

	@Override
	public Address findByUserId(long id) {
		return addressDao.findByUserId(id);
	}

}
