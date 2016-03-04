package rs.enjoying.service;

import java.util.List;

import rs.enjoying.data.ProductData;

public interface ProductService {

	public List<ProductData> getProductsForCategoryId(Long categoryId);
}
