package self.bank.vo;

public class Account {
	static final public int BALANCE_INT = 1000;
	private int balance = BALANCE_INT;

	public Account() {
		
	}
	
	public Account(int amount){
		balance = amount;
	}
	
	public int getBalance() {
		return balance;
	}

	public void desposit(int amount) {
		if(amount >= 1000) {
			balance += amount;
		}else {
			System.out.println("입급은 1000원 이상입니다.");
		}
	}

	public void withdraw(int withdraw) {
		if(balance < withdraw) {
			System.out.println("금액이 부족합니다.");
		}else {
			balance -= withdraw;
		}
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}

}
