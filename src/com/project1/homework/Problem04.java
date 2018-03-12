package com.project1.homework;

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		int max = 0;
		for(int i=0;i<5;i++) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		if (max < num1) {
			max = num1;
		}
		
		}
		System.out.println("가장 큰수는 :"+max);
		
	}
}
