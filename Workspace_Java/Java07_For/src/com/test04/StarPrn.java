package com.test04;

public class StarPrn {
	/*
	 * ★	
	 * ★★
	 * ★★★
	 * ★★★★
	 * ★★★★★
	 */
	public void prn01() {
		//i는 줄
		for(int i=0; i < 5; i++) {
			// j는 * 갯수(0+1,1+1,2+1,3+1,4+1)
			for(int j=0; j < i+1; j++) {
				System.out.printf("★");
			}
			System.out.println();
			}
	}

	/*
	 * ★★★★★
	 * ★★★★
	 * ★★★
	 * ★★
	 * ★
	 */
	public void prn02() {
		for(int i = 0; i < 5; i++) {
            for(int j = 5; j > i; j--) {   //센세꺼 for(int j=0; j < 5-i; j++)
               System.out.printf("★");
            }
         System.out.println();
         }
		/*
		 * for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.printf("★");
			}
				System.out.println();
		}
		 */
	}
	
	/*
	 *     ★
	 *    ★★
	 *   ★★★
	 *  ★★★★
	 * ★★★★★
	 */
	public void prn03() {
		//i는 줄
		for(int i=0; i<5; i++) {
			
			//j는 빈칸(4-0, 4-1, 4-2, 4-3, 4-4)
			for(int j=0; j < 4-i; j++) {
				System.out.printf(" ");
			}
			
			//k는 별(0+1, 1+1, 2+1, 3+1, 4+1)
			for(int k=0; k < i+1; k++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
	/*
	 * ★★★★★
	 *  ★★★★
	 *   ★★★
	 *    ★★
	 *     ★
	 */
	public void prn04() {
		
		for(int i=0; i < 5; i++) {
			
			for(int j=0; j < i; j++) {
				System.out.printf(" ");
			}
		
			for(int k=0; k < 5-i; k++) {
				System.out.printf("★");
			}
			System.out.println("");
		}
		
	}
	/*
	 *     ★
	 *    ★★★
	 *   ★★★★★
	 *  ★★★★★★★
	 * ★★★★★★★★★
	 */
	public void prn05() {
		
		for(int i =0; i < 5; i++) {
			
			for(int j=0; j < 4-i; j++) {
				System.out.printf(" ");
				
			}
			for(int k=0; k < 2*i+1; k++) {
				System.out.printf("★");
				
			}
			System.out.println();
		}
		
	}

}
