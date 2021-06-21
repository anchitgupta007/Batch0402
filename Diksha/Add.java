//program to add two numbers
package assignment;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the 1st value:");
		int a=n.nextInt();
		System.out.println("Enter the 2nd value:");
		int b=n.nextInt();
		int sum=a+b;
		System.out.println("Addition of 1st & 2nd value:"+sum);
		

	}

}
