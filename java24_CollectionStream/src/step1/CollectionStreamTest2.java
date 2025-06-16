package step1;

/*
 * Collection Stream 특징
 * 1. Read Only 스트림은 데이터 소스로 부터 데이터를 읽어 들이기만 할 뿐 변경하지 않는다
 * 2. 일회용이다 - 최종연산이 한번 진행되었다면 해당 스트림은 닫히고 다시 사용될수 없다
 * 				필요하다면 다시 생성해서 사용해야 한다.
 * 3. 최종 연산 전까지 스트림의 중간연산이 수행되지 않는다. - 지연된 연산
 * 4. 병렬처리 작업이 가능하다 - 멀티 쓰레드 지원
 * */

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionStreamTest2 {

	public static void main(String[] args) {
		// 리스트 생성
		List<String> fruits = Arrays.asList("Apple", "Melon", "Banana", "Apple", "Orange", "Grape", "Grape",
				"Water Melon", "Banana");
		System.out.println("원본 리스트" + fruits);
		// 1 스트림 생성
		Stream<String> stream = fruits.stream();

		// 2 중간연산 + 최종연산
		stream.distinct().limit(4).sorted().forEach(System.out::println);

		System.out.println("원본 리스트2" + fruits);
		System.out.println("----------------------------------");

		String[] arr = { "a", "bb", "cc", "ddd", "aaa", };
		
		Stream<String> st = Stream.of(arr);
//		st.forEach(System.out :: println);
		
		long a = st.count();
		System.out.println("스트림안의 데이터 개수" + a);
		
		System.out.println("----------------------------------");
		IntStream intStream= new Random().ints(1,46);
//		intStream.forEach(System.out :: print);
		//중복된 값은 없애고, 값중에서 6개만 출력 정렬해서 출력
		intStream.distinct().limit(6).sorted().forEach(System.out :: println);
	}

}
