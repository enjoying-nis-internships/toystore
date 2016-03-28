package rs.enjoying.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import rs.enjoying.dao.AbstractDao;
import rs.enjoying.dao.AddressDao;
import rs.enjoying.dao.OrderDao;
import rs.enjoying.model.Address;
import rs.enjoying.model.Order;
import rs.enjoying.model.Product;

@Repository("addressDao")
public class AddressDaoImpl extends AbstractDao<Long, Address> implements AddressDao{

	@Override
	public long saveAddress(Address a) {
		persist(a);
		
		return a.getId();
	}

	@Override
	public Address findByUserId(long id) {
		List<Address> list = (List<Address>)getSession()
				.createQuery("FROM Address a WHERE a.user.id = :userId").setParameter("userId", id)
				.list();

		return list.get(0);
	}

}
