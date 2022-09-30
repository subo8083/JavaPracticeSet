package com.question5;

public class Product {
	
	private int productId;
	private int quantity;
	private String productName;
	private int productPrice;
	
	
	
	
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
		this.quantity = quantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	public Product(int pid, int q, int pric,String n) {
		
		this.productId=pid;
		this.productPrice=pric;
		this.productName=n;
		this.quantity=q;
		
	}
	
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", quantity=" + quantity + ", productName=" + productName
				+ ", productPrice=" + productPrice + "]";
	}
	
	
	

}
