package com.adu.test;

/*
 * 6. static 키워드는 final과 같이 사용되는 경우가 많다
 * 
 * Access Modifier ::: public < protected < private 접근 지정자
 * Usage Modifier ::: static, final, abstract 순서 상관 X
 * 
 * static final
 * final static 순서 안중요하다.
 * 
 * --------------------------------------
 * final :: 마지막이라는 의미를 가지는 키워드
 * static final + 변수 --> 마지막 변수라는 의미 --> 상수값 지정
 * final + class --> 마지막 클래스라는 의미 --> 상속 금지
 * final + method --> 마지막 메소드라는 의미 --> 오버라이딩 금지
 * 
 * */
class A{
	public final static int BASE_SALARY = 40000;//값 변경 금지
	public final String test() {
		return "오버라이딩 금지";
	}
}


final class B{ // 상속 금지.. 자식클래스 만들지 못함
	
}

//class C extends B{
//	
//}

class D extends A{
//	public final String test() {
//		return "오버라이딩 금지" + 1;
//	}
}


public class StaticExamTest2 {

//	public static void main(String[] args) {
//		A.BASE_SALARY = 100;
//	}

}
