package oops.methods.parametric;

import java.util.Scanner;

public class FactorialParametric {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x = n.nextInt();
		FactorialParametric fact = new FactorialParametric();
		fact.factorial(x);
		
	}

	public void factorial(int x) {
		
		int fact = 1;
		for (int i = 1; i <= x; i++) {
			fact = fact * i;

		}
		System.out.println("Factorial of " + x + " is:" + fact);

	}

}
