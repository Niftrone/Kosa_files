package com.edu.child;

import com.edu.parent.Pizza;

public class bulgogiPizza extends Pizza{

	public bulgogiPizza(int price, String brand) {
		super(price, brand);
	}
	
	@Override
	public void topping() {
		System.out.println("불고기로 토핑합니다");
		
	}

}
