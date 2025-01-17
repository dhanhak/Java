package com.test01;

public class Mtest {

	// 전역 변수
	// public static int ten = 10;

	// 상수 : 변수 앞에 final
	public static final int MY_TEN = 10;

	public static void main(String[] args) {

		// 전역변수와 지역변수의 이름이 같으면 지역변수가 우선!!
		// 지역 변수
		int ten = 100;
		System.out.println(ten);

		System.out.println(op01(MY_TEN, 3));
		System.out.println(op02());

		op03(MY_TEN, 3);

		//System.out.println(op04());
		op04();
		op05();
		
		String five = (op05()) ? "재밌다" : "즐겁다";
		System.out.println(five);
		
		op06();
		op07();
		
		
	}

	public static String op01(int a, int b) {
		System.out.printf("=====================================\n");
		// 1. 사칙 연산
		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d 의 몫 : %d, 나머지 : %d\n", a, b, a / b, a % b);

		return "사칙 연산 끝!\n";

	}

	public static String op02() {
		System.out.printf("=====================================\n");
		// 대입 연산

		int res = 0;
		System.out.println("res : " + res);
		res = res + 10;
		System.out.println("res : " + res);
		res = res - 5;
		System.out.println("res : " + res);
		System.out.println(res - 5);
		System.out.println(res);

		res += 5; // res = res+5;
		System.out.println(res);

		res *= 2; // res = res*2;
		System.out.println(res);

		return null;
	}

	public static void op03(int a, int b) {
		System.out.printf("=====================================\n");
		// 증감 연산
		// ++ / --;
		// 변수의 앞뒤에 증가/증감 연산자를 붙이게 되면, 변수가 가진 값을 1씩 증가/증감 하게된다.
		// 전위 연산 : 연산자를 변수 앞에 붙여서 연산을 먼저 하게되고, 값을 나중에 리턴한다.
		// 후위 연산 : 연산자를 변수 뒤에 붙여서 값을 먼저 리턴하고, 연산을 나중에 하게된다.

		System.out.println(a);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);

		// a=12, b=3;
		int result = a++ + --b + b++ + ++a;
		// result =
		// 12 + 2 + 2 + 14
		System.out.println(result);
		System.out.println("a : " + a);
		System.out.println("b : " + b);

	}

	public static void op04() {
		System.out.printf("=====================================\n");
		// 논리 연산 : &(and), |(or), &&, ||

		System.out.println(true & true); // 참 그리고 참 : 참;
		System.out.println(true & false); // 참 그리고 거짓 : 거짓;
		System.out.println(false & true); // 거짓 그리고 참 : 거짓;
		System.out.println(false & false); // 거짓 그리고 참 : 거짓;

		System.out.println(true | true); // 참 또는 참 : 참;
		System.out.println(true | false); // 참 또는 거짓 : 참;
		System.out.println(false | true); // 거짓 또는 참 : 참;
		System.out.println(false | false); // 거짓 또는 거짓 : 거짓;
		
		System.out.println(true && true); //참 그리고 참 : 참
		System.out.println(true && false);//참 그리고 거짓 : 
		System.out.println(false && true);//거짓 그리고 거짓
		System.out.println(false && false);//거짓 그리고 거짓
		
		System.out.println(true || true); 
		System.out.println(true || false); 
		System.out.println(false ||true); 
		System.out.println(false || false); 
		
		int a= 2;
		int b =3;
		System.out.println((a > b) && (b > a));

	}

	public static boolean op05() {
		System.out.printf("=====================================\n");
		//5. 삼항연산
		//(조건) ? 참일때 리턴값 : 거짓일때 리턴 값;
		
		int a = MY_TEN;
		int b = 7;
		int result = (a > b) ? a - b : b - a;
		System.out.println(result);
		
		String res = (a > b) ? "a가 b보다 크다." : ((a < b)? "a가 b보다 작다." : "a 와 b는 같다.");
		System.out.println(res);
		
		return false;
		
		//System.out.println("끝났냐?");
	}
	
	public static void op06() {
		System.out.printf("=====================================\n");
		//6.비교연산 (>,<,>=,<=,==)
		System.out.println(true == false);
		System.out.println(MY_TEN != 3);
		
	}
	public static void op07() {
		//7. 비트연산 (&,|,^,~,<<,>>,...) : 값을 0, 1 비트 상태에서 연산한 결과를 리턴
		
		int a = 10;
		// 0000 0000 0000 0000 0000 0000 0000 1010;
		int b = 2;
		// 0000 0000 0000 0000 0000 0000 0000 0010;
		
		System.out.println(a & b);
		// 0000 0000 0000 0000 0000 0000 0000 1010;
		// 0000 0000 0000 0000 0000 0000 0000 0010;
		//&----------------------------------------------
		// 0000 0000 0000 0000 0000 0000 0000 0010;
		
		System.out.println(a | b);
		// 0000 0000 0000 0000 0000 0000 0000 1010;
		// 0000 0000 0000 0000 0000 0000 0000 0010;
		//|----------------------------------------------
		// 0000 0000 0000 0000 0000 0000 0000 1010;
		
		System.out.println(~a);
		// 0000 0000 0000 0000 0000 0000 0000 1010;
		//~------------------------------------------
		// 1111 111 1111 1111 1111 1111 1111 0101;
		
		System.out.println("------------------------------");
		int c = 10;
		System.out.println(c >> 2);
		// 00 0000 0000 0000 0000 0000 0000 0000 10;
		System.out.println(Integer.toBinaryString(c >> 2));
		System.out.println(c << 4);
		// 00 0000 0000 0000 0000 0000 0000 1010 0000 ;
		System.out.println(Integer.toBinaryString(c << 4));
		
		
	}
}


















