package com.test02;

/*
 *  A B C D E
 *  F G H I J
 *  K L M N O
 *  P Q R S T
 *  U V W X Y
 *  Z
 *  형태로 출력하자!.
 */

public class BreakSTest {

	public static void main(String[] args) {
		prn01();
	}

	public static void prn01() {

		int count = 0;
		char c = 'A';
		boolean stop = false;

		while (!stop) {
			while (true) {
				System.out.printf(c + " ");
				count++;
				c++;

				if (count % 5 == 0) {
					break;
				}
				if (count == 26) {
					stop = true;
					break;
				}
			}
			System.out.println("");
		}
	}
}
