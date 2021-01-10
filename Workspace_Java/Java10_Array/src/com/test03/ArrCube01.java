package com.test03;

import java.util.Arrays;

public class ArrCube01 {
	/*
	 * 1 4 7
	 * 2 5 8
	 * 3 6 9
	 * 
	 * 모양의 이차원 배열을 만들어서 출력하자.
	 */
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		int cnt=1;
		// 만들기
		for(int i =0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				arr[j][i] = cnt++;
				//System.out.printf("%2d ",arr[i][j]);
			}
			//System.out.println();
		}
		
		//출력하기
		for(int i=0; i < arr.length;i++) {
			for(int j=0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
		
}
	
	
	
	/*
int[][] abc = {{1,4,7}, {2,5,8}, {3,6,9}};
		int count =1;
		for(int i=0; i < abc.length; i++) {
			for(int j =0; j < abc.length; j++) {
				System.out.printf("%d ",abc[i][j]);
				if(count % 3 ==0) {
					System.out.println();
				}
				count++;
			}
		}
		
	}*/