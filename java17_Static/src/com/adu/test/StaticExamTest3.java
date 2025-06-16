package com.adu.test;

class Car{
	int serialNumber; //field
	static int counter; //static V(class V, 전역변수)
	
	Car(){
		counter++;
		serialNumber = counter;
	}
}

public class StaticExamTest3 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		System.out.println("==========field===========");
		System.out.println(c1.serialNumber);
		System.out.println(c2.serialNumber);
		System.out.println(c3.serialNumber);
		
		System.out.println("==========static V===========");
		System.out.println(Car.counter);
		System.out.println(c1.counter);
		System.out.println(c2.counter);
		System.out.println(c3.counter);
		
	}

}
