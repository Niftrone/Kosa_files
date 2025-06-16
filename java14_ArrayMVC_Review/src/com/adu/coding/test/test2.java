package com.adu.coding.test;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class test2 {

	public static void main(String[] args) throws NumberFormatException, IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int a = Integer.parseInt(br.readLine());
//		
//		PriorityQueue<Integer> queue = new PriorityQueue<>(
//				(o1, o2) -> {
//					
//					int first = Math.abs(o1);
//					int second = Math.abs(o2);
//					
//					if(first == second) {
//						return o1 > o2 ? 1 : -1;
//					}// 절대값이 같을 때 음수가 먼저 출력되는 코드
//					
//					return first - second;// 순서를 절대값이 작은것이 우선으로
//				}
//				);
//		
//		for(int i=0; a > i; i++) {
//			int b = Integer.parseInt(br.readLine());
//			if(b == 0) {
//				if(queue.isEmpty()) {
//					System.out.println("0");
//				}else {
//				 System.out.println(queue.poll());
//				}
//			}else {
//				queue.add(b);
//			}
//		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> queue = new PriorityQueue<>(
				(o1, o2) -> {
					
					int first = Math.abs(o1);
					int second = Math.abs(o2);
					
					if(first == second) {
						return o1 - o2;
					}
					
					return first - second;
				}
				);
		
		for(int i=0; n > i; i++) {
			int a = Integer.parseInt(br.readLine());
			if(a == 0) {
				if(queue.isEmpty()) {
					System.out.println("0");
				}else {
					System.out.println(queue.poll());
				}
			} else {
				queue.add(a);
			}
		}
	}

}
