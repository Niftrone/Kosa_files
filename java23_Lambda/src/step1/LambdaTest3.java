package step1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Comparator 사용 시 람다형식을 적용
public class LambdaTest3 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(100,45,22,200,4,1,23,45,46,45,200);
		System.out.println("=======sort 전 ==========");
		System.out.println(list);

		//list.sort(Comparator.comparing());
		
		System.out.println("=======sort 후 ==========");
		Collections.sort(list);
		System.out.println(list);

		System.out.println("=======sort 내림차순 ==========");
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});
		
		System.out.println(list);
		
		System.out.println("=======sort 내림차순 람다 ==========");
		Collections.sort(list, (o1, o2) -> o2 - o1 );
		
		System.out.println(list);
	}
}
