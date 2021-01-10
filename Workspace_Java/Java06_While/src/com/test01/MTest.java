package com.test01;

public class MTest {
	public static void main(String[] args) {
		//prn01();
		prn02();
		//prn03();
	}
	
	public static void prn01() {
		
		//초기값
		int i =10;
		
		//조건식
		while(i < 10) {
			System.out.println(i);
			
		//증감식
			i++;
		}
	}
	
	public static void prn02() {
		int i = 10;
		
		do {	 //do 실행후 while 실행
			System.out.println(i);
			i++;
		} while(i < 10); 
			System.out.println("while 이 끝난 후의 i : " +i);
		
	}
	
	public static void prn03() {
		
		int i = 1;
		
		while(true) {
			System.out.println(i);
			i++;
			
			if(i == 10) {
				break;
				
			}
		}
		System.out.println("while이 끝난 후의 i : " +i);
	}

}
