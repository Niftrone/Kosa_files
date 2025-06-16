package com.adu.array.test1;

import java.util.Scanner;

public class BasicArrayTest4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("사람의 수를 입력하세요.");
		String[] nums = new String[scan.nextInt()];
		scan.nextLine();

		System.out.println("이름을 입력하세요");
		for (int i = 0; nums.length > i; i++) {
			nums[i] = scan.next();

		}

		for (String num : nums) {
			System.out.print(num + " ");
		}

		scan.close();

	}

}
