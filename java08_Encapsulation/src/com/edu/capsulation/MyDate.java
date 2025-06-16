package com.edu.capsulation;

//날짜 관련된 정보를 저장하는 클래스

/*
 
  월에 따라서 날짜가 달라진다.
  
  1,3,5,7,10,12 1~31
  2월 1~28
  4,6,9,11월 1~30
  
  2.
  0월 또는 0일이 나오면 안됨
  
  */
public class MyDate {
	// 해당 클래스의 멤버들끼리만 접근을 허용
	private int month;
	private int day;

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		// 필드초기화 하기전에 제어한다.
		if (month >= 1 && month <= 12) {
			this.month = month;
		} else {
			System.out.println("잘못된 월 입력입니다.");
			System.exit(0);
			return;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		switch (month) {
			case 2:
				if (day >= 1 && day <= 28) {
					this.day = day;
					break;
				} else {
					System.out.println( month + "월은 1~28일 까지입니다.");
					System.exit(0);
					//return;
				}
			case 4 :
			case 6 :
			case 9 :
			case 11 : 
				if (day >= 1 && day <= 30) {
					this.day = day;
					break;
				} else {
					System.out.println(month + "월은 1~일 까지입니다.");
					System.exit(0);
				}
			default :
				if (day >= 1 && day <= 31) {
					this.day = day;
					break;
				} else {
					System.out.println(month +"월은 1~31 일 까지입니다.");
					System.exit(0);
				}

		}

	}

}
