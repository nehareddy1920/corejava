package com.siiet.scannerclass;

public class Taxcalculation {
public void calculateTax(Person p) {
	if(p.getIncome()<=1600) {
		p.setTax(0);
	}
	
		else if(p.getIncome()>1600 && p.getIncome()<3000) {
			p.setTax(5);
	
			}
		
		else {
			p.setTax(10);
		}
}
}



		
