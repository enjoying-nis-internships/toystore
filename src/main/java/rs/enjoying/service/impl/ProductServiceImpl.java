package rs.enjoying.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.enjoying.converter.ProductConverter;
import rs.enjoying.dao.ProductDao;
import rs.enjoying.data.ProductData;
import rs.enjoying.model.Product;
import rs.enjoying.service.ProductService;
import javax.transaction.Transactional;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductConverter productConverter;
	
	@Autowired
	ProductDao productDao;

	@Override
	public List<ProductData> getProductsForCategoryId(Long categoryId) {
		List<ProductData> resultList = null;
		
		List<Product> productList = productDao.getProductsForCategoryId(categoryId);
		if (productList != null && !productList.isEmpty()) {
			resultList = new ArrayList<ProductData>();
			for (Product product : productList) {
				ProductData productData = new ProductData();
				productConverter.copyFromEntityToData(product, productData, "category");
				resultList.add(productData);
			}
		}
		
		
		return resultList;
	}
	
}
