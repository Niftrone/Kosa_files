package step1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStreamTest1 {

	public static void main(String[] args) {
		// 리스트 생성
		List<String> fruits = Arrays.asList(
								"Apple", "Melon", "Banana", 
								"Apple", "Orange", "Grape", "Grape",
								"Water Melon", "Banana");
		
		Stream<String> stream = fruits.stream();
//		stream.distinct().forEach(System.out :: println);
		List<String> last = stream.distinct().limit(3).sorted(Comparator.reverseOrder()).toList();
		System.out.println(last);
	}

}
