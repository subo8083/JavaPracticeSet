package com.question4;

public class Product {
	
	public String name;
	public double price;
	public String company;
	public int count;
	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", company=" + company + ", count=" + count + "]"+ "\n";
	}
	
	public Product(String n,double p,String c,int count)
	{
		this.name=n;
		this.price=p;
		this.company=c;
		this.count=count;
	}
	

}
