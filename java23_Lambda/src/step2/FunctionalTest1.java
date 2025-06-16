package step2;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
 * 함수형 인터페이스 구성요소
 * 1) 추상 메소드 -- 이게 핵심
 * 2) default 메소드
 * 3) static 메소드
 * :::
 * 대표적인 Functional 인터페이스
 * 매개변수 X, 반환타임 X ---------> Runnable void run();
 * 매개변수 O, 반환타임 X ---------> Consumer void run(매개변수);
 * 매개변수 X, 반환타임 O ---------> Supplier int run();
 * 매개변수 O, 반환타임 O ---------> Function int run(매개변수);
 * 매개변수 O, 반환타임 O (boolean) ---------> Predicate<T> boolean run(매개변수);
 * */

public class FunctionalTest1 {

	public static void main(String[] args) {
		System.out.println("------------ Runnable void run()------------");
		
//		Runnable r1 = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("run 함수");
//			}
//			
//		};
		
		Runnable r = () -> System.out.println("run 함수");
		r.run();
		
		System.out.println("-------------- 2. Supplier R get() -----------");
		Random rand = new Random();

//		Supplier<Integer> s = new Supplier() {
//			@Override
//			public Object get() {
//				return rand.nextInt(100) + 1;
//			}
//		};
		
		Supplier<Integer> s = () -> rand.nextInt(100) + 1;
		System.out.println(s.get());

		System.out.println("-------------- 3. Consumer R get() -----------");
		Consumer<Integer> cn = new Consumer<Integer>() {
	
			@Override
			public void accept(Integer t) {
				System.out.println( t + "");
			}};
		
		Consumer<Integer> c1 =(i) -> System.out.println(i + " ");
		c1.accept(1);
		
		System.out.println("-------------- 4. Function R get() -----------");
		
		Function<Integer, Integer> f = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return (t / 10 * 10);
			}};
		f.apply(10);
		
		Function<Integer, Integer> f1 = (i) ->  i / 10 * 10;
		System.out.println(f1.apply(10));
			
		System.out.println("-------------- 5. Predicate<T> R get() -----------");
		
		Predicate<Integer> p = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return t % 2 == 0;
			}};
		System.out.println("2는 짝수입니까? : " + p.test(2));
		
		Predicate<Integer> p1 = (t) -> t % 2 == 0;
		System.out.println("3은 짝수인가요> : " + p1.test(3));
	}

}
