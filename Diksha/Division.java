package assignment;

import java.util.Scanner;

public  class Division {
	public static void main(String... args) {


		Scanner s=new Scanner (System.in);
		System.out.println("Enter the Dividend");
		int a=s.nextInt();
		System.out.println("Enter the Divisor");
		int b=s.nextInt();
		int div=a/b;
		if(a>b) {
			
			System.out.println("Division result is "+div);
		}
		else {
			System.out.println("Dividend is less than divisor");
		}
	}
}
