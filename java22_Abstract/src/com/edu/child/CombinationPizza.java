package com.edu.child;

import com.edu.parent.Pizza;

public class CombinationPizza extends Pizza{

	public CombinationPizza(int price, String brand) {
		super(price, brand);
	}
	
	@Override
	public void topping() {
		System.out.println("콤비네이션으로 토핑합니다");
		
	}

}
