package com.test03;

public class Mtest {
	public static void main(String[] args) {
		
		String name1 = "홍길동";
		int kor1 = 100;
		int eng1 = 40;
		int math1 = 78;
		
		Score hong = new Score();
		String hongGrade = hong.getGrade(hong.getAvg(kor1, eng1, math1));
		
		System.out.printf("%s의 등급은 %s입니다.",name1, hongGrade);
		System.out.println("");
		
		String name2 = "이순신";
		int kor2 = 100;
		int eng2 = 80;
		int math2 = 88;
		
		Score lee = new Score();
		String leeGrade = lee.getGrade(lee.getAvg(kor2, eng2, math2));
		
		System.out.printf("%s의 등급은 %s입니다.",name2, leeGrade);
	
	}

}
