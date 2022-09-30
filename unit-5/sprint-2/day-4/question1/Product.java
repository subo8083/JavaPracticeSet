package com.question1;

public class Product {
	
	private int productId;
	private int productPrice;
	private int productQuantity;
	private String productName;
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public Product(int id,int q,int pr,String name){
		this.productId=id;
		this.productPrice=pr;
		this.productQuantity=q;
		this.productName=name;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productPrice=" + productPrice + ", productQuantity="
				+ productQuantity + ", productName=" + productName + "]";
	}
	
	
	
	
	
	

}
