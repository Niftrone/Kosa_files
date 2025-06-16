package step2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Student{
	String name;
	int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	
	
}

public class Stream01Student {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
					new Student("SCOTT", 90),
					new Student("BLAKE", 80),
					new Student("KING", 95)
				);
		Stream<Student> stream = students.stream();
		IntStream intStream = stream.mapToInt(stu -> stu.getScore());
		double average = intStream.average().getAsDouble();
		System.out.println("학생들 평균점은 " + (int) average);
		
		//Method Chaining
		double avg = students.stream()
					.mapToInt(st -> st.getScore())
					.peek(System.out::println)
					.average()
					.getAsDouble();
		System.out.println("학생들 평균점은 " + (int) avg);
		
		System.out.println("\n--------Map----------");
		long count = students.stream()
				.map(s->s.getName())
				.count();
		System.out.println(count);
		
		System.out.println("\n--------중간연산자(filter,Map) | 최종연산자(anyMatch)----------");
		boolean flag = students.stream()
				.anyMatch(d -> d.getName().equals("KING"));
		System.out.println( "KING 이라는 사람 있나요? : " + flag);
	}
	
}

/*
 * 중간연산자
 * map, filter, mapToInt
 * peek
 * distinct
 * limit
 * 
 * 최종연산자
 * anyMatch
 * count
 * average
 * forEach
 * collect
 * */
