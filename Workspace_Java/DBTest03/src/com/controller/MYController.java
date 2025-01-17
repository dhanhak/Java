package com.controller;

import java.util.List;
import java.util.Scanner;

import com.biz.MYTestBiz;
import com.dto.MYTestDto;

public class MYController {
	
	private static Scanner sc = new Scanner(System.in);
	
	// view
	public static int getMenu() {
		StringBuffer sb = new StringBuffer();
		sb.append("1.전체출력\n")
		.append("2.선택출력\n")
		.append("3.추	가\n")
		.append("4.수	정\n")
		.append("5.삭	제\n")
		.append("6.종	료\n")
		.append("input select :");
		System.out.println(sb);
		int select = sc.nextInt();
		
		return select;
		
	}
	public static void main(String[] args) {
		int select = 0;
		MYTestBiz biz = new MYTestBiz();
		
		do {
			select = getMenu();
			
			switch(select) {
			case 1:
				//전체 출력
				List<MYTestDto> list = biz.selectList();
				
				for(MYTestDto dto : list) {
					System.out.printf("%3d %10s %10s\n", dto.getMno(), dto.getMname(), dto.setNickname());
				}
				break;
			case 2: 
				// 선택 출력
				break;
			case 3:
				//추가
				break;
			case 4:
				//수정
				break;
			case 5:
				//삭제
				break;
			case 6:
				System.out.println("프로그램이 종료되었습니다...");
			
			}
		}while(select != 6);
	}

}













