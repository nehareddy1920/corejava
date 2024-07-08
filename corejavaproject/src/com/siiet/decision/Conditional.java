package com.siiet.decision;

import java.util.Scanner;

public class Conditional {
	int num;
	
	public static void main(String[] args) {
		System.out.println("Enter the num value");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0) {
			System.out.println("the number is positive");
			
		}
		else {
			System.out.println("the number is negative");
			
		}
	}

		
	}


