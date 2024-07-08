package com.siiet.constructor;

public class Conexample {
	Conexample(){
		System.out.println("this is default constructor");
		
	}
	Conexample(int i){
		System.out.println("Constructor with single parameter");
	}
	Conexample(int i,int j){
		System.out.println("Constructor with two parameters");
	}
	public static void main(String[] args) {
		Conexample c=new Conexample();
		Conexample cone=new Conexample(5);
		Conexample ctwo=new Conexample(2,8);
		
	}
}
