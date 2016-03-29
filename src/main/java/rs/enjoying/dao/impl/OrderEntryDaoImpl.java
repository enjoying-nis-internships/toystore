package rs.enjoying.dao.impl;

import org.springframework.stereotype.Repository;

import rs.enjoying.dao.AbstractDao;
import rs.enjoying.dao.OrderEntryDao;
import rs.enjoying.dao.ProductDao;
import rs.enjoying.model.OrderEntry;
import rs.enjoying.model.Product;

@Repository("orderEntryDao")
public class OrderEntryDaoImpl extends AbstractDao<Long, OrderEntry> implements OrderEntryDao {

	@Override
	public void saveOrderEntry(OrderEntry orderEntry) {
		persist(orderEntry);
	}

}
