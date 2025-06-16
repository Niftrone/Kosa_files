package com.adu.array.test2;

import java.util.Arrays;

public class ArrayMaxAndMinTest3 {

	public static void main(String[] args) {
		
		int[] scores = {79,88,91,45,100,56};
		
		int max = scores[0];
		int min = scores[0];
		
		for(int i : scores) {
			if(i > max) {
				max = i;
			}
			if(i < min) {
				min = i;
			}
		}
		System.out.println("최대 최소값 : " + max + " " + min);
		
	}

}
