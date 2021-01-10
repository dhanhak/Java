package com.test01;

public class IfTest {

	public static void main(String[] args) {
		//배수 확인하는 힌트 '%'나머지 연산자
		//1.입력받은 수가 5의 배수이면, "5의 배수 입니다." 를 출력!
		test01(10);
		//2.입력받은 수가 2의 배수이면서 3의 배수이면, "2와 3의 배수입니다" 를 출력.
		//	아니라면, "2와 3의 배수가 아닙니다" 를 출력
		test02(7);
		//3.입력받은 문자형 값 하나가 소문자라면 "소문자 입니다"
		//	대문자라면 "대문자 입니다" 출력
		//	hint : java.lang.Character
		test03('A');
	}
	
	public static void test01(int i ) {
		if(i%5 == 0) {
			System.out.println("5의 배수입니다.");
		}	
	}
	
	public static void test02(int i) {
		/*
		if((i%2 == 0) && (i%3 == 0)) {
			System.out.println("2와 3의 배수입니다");
		}else {
			System.out.println("2와 3의 배수가 아닙니다");
		}	*/
		
		if(i%2 == 0) {
			if(i%3 == 0) {
				System.out.println("2와 3의 배수입니다");
			} else {
				System.out.println("2와 3의 배수가 아닙니다.");
			}
		}else {
			System.out.println("2와 3의 배수가 아닙니다.");
		}
	}
	
	public static void test03(char c) {
		
		//삼항문항 응용
		String res = (Character.isLowerCase(c))? "소문자 입니다." : (Character.isUpperCase(c))?  "대문자 입니다." : ""; //null;
		
		System.out.println(res);
	
	
	
		/////////

		if ((97 <= c) && (122 >= c)) {
			System.out.println("소문자입니다.");
		}else if (Character.isUpperCase(c)) {
			System.out.println("대문자 입니다.");
		}
	
		
		
		/////////
		if (Character.isLowerCase(c)) {
			System.out.println("소문자입니다.");
		}else if(Character.isUpperCase(c)){
			System.out.println("대문자입니다.");
		}
	}
}

		//혼자뻘짓
		/*if(c=='a') {
			System.out.println("소문자 입니다");
		}else if(c=='A') {
			System.out.println("대문자 입니다");
		}
		
	}*/

