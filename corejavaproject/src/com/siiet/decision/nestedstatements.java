package com.siiet.decision;

import java.util.Scanner;

public class nestedstatements {
	public static void main(String[] args) {
		System.out.println("enter the result");
		Scanner sc=new Scanner(System.in);
		String result=sc.nextLine();
		
		if(result=="pass") {
			System.out.println("please wait for round2");
		}
		else {
			System.out.println("failed");
		}
		
	System.out.println("enter the round2 result");
	Scanner scr=new Scanner(System.in);
	String round2result=scr.nextLine();
	
	if(round2result=="pass") {
		System.out.println("please wait for final round");
	}
	else {
		System.out.println("you are terminated in round2");
	}
	}
}

	
	

