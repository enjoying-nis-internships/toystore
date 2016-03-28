package rs.enjoying.data;

public class OrderEntryData {
	private long id;
	private OrderData order;
	private ProductData product;
	private int quantity;
	
	public OrderEntryData() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public OrderData getOrder() {
		return order;
	}
	public void setOrder(OrderData order) {
		this.order = order;
	}
	public ProductData getProduct() {
		return product;
	}
	public void setProduct(ProductData product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
