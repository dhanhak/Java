package com.cal02;

import java.util.Calendar;

//달력만들기
//java.util.Calendar사용해서 만들기
public class CalendarUseApi {
	
	public void prn(int year, int month) {
		
		//Calendar 객체 생성
		//Calendar cal = new Calendar(); X -> singleton
		Calendar cal = Calendar.getInstance();
		
		//달력 윗부분
		System.out.printf("\t\t%d년 %d월\n", year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//시작 날짜 설정
		//month-1 시작인 이유는 Calendar 0부터 시작이여서
		cal.set(year, month - 1, 1); 	//현재날짜
		
		//일요일이 1, 월요일은2, ... 토요일7
		int start = cal.get(Calendar.DAY_OF_WEEK);
		
		//일요일이 1이기 때문에 1부터 시작
		for(int i = 1; i < start; i++) {
			System.out.printf("\t");
		}
		
		//달력 출력
		//getActualMaximum 현재 월의 가질수 있는 최대 값
		for(int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
			System.out.printf("%d\t",i);
			if(start % 7 == 0) {
				System.out.println();
			}
			start++;
		}
	}

}
