package rs.enjoying.service;

import java.util.List;

import rs.enjoying.data.CategoryData;



public interface CategoryService {

	public List<CategoryData> getCategoryForProductId(int productId);
	public List<CategoryData> getCategoryForProductName(String productName);
}
