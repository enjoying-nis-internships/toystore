package rs.enjoying.dao.impl;

import java.util.Calendar;

import org.springframework.stereotype.Repository;

import javassist.bytecode.analysis.Util;
import rs.enjoying.dao.AbstractDao;
import rs.enjoying.dao.OrderDao;
import rs.enjoying.model.Address;
import rs.enjoying.model.Order;

@Repository("orderDao")
public class OrderDaoImpl extends AbstractDao<Long, Order> implements OrderDao{

	@Override
	public void saveOrder(Order order) {
		java.sql.Date timeNow = new java.sql.Date(Calendar.getInstance().getTimeInMillis());
		order.setCreationDate(timeNow);
		
		persist(order);
	}

}
