package com.edu.exception.test2;


/*
 * 사제 폭탄
 * */
class ZeroBoom extends Exception{
	ZeroBoom(){
		this("이것은 zeroboom 입니다");
	}
	ZeroBoom(String message){
		super(message);
	}
}

public class UserExecptionTest2{

	public static void main(String[] args) {
		Users u = new Users();
		try {
			System.out.println("go를 호출합니다.");
			u.go();
		} catch (ZeroBoom e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("여기가 마지막입니다.");
	}

}

class Users{
	public void go() throws ZeroBoom {
		int i = 10; int j=0;
		// 저 아랫부분에서 i를 j로 나누는 연산이 진행된다...
		if(j==0)
			throw new ZeroBoom();
	}
}