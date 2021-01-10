package com.test02;

public class Season {
	
	public static String prn(int month) {
		String res = null;
		
		switch (month) {
		case 12:
		case 1:
		case 2:
			res = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			res = "봄";
			break;
		case 6:
		case 7:
		case 8:
			res = "여름";
			break;
		case 9:
		case 10:
		case 11:
			res = "가을";
			break;
			default :
			res = "1~12사이의 값만 입력해주세요";
		

	}
		return res;
}
}
/*	public static void prn(int i) {

		switch (i) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("1~12 사이의 값만 입력해주세요.");
		}

	}

}*/
