package com.siiet.methodoverloading;

public class Demo {
	public static void main(String[] args) {
		Addition a1=new Addition();
		Addition a2=new Addition();
		a1.add(2,3);
		a2.add(1, 2,3);
	System.out.println(a1.add(2,3));
	System.out.println(a2.add(1, 2,3));	
	
		
	}

}
