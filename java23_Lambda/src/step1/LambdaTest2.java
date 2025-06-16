package step1;

@FunctionalInterface
interface Workable{
	String monthPayment(String ename, double weekSal);
	
}

class Employee{
	String ename;
	double weekSal;
	
	public Employee() {
		
	}
	
	public Employee(String ename, double weekSal) {
		super();
		this.ename = ename;
		this.weekSal = weekSal;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public double getWeekSal() {
		return weekSal;
	}
	
	public void setWeekSal(double weekSal) {
		this.weekSal = weekSal;
	}
	
	//work()함수와 Workable Has a 관계
	public void work(Workable wa) {
		String result = wa.monthPayment(ename, weekSal);
		System.out.println("Rsult = " + result);
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", weekSal=" + weekSal + "]";
	}
	
}

public class LambdaTest2 {
	public static void main(String[] args) {
		Employee em = new Employee("James", 500.0);
		
		// 계속 해온 방식
		em.work(new Workable() {
			@Override
			public String monthPayment(String ename, double weekSal) {
				double mSal = weekSal * 4;
				return mSal + "";
			}
			}
		);
		
		// 주급 * 4 해서 보내기
		// return을 생략할 수 없다
		em.work((ename, weekSal) -> {
				return ename + " : " + weekSal * 4;
			}
		);
	
	}
}
