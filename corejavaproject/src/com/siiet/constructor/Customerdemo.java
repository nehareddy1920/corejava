package com.siiet.constructor;

import java.util.Scanner;

public class Customerdemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		 
		System.out.println("Enter your address");
		String address=sc.nextLine();
		
		System.out.println("Enter id");
		int id=sc.nextInt();
		
		Customer c=new Customer();
		c.setName(name);
		c.setAddress(address);
		c.setId(id);
		
		System.out.println(c);
		
		
		
		
	}

}
