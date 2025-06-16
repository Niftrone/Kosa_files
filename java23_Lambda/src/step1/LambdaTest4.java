package step1;

@FunctionalInterface
interface Calculable{
	void calc(int a, int b);// 매개변수 2, 반환타입 없음
}

public class LambdaTest4 {

	public static void main(String[] args) {
		
		Calculable c = (a,b) -> System.out.println(a+b);
		c.calc(12, 11);
		
		action((x,y) ->{
			System.out.println("Result1 : " + (x + y) );
		});
	}
	
	public static void action(Calculable c) {
		System.out.println("action..method");
		c.calc(4, 6);
	}

}
