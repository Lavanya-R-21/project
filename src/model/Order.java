package model;

public class Order {
	private Integer quantity;
	private Item item;
	public Order() {}
	public Order(Integer quantity, Item item) {
		super();
		quantity = quantity;
		this.item = item;
	}
	
}
