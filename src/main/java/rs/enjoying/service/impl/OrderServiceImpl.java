package rs.enjoying.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import rs.enjoying.converter.OrderConverter;
import rs.enjoying.dao.OrderDao;
import rs.enjoying.data.OrderData;
import rs.enjoying.model.Order;
import rs.enjoying.model.OrderEntry;
import rs.enjoying.service.OrderService;

public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderDao orderDao;
	
	@Autowired
	OrderConverter orderConverter;
	
	@Override
	public void createOrder(OrderData order) {
		Order o = new Order();
		orderConverter.copyFromDataToEntity(order, o);
		
		orderDao.saveOrder(o);
	}

}
