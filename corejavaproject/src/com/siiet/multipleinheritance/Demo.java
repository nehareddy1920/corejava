package com.siiet.multipleinheritance;


public class Demo implements Character,Weapon{

	@Override
	public void use() {
		System.out.println("This is weapon method");
		
	}

	@Override
	public void attack() {
		System.out.println("This is character demo");
		
		
		
	}
public static void main(String[] args) {
	Demo d=new Demo();
	d.use();
	d.attack();
	
}
}
