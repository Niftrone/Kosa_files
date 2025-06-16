package com.adu.service;
/*
 * 아울렛에서 상품들을 구매하는 고객 관련 기능들만 모아놓은 서비스 클래스
 * 데이터베이스와 연결되면 이후에 이 클래스는 dao(database access object)가 된다.
 * vo, test 중간에 위치함으로 해당 클래스는 controller 역할을 함
 * */

import java.util.Arrays;

import com.adu.vo.Customer;
import com.adu.vo.Product;

public class OutletCustomerService {
	/*
	 * 1 특정 고객이 구매한 모든 상품을 반환
	 * 
	 * 2 특정 고객이 구매한 모든 상품의 메이커만 반환하는 기능
	 */
	public Product[] getProdcuts(Customer customer) {
		return customer.getProducts();
	}

	public String[] getProductsMaker(Customer customer) {
//		String[] maker = Arrays.stream(customer.getProducts()).map(p -> p.getMaker()).toArray(String[]::new);
		String[] maker = new String[customer.getProducts().length];
		int idx = 0;
		for(Product pro : customer.getProducts()) {
			maker[idx++] = pro.getMaker(); 
		}
		return maker;
	}

	/*
	 * 아울렛 안에있는 고객들 중에서 특정 고객을 검색하는 기능
	 * 
	 * 아울렛안에 있는 고객들 중에서 혜화동에 거주하는 고객을 검색하는 기능
	 * 
	 * 메소드 오버로딩
	 * 처리하는 인자값
	 * 같은 기능을 하지만 데이터가 다를때 똑같은 메서드 명으로 코드를 생성한다.
	 * 리턴 타입은 상관없다
	 * 
	 * Method Overloading Rule(규칙, 문법)
	 * 메소드 이름은 반드시 같아야한다
	 * 메소드 인자값은 반드시 달라야 한다
	 * 메소드 리턴 타입은 상관없다
	 * 
	 * 하는일이 같지만 처리하는 데이터를 달리하는 기법
	 * 결론적으로 코드의 가독성을 높이는데 중요한 역할을 하는 기법
	 * 
	 */
	public Customer findCustomer(Customer[] customers, int ssn) {
//		Customer result = Arrays.stream(customer).filter(c -> c.getSsn() == ssn).findFirst().orElse(null);
		Customer result = null;
		for(Customer c : customers) {
			if(c.getSsn() == ssn) {
				result = c;
			}
		}
		return result;
	}

	public Customer[] findCustomer(Customer[] customers, String address) {
		Customer[] result = Arrays.stream(customers).filter(c -> c.getAddress().equals(address)).toArray(Customer[]::new);
//		Customer[] result = new Customer[customers.length];
//		int idx=0;
//		for(Customer c : customers) {
//			if(c.getAddress().equals(address)) {
//				result[idx++] = c;
//			}
//		}
		return result;
	}
	/*
	 * 특정 고객이 구입한 물건중에서 최고가에 해당하는 물건의 가격을 반환
	 * 
	 * 모든 고객이 구입한 물건 중에서 특정 가격 이상되는 상품을 반환
	 * */
	public int findMaxPrice(Customer customer) {
		Arrays.stream(customer.getProducts()).mapToInt(Product::getPrice).max().orElse(0);
//		int max=0;
//		for(Product c : customer.getProducts()) {
//			if(max < c.getPrice()) {
//				max = c.getPrice();
//			}
//		}
		return Arrays.stream(customer.getProducts()).mapToInt(Product::getPrice).max().orElse(0);
	}
	
	public Product[] findOverPrice(Customer[] customers, int selectPrice) {
		int count = 0;
		for(Customer cus : customers) {
			for(Product pro : cus.getProducts()) {
				if(pro.getPrice() >= selectPrice) {
					count++;
				}
			}
		}
		Product[] product = new Product[count];
		int idx = 0;
		for(Customer cus : customers) {
			for(Product pro : cus.getProducts()) {
				if(pro.getPrice() >= selectPrice) {
					product[idx++] = pro;
				}
			}
		}
		return Arrays.copyOf(product,idx);
	}
}
