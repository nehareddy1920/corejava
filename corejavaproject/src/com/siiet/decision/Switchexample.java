package com.siiet.decision;

import java.util.Scanner;

public class Switchexample {
	public static void main(String[] args) {
		System.out.println("Enter number between 1-3");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		switch(i) {
		case 1:		
			System.out.println("this if first statement");
			break;
		case 2:
			System.out.println("this is second statement");
			break;
			default:
				System.out.println("invalid statement");
		}
	}

}
