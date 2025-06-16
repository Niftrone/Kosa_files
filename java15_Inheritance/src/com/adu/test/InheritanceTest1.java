package com.adu.test;

import com.adu.child.Manager;
import com.adu.util.MyDate;

public class InheritanceTest1 {

	public static void main(String[] args) {
		Manager m1 = new Manager(123, "Jamse", 45000.0, new MyDate(1990, 10, 11), "IT");
		Manager m2 = new Manager(456, "Adams", 38000.0, new MyDate(2000, 1, 11), "Marking");

		System.out.println(m1);
		System.out.println(m2);
		
		
	}

}
