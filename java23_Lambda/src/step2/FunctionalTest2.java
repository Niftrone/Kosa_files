package step2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
/*
 * 함수의 인자값으로 Functional Interface가 사용되는 예제
 * 
 * */

public class FunctionalTest2 {

	public static void main(String[] args) {
		System.out.println("------------ Runnable void run()------------");
		
		Runnable r = () -> System.out.println("run 함수");
		r.run();
		
		System.out.println("-------------- 2. Supplier R get() -----------");
		Random rand = new Random();

		Supplier<Integer> s = () -> rand.nextInt(100) + 1;
		List<Integer> list = new ArrayList<>();
		makeRandomList(list, s);
		
		System.out.println(list);
		

		System.out.println("-------------- 3. Consumer R get() -----------");
		
		Consumer<Integer> c1 =(i) -> System.out.println(i + " ");
		c1.accept(1);
		
		System.out.println("-------------- 4. Function R get() -----------");
		
		Function<Integer, Integer> f1 = (i) ->  i / 10 * 10; // 1의 자리를 없애버림
		
		
		System.out.println(f1.apply(10));
		
		System.out.println(domsmthing(list, f1));
			
		System.out.println("-------------- 5. Predicate<T> R get() -----------");
				
		Predicate<Integer> p1 = (t) -> t % 2 == 0;
		printEvenNumber(list, p1);
	}
	
	private static void makeRandomList(List<Integer> list,Supplier<Integer> s) {
		// 10회 반복 Supplier로부터 임의의 값을 받고 그 값을 list 에 저장
		for(int i =0; 10 > i; i++) {
			list.add(s.get());
		}
	}
	
	private static List<Integer> domsmthing(List<Integer> list , Function<Integer,Integer> R){
		List<Integer> neli = new ArrayList<>();
		
		for(int a : list) {
			neli.add(R.apply(a));
		}
		//list 값들을 newList 에 담아서 반환
		//list 안에 있는값들을 하나씩 돌면서 일의 자리를 없애고
		return list.stream().map(R).toList();
		
	}
	
	private static void printEvenNumber(List<Integer> list, Predicate<Integer> P) {
		list.stream().filter(P).forEach(System.out :: println);
	}

}
