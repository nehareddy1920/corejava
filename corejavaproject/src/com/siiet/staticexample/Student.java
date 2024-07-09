package com.siiet.staticexample;

public class Student {
	int rollno;
	String name;
	static String college="siiet";//static member
	
	static void change() { //static method
		
	college="sriindhu";  //changing static data member in static method
	
	
		
	}
Student(int r,String n){
	rollno=r;
	name=n;
	
}
void display() {
	System.out.println(rollno +"  "+name+" "+college);
	
	
}
}
