package step1;

//Annotation 을 붙이면 컴파일 시 추상메소득 1개인지를 확인 
@FunctionalInterface
interface MyFunction{
	int max(int a, int b); // 2개의 숫자중 더 큰수를 반환하는 기능의 템플릿
}

public class LambdaTest1 {
	public static void main(String[] args) {
		//1. 익명클래스로 구현
		
		MyFunction mf1 = new MyFunction() {
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};
		System.out.println(mf1.max(1, 14));
		
		MyFunction mf = (a,b) -> a > b ? a : b;
		System.out.println(mf.max(1, 20));
		
	}

}
