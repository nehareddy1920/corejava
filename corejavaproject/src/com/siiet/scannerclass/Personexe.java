package com.siiet.scannerclass;

import java.util.Scanner;

public class Personexe {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter person name");
	String name=sc.nextLine();
	System.out.println("enter person income");
	int income=sc.nextInt();
	Person pp=new Person();
	pp.setName(name);
	pp.setIncome(income);
	Taxcalculation t=new Taxcalculation();
	t.calculateTax(pp);
	System.out.println("After modification");
	System.out.println(pp);
	

}
}
