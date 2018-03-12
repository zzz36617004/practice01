package com.project1.homework;

import java.util.Scanner;

public class Problem07 {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 1;
		System.out.println("================\n[숫자맞추기 게임 시작]\n================");
		while (true) {
			System.out.print(">>");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			if (num > x) {
				System.out.println("더 높게");

			} else if (num < x) {
				System.out.println("더 낮게");
			} else {
				System.out.print("맞았습니다.\n게임을 종료하시겠습니까?(y/n)>>");
				Scanner sc1 = new Scanner(System.in);
				String countine = sc1.nextLine();
				if (countine.equals("y")) {
					System.out.println("================\n[숫자맞추기 게임 종료]\n================");
					break;
				} else {
				}
				
			}

		}
	}
}
