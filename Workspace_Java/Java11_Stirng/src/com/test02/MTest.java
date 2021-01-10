package com.test02;

public class MTest {
	public static void main(String[] args) {
		
		//sTest();
		sBufferTest();
	}
	
	//string +연산으로 연결할 때, 내부적으로 StringBuilder로 더해준다. (jdk 1.5)
	//sTest 는 주소가, hashCod가 변함
	public static void sTest() {
		//immutable
		String s ="안녕하세요.";
		System.out.println(s.hashCode());
		s += " 저는 ";
		System.out.println(s.hashCode());
		s += "박정수 입니다.";
		System.out.println(s.hashCode());
		
		System.out.println(s);
		
		System.out.println("------------");
		
		//안녕하세요 -> 하이
		System.out.println(s.replace("안녕하세요.", "하이"));
		System.out.println(s);
		
		s=s.replace("안녕하세요.", "하이");
		System.out.println(s);
		System.out.println(s.hashCode());
	}
	
	//sBufferTest 
	public static void sBufferTest() {
		//mutable
		
		StringBuffer sb = new StringBuffer();
		//method chaining
		sb.append("안녕하세요").append(" 저는 ").append("박정수입니다.");
		
		System.out.println(sb.hashCode());
		System.out.println(sb);
		
		sb.replace(0, 5, "하이");
		System.out.println(sb);
		
		//거꾸로 출력
		sb.reverse();
		System.out.println(sb);
		
		
	}
}




















