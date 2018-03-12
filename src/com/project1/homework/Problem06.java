package com.project1.homework;

import java.util.Scanner;

public class Problem06 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner sc1 = new Scanner(System.in);
		int num1 = sc1.nextInt();
		int sum=0;
		if(num1%2==0){
			for(int i=2;i<=num1;i=i+2) {
				sum=i+sum;
			}
		}
		else {
			for(int i=1;i<=num1;i=i+2) {
				sum=i+sum;
			}
		}		
		System.out.println("결과값 : "+sum);	
		sc1.close();
		}
	}

