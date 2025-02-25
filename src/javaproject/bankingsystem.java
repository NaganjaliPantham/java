package javaproject;

import java.util.Scanner;

//abstract class
abstract class bankaccount{
	protected String accountholder;
	protected double balance;
	//constructor
	public bankaccount(String accountholder,double balance) {
		this.accountholder=accountholder;
		this.balance=balance;
	}
	abstract void calculateInterest();
	public void deposit(double amount) {
		balance +=amount;
		System.out.println("deposited amount is:"+amount+" new balance:"+balance);
	}
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("insufficient fund in the account");
		}
		else {
			balance-=amount;
			System.out.println("withdraw amount is:"+amount+" balance is:"+balance);
		}
	}
	public void displayBalance() {
		System.out.println("account holder:"+accountholder);
		System.out.println("balance is:"+balance);
	}
}
class savingsaccount extends bankaccount{
	private double interestRate=5.0;
	public savingsaccount(String accountholder,double balance) {
		super(accountholder,balance);
	}
	@Override
	void calculateInterest() {
		double interest=(balance*interestRate)/100;
		balance+=interest;
		System.out.println("interest added:"+interest+" present balance:"+balance);
	}
}
public class bankingsystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		bankaccount b=new savingsaccount("anjali", 30000);
		b.displayBalance();
		b.calculateInterest();
		b.deposit(40000);
		b.withdraw(20000);
	}

}
