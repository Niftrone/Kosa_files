package com.adu.array.test1;

public class BasicArrayTest1 {

	public static void main(String[] args) {
		//int[] arr 선언
		
		int[] arr = new int[3];
		//arr 생성 사이즈는 3
		
		// 배열의 주소값을 출력
		System.out.println("arr의 주소 값 : " + arr);
		// 각각 배열의 요소에 11, 22, 33을 입력
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		System.out.println("------------------------------");
		// for 문을 이용해서 arr 배열에 들어있는 값들을 출력
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
	}

}
