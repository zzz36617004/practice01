package com.project1.homework;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		for(int i=1;i<=num;i++) {
			for(int x=1;x<=i;x++) {
				System.out.print(i);
			}

			System.out.println(" ");
		}
		sc.close();
	}
}