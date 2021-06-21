package assignment;

import java.util.Scanner;

public class forfactorial {

	public static void main(String[] args) {
	Scanner n=new Scanner(System.in);
	System.out.println("Enter the any number");
	int a=n.nextInt();
	int fact=1;
	for(int i=1;i<=a;i++) {
		fact=fact*i;
		
		
	}
	System.out.println("Factorial of number is:"+fact);
		}

}
