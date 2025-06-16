package com.adu.vo.test;

import com.adu.vo.Product;

public class ProductArrayTest1 {

	public static void main(String[] args) {
		Product[] pro1 = { 
				new Product("신라면", 500, 10, "농심"), 
				new Product("삼다수", 300, 4, "삼다수"),
				new Product("초코파이", 200, 20, "오리온"), 
				new Product("피존", 1000, 5, "빨래") };
		Product[] pro2 = { 
				new Product("테라", 1500, 6, "맥주회사"), 
				new Product("진라면", 500, 10, "농심"),
				new Product("맥심커피", 600, 5, "맥심") };
		/*
		 * 배열 선언, 생성 초기화를 한번에 Product 타일의 배열을 2개 생성 pro1, pro2 pro1(신라면, 삼다수, 초코파이, 피존)
		 * pro2(테라, 진라면, 맥심커피)
		 * 
		 * 
		 * 배열안에 들어있는 모든 제품정보를 출력
		 */
		for (Product product : pro1) {
			System.out.println(product.getProductInfo());
		}
		for (Product product : pro2) {
			System.out.println(product.getProductInfo());
		}
	}

}
