package com.edu.test;

import java.util.ArrayList;
import java.util.List;

import com.edu.child.CombinationPizza;
import com.edu.child.PotatoPizza;
import com.edu.child.bulgogiPizza;
import com.edu.parent.Pizza;
import com.edu.service.PizzaService;

public class PizzaServicTest {

	public static void main(String[] args) {
	List<Pizza> list = new ArrayList<Pizza>();
	list.add(new bulgogiPizza(16000, "Mr.pizza"));
	list.add(new CombinationPizza(14000, "Domino.pizza"));
	list.add(new PotatoPizza(12000, "피자스쿨"));
	
	PizzaService service = new PizzaService();
	service.allMakePizza(list);
	
	}

}
