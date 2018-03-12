package com.project1.homework;

import java.util.Scanner;

public class Problem08 {
	public static void main(String[] args) {
		int deposit = 0;
		boolean end=true;
		while (end) {
			System.out.print("---------------------\n1.예금|2.출금|3.잔고|4.종료\n---------------------\n선택>");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("예금액>");
				Scanner sc1 = new Scanner(System.in);
				int in = sc.nextInt();
				deposit = in + deposit;
				break;
			case 2:
				System.out.print("출금액>");
				Scanner sc2 = new Scanner(System.in);
				int out = sc2.nextInt();
				deposit = deposit - out;
				break;
			case 3:
				System.out.println("잔고액>"+deposit);
				break;
			case 4:
				end=false;
				System.out.println("프로그램 종료");
				
				break;
			default:
				System.out.println("다시입력하세요.");
				break;
			}
		}
	}
}
