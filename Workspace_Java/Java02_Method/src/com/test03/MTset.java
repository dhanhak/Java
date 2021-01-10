package com.test03;

public class MTset {
	
	public static void main(String[] args) {
		//더하기
		int mySum = MyCalc.sum(10,2);
		System.out.println(mySum);
		
		//빼기
		MyCalc.sub(10, 3);
		
		//곱하기
		//mul 메소드 호출하는데
		//아규먼트는 10,3
		//호출해서 리턴된 결과 값을
		//console에 출력하자
		double mymul = MyCalc.mul(10,3);
		System.out.println(mymul);
		//System.out.println(MyCalc.mul(10, 3));
		
		//나누기
		//MyCalc.div(10,4);  논스태틱방식
		MyCalc clac = new MyCalc();
		clac.div(10, 3);
		
	}

}
