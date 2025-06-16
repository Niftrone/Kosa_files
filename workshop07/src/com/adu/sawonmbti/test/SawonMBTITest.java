package com.adu.sawonmbti.test;

import java.util.Scanner;

import com.adu.sawonmbti.SawonMBTI;

public class SawonMBTITest {
	/*
	 * 6 1 4 4 4 5 3
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("K전자 신입사원수 입력 >>> ");
		SawonMBTI sawon = new SawonMBTI();

		int nums = scan.nextInt();// 배열의 사이즈
		int[] people = new int[nums]; // 6

		System.out.println("공백을 기준으로 각 사원에 대한 성격 유형을 직접 입력 >>> ");

		for (int i = 0; people.length > i; i++) {
			people[i] = scan.nextInt();
		}
		sawon.inputMBTI(people);

		// 코드 작성

		int answer = sawon.maxDuplication();

		System.out.println("정답 :: " + answer);

		scan.close();
	}

}
