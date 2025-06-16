package com.adu.coding.test;

import java.util.Scanner;
import java.util.Stack;

public class test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = java.util.stream.IntStream.range(0, N).map(i -> scan.nextInt()).toArray();
		Stack<Integer> stack = new Stack<>();

		int idx = 1;
		boolean result = true;
		StringBuffer bf = new StringBuffer();

		for (int i = 0; N > i; i++) {
			int su = A[i];
			if (su >= idx) {
				while (su >= idx) {
					stack.push(idx++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			} else {
				int n = stack.pop();
				if (n > su) {
					System.out.println("NO");
					result = false;
					break;
				} else {
					bf.append("-\n");
				}
			}
		}
		if(result) {
			System.out.println(bf.toString());
		}
		scan.close();
	}

}
