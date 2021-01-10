package com.test06;

import java.util.Scanner;

public class Triangle extends AreaImpl {

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변을 입력해주세요");
		int x = sc.nextInt();
		System.out.println("높으를 입력해 주세요");
		int y = sc.nextInt();
		double res = x*y/2.0;
	//	setResult(res + "";)
	}

	public void print() {
		
	}
}
