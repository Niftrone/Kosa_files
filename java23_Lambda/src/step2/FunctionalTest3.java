package step2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * 		Collection(객체를 저장하는 방법론, 가장 원시적인 저장법)
 * 			 |
 *    -----------------
 *    |               | 
 * 	 Set			List           Map
 * 
 * 저장법이 다르다는 것은
 * 그 안에 저장된 데이터를 뽑아낼 때도 다른 방법으로 뽑혀진다는 것을 의미
 * 이것이 코드가 길어질수 있고 복잡해질수 있는 부분이 된다.
 * 자바 8버전 이후의 Collection Stream, Lambda 기술이 제공되면서 이 부분이 해소됨
 * 
 * */

public class FunctionalTest3 {
	public static void main(String[] args) {
		List<Integer> d = new ArrayList<Integer>();
		for (int i = 0; 10 >= i; i++) {
			d.add(i);
		}

//		for(int i : d) {
//			System.out.println(i);
//		}

//		d.stream().forEach(System.out :: println);

		Map<Integer, String> m = new HashMap<>();
		m.put(111, "SCOTT");
		m.put(222, "BLAKE");
		m.put(333, "KING");

//		Set<Integer> keys = m.keySet();
//		Iterator<Integer> i = keys.iterator();
//		while(i.hasNext()) {
//			int key = i.next();
//			String value = m.get(key);
//			System.out.println(value);
//		}

//		m.keySet().stream().forEach(System.out :: println);
//		m.values().forEach(System.out :: println);

		m.entrySet().forEach(en -> System.out.println(en.getKey() + en.getValue()));

		System.out.println("1.리스트에 담긴 객체를 ForEach로 출력");

		d.forEach(x -> System.out.println(x));

		System.out.println("2.맵에 담긴 객체를 ForEach로 출력");
		m.forEach((k, v) -> System.out.println(k + " " + v));

		System.out.println("\n3.리스트 값들 중에서 2혹은 3의 배수를 제거");
		d.removeIf(x -> x % 2 == 0 || x % 3 == 0);
		System.out.println(d);
		
		System.out.println("\n3.리스트 모든값들에 10을 곱한다 ==> replaceAll");
		d.replaceAll(z -> z * 10);
		System.out.println(d);
	}

}
