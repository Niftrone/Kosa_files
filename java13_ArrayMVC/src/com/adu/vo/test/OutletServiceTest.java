package com.adu.vo.test;

import com.adu.service.OutletCustomerService;
import com.adu.vo.Customer;
import com.adu.vo.Product;

/*
 * 1. 서비스의 기능들을 주석으로 먼저 달아둔다
 * 2. 모든 기능의 선언부만 먼저 작성한다
 *    메소드이름, 인자값, 반환타입
 *    인자값과 반환 타입은 반드시 정확해야한다
 *    
 * 3. 메소드를 하나만 먼저 구현
 * 4. 테스트에서 호출해서 잘 작성이 되었는지 확인
 *    다음 메소드 작성으로 넘어간다...다시 테스트에서 호출.. 확인
 * */

public class OutletServiceTest {

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
		
		Product[] pro3 = {
				new Product("LG gram", 900000, 1, "엘지")
		};
		
		Customer c1 = new Customer(951213,"정우성","경기도안양");
		Customer c2 = new Customer(970822,"이정재","서울강남");
		Customer c3 = new Customer(901123,"이후령","경기도안산");
		
		Customer[] customers = {c1, c2, c3};
		
		customers[0].buyProducts(pro1);
		customers[1].buyProducts(pro2);
		customers[2].buyProducts(pro3);
		
		OutletCustomerService service = new OutletCustomerService();
		
		System.out.println("===========customer[1]===============");
		Product[] prosx1 = service.getProdcuts(c2);
		for(Product p : prosx1) {
			System.out.println(p.getProductInfo());
		}
		System.out.println("===========customer[0]===============");
		String[] str1 = service.getProductsMaker(c1);
		for(String s : str1) {
			System.out.println(s);
		}
		System.out.println("===========customer[2]===============");
		Customer customer = service.findCustomer(customers, 901123);
		System.out.println(customer.getName());
		
		System.out.println("===========customer 주소 검색===============");
		Customer[] customers1 = service.findCustomer(customers, "경기도안양");
		for(Customer c : customers1) {
			System.out.println(c.getAddress());
		}
		
		System.out.println("===========customer[0]최고가 상품 찾기===============");
		int max = service.findMaxPrice(customers[0]);
		System.out.println("최 고가가는 : "+ max);
		
		System.out.println("===========모든 상품 중 만원 이상 찾기===============");
		Product[] overPrice = service.findOverPrice(customers, 10000);
		for(Product pro : overPrice) {
			System.out.println(pro.getProductInfo());
		}
	}

}
