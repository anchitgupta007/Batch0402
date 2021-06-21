package assignment;

import java.util.Scanner;

public class readint {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter any number:");
		int a=n.nextInt();
		int sum=0;
		while(a!=0) {
			sum=sum+a%10;
			a=a/10;
		}
		System.out.println("Sum of digits is :"+sum);

	}

}
