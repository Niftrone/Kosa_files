package com.adu.array.test1;

public class BasicArrayTest2 {

	public static void main(String[] args) {
		// arr이라는 int 타입의 배열을 생성 ..11,22,33값을 가지는
		// 선언 + 초기화
		int[] arr = { 11, 22, 33 };

		System.out.println("arr의 주소 값 : " + arr);

//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("arr 값 : " + arr[i]);
//		}

		// 뭐가 어디에서 돌아가는가?
		for (int i : arr)
			System.out.println(i);

	}

}
