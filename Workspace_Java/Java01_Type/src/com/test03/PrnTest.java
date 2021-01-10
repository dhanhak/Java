package com.test03;

public class PrnTest {
	
		
		/*
		  * System.out.print() - 줄바꿈 없음
		  * System.out.println() - 줄 바꿈 포함
		  * 
		  * System.out.println(String, format, Object, Object, ..., args)
		  * java.util.Format
		  */
		
	public static void main(String[] args) {
		int i = 100;
		System.out.print("1. i : \\" + i + "\n");
		System.out.println("2. i \t :" + i);
		System.out.printf("3. i : %10d", i);
		System.out.println("--------------");
		
		//시험점수 결과는 100(su)점이고, 학점은 'A'(ch)가 나왔다.
		//나의 오늘 감정지수는 90.50%(d) 이다.
		
		int su = 100;		//10자리
		char ch = 'A';		//5자리
		double d = 90.50d;	//5자리(소수점 2자리)
		//System.out.printf() 를 쓰자
		
		System.out.printf("시험점수 결과는 %10d점이고, 학점은 %5c 가나왔다. \n 나의 오늘 감정지수는 %5.2f%% \n",su, ch, d );
		
		
		
		int age = 28;
		String name = "박정수";
		System.out.printf("오늘은 11\\24입니다. 내나이는 %d입니다, 제이름은 %s입니다.", age , name);
		
		
		
	}
}
