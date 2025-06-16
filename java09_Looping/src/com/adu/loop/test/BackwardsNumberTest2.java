package com.adu.loop.test;

import java.util.Scanner;

public class BackwardsNumberTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num;

		do {
			num = scan.nextInt();
			if (num <= 0) {
				System.out.println("0 이상의 숫자를 입력하세요");
				num = 1;
			} else {
				for (int i = num; i > 0; i--) {
					System.out.print(num--);
				}
			}
		} while (num > 0);
		scan.close();
	}

}
