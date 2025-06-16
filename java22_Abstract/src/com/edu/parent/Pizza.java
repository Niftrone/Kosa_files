package com.edu.parent;

/*
 * 추상 클래스의 용도
 * 피자를 만들어내기위한 공통의 성질은 그대로 자식에게 물려주고
 * 반면에 서로다른 종류의 피자를 만들어내기 위한 결정적인 부분은 추상메소드로 물려줌
 * 
 * topping에 따라서 서로다른 피자? abstract
 * */
public abstract class Pizza {
	private int price;
	private String brand;

	public Pizza() {
		this(15000, "PizzaHut");
	}
	
	public Pizza(int price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	
	private void dogh() {
		System.out.println("피자 반죽과 함께 도우를 잘 만들어 준다");
	}
	
	private void bake() {
		System.out.println("180도 고온에서 15분간 굽는다");
	}
	
	private void boxing() {
		System.out.println("종이박스에 잘 넣는다");
	}
	private void cuting() {
		System.out.println("피자를 8조각으로 자른다");
	}
	public abstract void topping();
	
	//위 기능들을 순서대로 호출하는 포괄적인 기능을 재정의
	public void sequencePizza() {
		dogh();
		topping();
		bake();
		cuting();
		boxing();
	}
	@Override
	public String toString() {
		return "상점이름 : " + brand + " 가격 : " + price;
	}
}
