package com.test01;

public class Type02 {
	
	//정수형 Type : byte, short, int, long
	public static void main(String[] args) {
		
		//type varialbe = literal;
		//타입 변수 = 값;
		
		byte b01 = 126;
		System.out.println(b01);
		b01 = 111;
		System.out.println(b01);
		
		byte b02 = (byte) 128;   //형 변환 : casting
		System.out.println(b02);
		
		byte sumb = (byte) (b01+b02);   //정수형의 연산의 기본도 int
		System.out.println(sumb);
		
		System.out.println("-------------------");
		
		short s1 = 32767;
		System.out.println(s1);
		short s2 = 2;
		System.out.println(s2);
		
		short sumS = (short) (s1 + s2);
		System.out.println(sumS);
		
		System.out.println("----------------------");
		
		//int는 정수형의 기본
		int i = 10;
		int j = 20;
		int sum = i + j;
		System.out.println(sum);
		i = 30;
		sum = i+j;
		System.out.println(sum);
		
		System.out.println("----------------");
		
		long l1 = 30000000000l;
		long l2 = 40000000000L;
		long sumL = l1 + l2;
		System.out.println(sumL);
		
		
		
		//2진수(0b) 8진수(00) 16진수(0x)
		System.out.println(0b10);
		System.out.println(0010);
		System.out.println(0x10);
		
	}
}
















