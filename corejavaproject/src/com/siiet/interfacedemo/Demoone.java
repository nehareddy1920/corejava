package com.siiet.interfacedemo;

public class Demoone implements Interfacetwo {

	@Override
	public void print() {
		System.out.println("print");
		
		
	}

	@Override
	public void show() {
	
		System.out.println("show");
		
	}
	
public static void main(String[] args) {
	Demoone d=new Demoone();
	d.show();
	d.print();
	
}
}
