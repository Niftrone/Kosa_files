package com.edu.child;

import com.edu.parent.Pizza;

public class PotatoPizza extends Pizza{

	public PotatoPizza(int price, String brand) {
		super(price, brand);
	}
	
	@Override
	public void topping() {
		System.out.println("감자로 토핑합니다");
		
	}

}
