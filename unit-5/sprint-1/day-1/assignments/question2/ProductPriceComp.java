package com.question2;

import java.util.Comparator;

public class ProductPriceComp implements Comparator<Product>{

	@Override
	public int compare(Product p1,Product p2) {
		
		if(p1.getProductPrice()<p2.getProductPrice())
			return 1;
		if(p1.getProductPrice()>p2.getProductPrice())
			return -1;
		return 0;
		
//		return p1.getProductPrice()<p2.getProductPrice()?-1:-1;
//		
		
	}
	
	
	
	

}
