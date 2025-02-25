package javaproject;

import java.util.Scanner;

public class dog {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=sc.nextInt();
		System.out.println("enter b value:");
		float b=sc.nextFloat();
		System.out.println("enter bool value:");
		boolean bool=sc.nextBoolean();
		System.out.println("entear s value:");
		String s=sc.next();
		System.out.println("entear st value:");
		String st=sc.nextLine();
		System.out.println(a+""+b+""+bool+""+s+""+st);
	}
}
