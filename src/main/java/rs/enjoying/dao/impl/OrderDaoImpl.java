package rs.enjoying.dao.impl;

import org.springframework.stereotype.Repository;

import rs.enjoying.dao.AbstractDao;
import rs.enjoying.dao.OrderDao;
import rs.enjoying.model.Order;

@Repository("orderDao")
public class OrderDaoImpl extends AbstractDao<Long, Order> implements OrderDao{

	@Override
	public void saveOrder(Order order) {
		this.getSession().save(order);
	}

}
