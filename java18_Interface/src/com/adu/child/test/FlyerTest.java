package com.adu.child.test;

import com.adu.child.Airplane;
import com.adu.child.Bird;
import com.adu.child.SuperMan;
import com.adu.parent.Flyer;

public class FlyerTest {

	public static void main(String[] args) {
		Flyer[] fd = new Flyer[3];
//		Flyer fly = new Flyer();
//		Airplane a = new Airplane();
//		SuperMan man = new SuperMan();
		//Polymorphism
		
		Flyer[] flies = {
				new Bird(), new SuperMan(), new Bird()
		};
		
		for(Flyer f : flies) {
			f.flyer();
			f.takeOff();
			f.land();
			System.out.println("-------------------------------");
		}
		/*
		 * for문 돌면서
		 * Bird라면 layEggs()
		 * superman stopBullet
		 */
		for(Flyer f : flies) {
			if(f instanceof Bird) {
				System.out.println(((Bird) f).layEggs());
			}else if(f instanceof SuperMan){
				System.out.println(((SuperMan) f).stopBullet());
			}
		}
	}

}
