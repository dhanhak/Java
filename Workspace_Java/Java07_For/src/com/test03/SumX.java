package com.test03;

public class SumX {
	/*
	 *  1  2  3  4  5
	 *  6  7  8  9 10
	 * 11 12 13 14 15
	 * 16 17 18 19 20
	 * 21 22 23 24 25
	 * 
	 * 이렇게 출력하고
	 * X의 합을 출력하자
	 * X =117
	 * 
	 */

	public static void main(String[] args) {
		
		prn01();
		
	}
	public static void prn01() {
	
		int count =1;
		int sum =0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if((i == j)||(i + j == 4)) {
					sum += count;
				}
				
				System.out.printf("%3d", count++);
			}
			
			System.out.println("");
		}
		System.out.println("X의 총합 :"+ sum);
	}
}







/*
 * public static void prn01() {
		
		for(int a = 1; a <= 25; a++) {
			if(a < 10) {
				System.out.printf(" " + a + " ");
			}else {
				System.out.printf(a + " ");
			}
			if(a % 5==0) {
				System.out.println("");
			}
			
			}
	}
*/