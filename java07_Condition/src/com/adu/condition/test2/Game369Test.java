package com.adu.condition.test2;

import java.util.Scanner;

public class Game369Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 2자리수만 입력 >> ");
		int num = scan.nextInt();

		Game369 game369 = new Game369();
		String result = game369.solv(num);

		System.out.println(result);
	}

}

class Game369 {
	public String solv(int num) {
		int ten = num / 10;
		int one = num % 10;
		
		if(ten == 0 && one == 0) {
			return ""+num;
		}
		else if (ten % 3 == 0 && one % 3 == 0) {
			return "&&";
		} else if (ten % 3 == 0 || one % 3 == 0) {
			return "&";
		} else
			return ""+num;
	}
}