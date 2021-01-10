package com.test02;

public class ContinueTest {
	
	public static void main(String[] args) {
		prn01();
	}
	
		public static void prn01() {
			int i =0;
			
			while(i < 10) {
				i++;
				if(i % 2==0) {
					continue;
				}
				System.out.println(i);
			}
		}

}
