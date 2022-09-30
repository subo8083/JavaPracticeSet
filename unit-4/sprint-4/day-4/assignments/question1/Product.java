package com.question1;

public class Product {
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	private int productId;
	private String productName;
	private double productPrice;
	
	
	public Product(int pId, String n, double Pp)
	{
		this.productId=pId;
		this.productName=n;
		this.productPrice=Pp;
	}
	
	public Product()
	{
		
	}
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
	
	

}
