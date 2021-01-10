package com.test01;

public class MTest {
	
	private static String str ="The String class represents character strings.";
	
	public static void main(String[] args) {
		String s ="Hello";
		System.out.println(s + 1 + 2);
		System.out.println(1+2+s);
		System.out.println(s);
		
		s = 1+2+s;
		System.out.println(s);
		
		String h = "Hello";
		System.out.println(h);
		
		System.out.println(s == h);
		
		String newS = new String("Hello");
		System.out.println(newS);
		
		System.out.println(s == newS);
		System.out.println("---------------------------");
		
		//1.str의 길이
		test01();
		
		//2.str 전체 대문자
		test02();
		
		//3.str 전체 소문자
		test03();
		
		//4.str에서 첫번째로 나오는 c의 위치(인덱스)
		test04();
		
		//5.class 단어를 찾아서 java로 바꿔서 출력
		test05();
		
		//6. character 단어를 찾아서 대문자로 변환후, 전체출력
		//test06();
		
		//7.str을 char[]로 출력하되, 'c' 만 출력하자
		//그리고 c의 갯수를 출력하자
		test07();
		
		//8.str을 char[]로 출력하되, 대문자만 출력하자.
		//그리고, 대문자의 갯수를 출력
		test08();
		
		//9.str사이의 공백 제거후 출력
		test09();
		
		//10.전체를 역순으로 출력
		test10();
		
		
	}
	private static void test10() {
		int arrIndex =0;
		
		char[] ch = new char[str.length()];
		
		for(int i= str.length()-1; i>=0;i--) {
			ch[i] = str.charAt(arrIndex);
			arrIndex++;
		}
		System.out.println(ch);
	}
	private static void test09() {
		System.out.println(str.trim());
		System.out.println(str.replace(" ", ""));
		System.out.println(str.replaceAll(" ", ""));
	}
	private static void test08() {
		char[] ch = str.toCharArray(); 
		str = str.toUpperCase();
		int count =0;
		
		for(int i =0; i < ch.length; i++) {
			//ch[i] -> "char" -> isUpperCase();
			if(Character.isUpperCase(ch[i])) {
				System.out.printf("%c ", ch[i]);
				count++;
			}
		}
			System.out.println("\n대문자의 갯수 : " + count);
	}
	private static void test07() {
		char[] ch = str.toCharArray();  //풀어야함
		int count =0;
		
		for(int i =0; i < ch.length; i++) {
			//System.out.printf("%c",ch[i]);
			if(ch[i]=='c'||ch[i]=='C') {
				System.out.printf("%c ",ch[i]);
				count++;
			}
		}
		System.out.println("\nc의 갯수 : " + count);
	}
	/*private static void test06() {
		//character 찾아서
		String target = "charater";
		int start = str.indexOf(target);
		int end = start + target.length();
		String upper = str.substring(start, end);
		
		//대문자로 변환
		upper = upper.toUpperCase();
		
		//전체 출력
		System.out.println(str.replace(target, upper));		
		
	}*/
	private static void test05() {
		System.out.println(str.replace("class", "java"));
		
		
	}
	private static void test04() {
		System.out.println(str.indexOf('c'));
		
	}
	private static void test03() {
		System.out.println(str.toLowerCase());
		
	}
	private static void test02() {
		System.out.println(str.toUpperCase());
		
	}
	private static void test01() {
		System.out.println(str.length());
		
	}

}




















