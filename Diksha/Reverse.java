package demowhile;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=n.nextInt();
		int rev=0;
		int rem;
	
		while(a>0) {
			rem=a%10;
			a=a/10;
			rev=rev*10+rem;
		}
		System.out.println("Revrse of entered number is:"+rev);

	}


		
}
