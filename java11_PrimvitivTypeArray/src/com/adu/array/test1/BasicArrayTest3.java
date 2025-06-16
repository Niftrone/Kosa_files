package com.adu.array.test1;

public class BasicArrayTest3 {

	public static void main(String[] args) {
		//1.
		int[] scores = {86, 92, 94, 78, 80, 76};
		
		int total = 0;
		//2. 성적들의 총점
		for(int score : scores) {
			total += score;
		}
		System.out.println("총점 : " + total);
		
		int avg = total / scores.length;
		
		System.out.println("평균 : "+ avg);
		
	}

}
