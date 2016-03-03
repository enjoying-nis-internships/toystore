package rs.enjoying.service;

import java.util.List;

import rs.enjoying.data.ProductData;

public interface ProductService {

	public List<ProductData> getProductsForCategoryId(int categoryId);
	public List<ProductData> getProductsForCategoryName(String categoryName);
}
