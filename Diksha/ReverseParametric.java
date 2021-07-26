package oops.methods.parametric;

import java.util.Scanner;

public class ReverseParametric {
	public int reverse(int num) {
		int rev=0,rem=0;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=n.nextInt();
		ReverseParametric rev=new ReverseParametric();
		System.out.println(rev.reverse(num));
	}

}
