package rs.enjoying.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.enjoying.converter.OrderEntryConverter;
import rs.enjoying.dao.OrderEntryDao;
import rs.enjoying.data.OrderEntryData;
import rs.enjoying.model.OrderEntry;
import rs.enjoying.service.OrderEntryService;

@Service("orderEntryService")
@Transactional
public class OrderEntryServiceImpl implements OrderEntryService {

	@Autowired
	OrderEntryDao orderEntryDao;
	
	@Autowired
	OrderEntryConverter orderEntryConverter;
	
	@Override
	public void saveOrderEntry(OrderEntryData orderEntryData) {
		OrderEntry orderEntry = new OrderEntry();
		orderEntryConverter.copyFromDataToEntity(orderEntryData, orderEntry);
		
		orderEntryDao.saveOrderEntry(orderEntry);
	}

}
