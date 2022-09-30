package com.question4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ecommerce {
	
	
	List<Product> productList=new ArrayList<>();
	
	public void addProductToList(Product product)
	{
		productList.add(product);
		
		for(Product p1:productList)
		{
			if(p1.name=="Ipad")
			{
				p1.count++;
			}
		}
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(productList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ecommerce other = (Ecommerce) obj;
		return Objects.equals(productList, other.productList);
	}

	public List<Product> showAllProduct()
	{
		return productList;
		
	}
}
