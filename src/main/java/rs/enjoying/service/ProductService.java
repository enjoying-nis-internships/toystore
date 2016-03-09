package rs.enjoying.service;

import java.util.List;

import rs.enjoying.data.ProductData;
import rs.enjoying.model.Product;

public interface ProductService {

	public List<ProductData> getProductsForCategoryId(Long categoryId);
	public ProductData getProductForId(Long productId);
	
}
