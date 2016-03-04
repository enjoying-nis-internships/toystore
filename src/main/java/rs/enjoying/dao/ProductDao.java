package rs.enjoying.dao;

import java.util.List;

import rs.enjoying.model.Product;

public interface ProductDao {
	
	public List<Product> getProductsForCategoryId(Long categoryId);
	public Product getProductForId(Long productId);
	
}
