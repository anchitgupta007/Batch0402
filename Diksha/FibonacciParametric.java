package oops.methods.parametric;

import java.util.Scanner;

public class FibonacciParametric {

	public void fibonacci(int x) {
		int f1 = 0, f2 = 1,c;
		System.out.println(f1);
		System.out.println(f2);
		for(int i=1;i<=x;i++) {
			
			c=f1+f2;
			f1=f2;
			f2=c;
			System.out.println(c);
			}
	}
		
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x = n.nextInt();
		FibonacciParametric fab=new FibonacciParametric();
		fab.fibonacci(x);

	

	

	}
}
