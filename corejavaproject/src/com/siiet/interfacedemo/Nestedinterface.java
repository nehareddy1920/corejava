package com.siiet.interfacedemo;

public class Nestedinterface implements Myinterface.Myinnerinterface {

	@Override
	public void print() {
		System.out.println("This is inner interface");
		
	}
public static void main(String[] args) {
	Nestedinterface n=new Nestedinterface();
	n.print();
	System.out.println(Nestedinterface.id);
}
}
