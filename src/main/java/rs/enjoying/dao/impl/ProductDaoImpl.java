package rs.enjoying.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import rs.enjoying.dao.AbstractDao;
import rs.enjoying.dao.ProductDao;
import rs.enjoying.model.Product;

@Repository("productDao")
public class ProductDaoImpl extends AbstractDao<Long, Product> implements ProductDao {

	@Override
	public List<Product> getProductsForCategoryId(Long categoryId) {

		List<Product> list = (List<Product>) getSession()
				.createQuery("FROM Product p WHERE p.category.id = :categoryId").setParameter("categoryId", categoryId)
				.list();

		return list;
	}

	

}
