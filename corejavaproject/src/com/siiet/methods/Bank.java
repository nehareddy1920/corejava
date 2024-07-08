package com.siiet.methods;

public class Bank {
	public void greetcustomer() {
		System.out.println("hello welcome to our bank");
	}
		
		 int currentbalance = 1000;
		 
		 public void deposit(int amount) {
	currentbalance=currentbalance+amount;
	System.out.println("amount is deposited");
		 }
		 public void withdrawal(int amount) {
			 currentbalance=currentbalance-amount;
				 System.out.println("amount is withdrawn");
		 }
			 
		
			 
			 
		
		 public int getCurrentbalance() {
			return currentbalance;
		}
		public void setCurrentbalance(int currentbalance) {
			this.currentbalance = currentbalance;
		}
		public static void main(String[] args) {
			Bank b=new Bank();
			b.greetcustomer();
			System.out.println("current balance is:"+b.getCurrentbalance());		
			b.deposit(200);
			System.out.println("current balance is:"+b.getCurrentbalance());			
			b.withdrawal(100);
			System.out.println("current balance is:"+b.getCurrentbalance());
			System.out.println("transaction is completed");
			
		}
}
		 
	
			 
			 
			 
			 
		 
	

