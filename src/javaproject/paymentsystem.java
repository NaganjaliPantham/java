package javaproject;

import java.util.Scanner;

interface payment{
	void pay(double amount);
}
class creditcardpayment implements payment{
	@Override
	public void pay(double amount) {
		System.out.println("amount paid:"+amount+"using credit card payment");
	}
}
class phonepaypayment implements payment{
	@Override
	public void pay(double amount) {
		System.out.println("amount paid:"+amount+"using phone pay ");
	}
}
class googlepaypayment implements payment{
	@Override
	public void pay(double amount) {
		System.out.println("amount paid:"+amount+" 4using google pay ");
	}
}
public class paymentsystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount to pay");
		double amount=sc.nextDouble();
		int uservalue;
		do {
			displaymenu();
			System.out.println("enter user value");
			uservalue=Integer.parseInt(sc.next());
			payment paymentmethod = null;
			switch(uservalue) {
			case 1:
				paymentmethod=new creditcardpayment();
				break;
			case 2:
				paymentmethod=new phonepaypayment();
				break;
			case 3:
				paymentmethod=new googlepaypayment();
				break;
			default:
				System.out.println("invalid option");
				break;
			}
			paymentmethod.pay(amount);
		}while(uservalue>0);
	}

	private static void displaymenu() {
		System.out.println("select a payment method");
		System.out.println("1.credit card payment");
		System.out.println("2.phone pay payment");
		System.out.println("3.google pay payment");
		
		
	}
}
