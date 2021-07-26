package oops.methods.returnType;

import java.util.Scanner;

public class ReturnFcatorial {
	public int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scn.nextInt();
		ReturnFcatorial obj=new ReturnFcatorial();
		int fact=obj.factorial(num);
		System.out.println("factorial of "+num+" is:"+fact);
				

	}

}
