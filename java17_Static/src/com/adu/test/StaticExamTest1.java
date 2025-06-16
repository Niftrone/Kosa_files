/*
 * static 키워드 성질
 * 1. static이 붙은 멤버(필드, 메서드)는 객체생성 과정을 건너뛴다.
 * 2. 객체생성안해도 미리 메모리에 올라가 있다.
 * 3. 자바는 2단계 컴파일
 * 컴파일   ~.java   -----> ~.class
 * 
 * 실행
 * 		.class 파일 JVM Loader(static 메모리 등록)
 * 		--> byteCode Verifier
 * 		--> Interpreter
 * 		--> 실행
 * 
 * 4. static한 필드, 메소드를 사용할 때는 
 * 	  클래스이름.필드
 * 	  클래스이름.메서드()
 * 	  Integeer.parseInt()
 * 	  Math.random()
 * 	  System.arraycopy()
 * 	  Araays,copyOf()
 * 	  System.out
 * 
 * 5. static 변수는 로컬 레벨에서는 사용못함
 *    필드레벨만 사용가능
 * 6. static 키워드는 final과 같이 사용되는 경우가 많다.
 * 7. static한 변수는 생성된 객체들에서 공유한다!!
 */

package com.adu.test;
//static 은 static 끼리 묶인다
class Member {
	static int ssn = 1234;
	static String name = "길동";
	int age = 19;
	
	public static void printMember() {
		System.out.println("이름 : " + name);
	}
	public void printMember2() {
//		static int count = 0 ;
		System.out.println("이름 : " + name);
	}
	public static void printMember3() {
		
		//System.out.println("이름 : " + name + ", 님은 " + age + "살");
	}
}
public class StaticExamTest1 {

	public static void main(String[] args) {
		Member me = new Member();
		Member.printMember();
		me.printMember2();
	}

}
