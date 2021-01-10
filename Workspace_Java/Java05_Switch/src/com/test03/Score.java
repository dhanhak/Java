package com.test03;

public class Score {
	

	public double getAvg(int kor, int eng, int math) {
		
		double abc = (double) (kor + eng + math) / 3;
		
		return abc;
	}
	
	/*
	 * 1. int형 값 3개를 받아서, 3으로 나눠서 평균값을 리턴하는 getAvg 라는 메소드를 만들자.
	 * 접근은 어디서나 가능하며, non-static으로 만들자.
	 */

	public String getGrade(double abc) {
		
		String res = null;
		
		switch((int) abc / 10) {
		case 10:
		case 9:
			res = "A";
			break;
		case 8:
			res = "B";
			break;
		case 7:
			res = "C";
			break;
		case 6:
			res = "C";
			break;
		default :
			res = "F";
		}
		return res;
	}
}
	
	/*
	 * 2.double형 평균값 하나를 받아서
	 * 값이 90~100 사이면 'A'
	 * 80~89 사이면 'B'
	 * 70~79 사이면 'C'
	 * 60~69 사이면 'D'
	 * 	~59면 'F'
	 * 를 리턴하는 getGrade 메소드를 만들자.
	 * 어디서나 접근 가능하며, non-static으로 만들자
	 * 그리고, 기능은 switch로 만들자.(if 사용 금지) 
	 * 
	 * hint 나누기연산 '/'(식)
	 */
	
	//3.MTest의 main 메소드에서 getAvg와 getGrade를 사용하여 홍길동과 이순신의 등급을 출력하자.

