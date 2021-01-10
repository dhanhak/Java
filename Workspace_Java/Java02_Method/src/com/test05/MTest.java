package com.test05;

public class MTest {
	public static void main(String[] args) {
		
		School.namePrn("박정수");
		int age = School.getAge();
		System.out.println(age + "세");
		// non-static
		School kh = new School();
		kh.addPrn("안양시");
		
		//School class에 만들어 놓은 1번 2번 3번 메소드를 호출하여 consloe에 출력하자.
	}

}
