package rs.enjoying.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import rs.enjoying.converter.ProductConverter;
import rs.enjoying.dao.ProductDao;
import rs.enjoying.data.ProductData;
import rs.enjoying.model.Product;

public class ProductServiceImpl {

	@Autowired
	ProductConverter productConverter;
	
	@Autowired
	ProductDao productDao;
	
	public List<ProductData> getById(long id){
		List<ProductData> resultList = null;
		List<Product> productList = productDao.getProductsForCategoryId(id);
		if (productList != null && !productList.isEmpty()) {
			resultList = new ArrayList<ProductData>();
			for (Product product : productList) {
				ProductData productData = new ProductData();
				productConverter.copyFromEntityToData(product, productData, "category");
			}
		}
		
		
		return resultList;
	}
	
}
