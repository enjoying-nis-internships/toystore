package rs.enjoying.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import rs.enjoying.data.ProductData;

@Component
@Scope("session")
public class CartEntry {
	private int productId;
	private int quantity;
	
	private ProductData productData;
	
	public CartEntry(int pId, int q)
	{
		productId = pId;
		quantity = q;
	}
	
	public ProductData getProductData()
	{
		return productData;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity >= 1)
			this.quantity = quantity;
		else
			this.quantity = 1;
	}

	public void setProductData(ProductData pd) {
		productData = pd;
	}
}
