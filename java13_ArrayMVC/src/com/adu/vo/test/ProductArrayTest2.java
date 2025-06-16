package com.adu.vo.test;
/*
 * Customer 2명 생성...
 * Customer 타입의 배열을 생성... 값으로 위 2명(정우성, 이정재)... customers
 * 
 * customers[0] 이 pro1 구매
 * customers[1] 이 pro2 구매
 * 
 * 이정재씨가 구매한 물건의 총 가격
 * 정우성 구매한 물건의 제품명만 출력
 * */

import java.util.Arrays;

import com.adu.vo.Customer;
import com.adu.vo.Product;
/*
 * Test 클래스는
 * Scanner로 값입력 받는다
 * 메소드 호출(서비스 요청)
 * 메소드 동작 후 반환값 출력
 * 
 * 해당코드에서는 로직이 작동 중
 * 
 * 기능만을 따로 모아놓은 서비스 클래스를 추가적으로 작성
 * 
 * model - control - view
 * vo --- svice --- test
 * */
public class ProductArrayTest2 {

	public static void main(String[] args) {
		Product[] pro1 = { 
				new Product("신라면", 500, 10, "농심"), 
				new Product("삼다수", 300, 4, "삼다수"),
				new Product("초코파이", 200, 20, "오리온"), 
				new Product("피존", 10000, 5, "빨래"),
				new Product("노트북", 1500000, 5, "빨래") 
				};
		Product[] pro2 = { 
				new Product("테라", 1500, 6, "맥주회사"), 
				new Product("진라면", 500, 10, "농심"),
				new Product("맥심커피", 600, 5, "맥심") 
				};
		
		Customer[] customers = {
				new Customer(951213,"정우성","경기도 안양"),
				new Customer(970822,"이정재","서울 강남")
				};

		customers[0].buyProducts(pro1);
		customers[1].buyProducts(pro2);

		int total = 0;
		for (Product p : customers[1].getProducts()) {
			total += p.getPrice() * p.getQuantity();
		}
		System.out.println("이정재가 결제한 총 금액" + total);

		System.out.println("정우성이 결제한 제품명들");
		
		for (Product p : customers[0].getProducts()) {
			System.out.print(p.getMaker() + " ");
		}
		
		System.out.println("\n\n정우성이 결제한 1만원 이상의 제품명과 가격");
		
		// 정우성씨가 구입한 물건중 1만원 이상의 제품의 제품명과 가격을 출력
		
		// stream 함수로 customers[0].getProducts() customer 객체가 가지고 있는 product 클래스를 가져온다
		// stream 함수를 이용하여 뒤에 있는 함수에는 p - > 로 변수를 선언하여 
		// p 변수안에 customers[0].getProducts() 을 넣는다.
		// filter -> if 로 조건을 쥐어 줌
		// forEach 문으로 반복 출력
		Arrays.stream(customers[0].getProducts()).filter(p -> p.getPrice() >= 10000)
			.forEach(p-> System.out.println(p.getMaker() + " " + p.getPrice()));
		
//		for (Product p : customers[0].getProducts()) {
//			if(p.getPrice() >= 10000) {
//				System.out.print(p.getMaker() + " " + p.getPrice() + " ");
//			}
//		}
	}

}
