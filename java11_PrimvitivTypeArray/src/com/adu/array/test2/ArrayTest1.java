package com.adu.array.test2;

public class ArrayTest1 {

	public static void main(String[] args) {
		// int[] arr 선언
		int[] members = { 1, 2, 3, 4, 6, 10 };

		for (int member : members) {
			System.out.print(member + " ");
		}
		System.out.println();

		// members = Arrays.copyOf(members,9);

		members = new int[9];
		members[6] = 9;
		members[7] = 23;
		members[8] = 7;

		System.out.println("====================추가한 결과===================");
		for (int member : members) {
			System.out.print(member + " ");
		}
	}

}
