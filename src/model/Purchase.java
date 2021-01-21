package model;

import java.util.Date;
import java.util.List;

public class Purchase {
	private Integer id;
	private Double price;
	private String couponCode;
	private Date purchaseDate;
	private List<Order> orderList;
	public Purchase() {}
	public Purchase(Integer id, Double price, String couponCode, Date purchaseDate, List<Order> orderList) {
		super();
		this.id = id;
		this.price = price;
		this.couponCode = couponCode;
		this.purchaseDate = purchaseDate;
		this.orderList = orderList;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public List<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	public static void computePrice(List<Purchase> list)
	{
		
	}
}
