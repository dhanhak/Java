package com.test03;

import java.util.Arrays;

public class ArrCube02 {
	/*	 	 0  1  2  3  4
	 * 0	 1  2  3  4  5
	 * 1	10  9  8  7  6
	 * 2	11 12 13 14 15
	 * 3	20 19 18 17 16
	 * 4	21 22 23 24 25
	 * 
	 * 모양의 이차원 배열을 만들어서 출력하자.
	 */
	public static void main(String[] args) {

		int[][] abc = new int[5][5];
		int count = 1;

		// 값저장
		for (int i = 0; i < abc.length; i++) {
			// i = 0, 2, 4
			if (i % 2 == 0) {
				// 정방향
				for (int j = 0; j < abc[i].length; j++)
					abc[i][j] = count++;

			} else {
				// 역방향
				for (int j = abc.length - 1; j >= 0; j--) {
					abc[i][j] = count++;
				}
			}
		}
		
		//출력
		for (int i = 0; i < abc.length; i++) {
			for (int j = 0; j < abc[i].length; j++) {
				System.out.printf("%3d ", abc[i][j]);
			}
			System.out.println();
		}
	}
}
	





