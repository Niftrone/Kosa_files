package com.adu.array.test2;

import java.util.Arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] members1 = {1,2,3,4,5,6};
		int[] members2 = {10,11,12,13,14,15,16,17,18,19};
		
		System.out.println("\n ========== 맴버스 1 ===========");
		
		for(int member1 : members1)
			System.out.print(member1 + " ");
		
		System.out.println("\n ========== 맴버스 2 ===========");
		
		for(int member2 : members2)
			System.out.print(member2  + " ");
		
		// System.arraycopy(복사할 대상, 복사할 위치, 붙혀넣을 대상, 붙혀넣을 위치, 길이)
		System.arraycopy(members1, 0, members2, 4, members1.length);
		
		System.out.println("\n ========== 붙혀넣기 2 ===========");
		
		for(int member2 : members2)
			System.out.print(member2  + " ");
		
	}

}
