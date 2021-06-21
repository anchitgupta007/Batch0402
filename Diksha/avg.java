//program to find average of 3 numbers
package assignment;

import java.util.Scanner;

public class avg {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=n.nextInt();
		System.out.println("Enter 2nd number:");
		int b=n.nextInt();
		System.out.println("Enter 3nd number:");
		int c=n.nextInt();
		float avg=(a+b+c)/3f;
		System.out.println("Average of given numbers is:"+avg);

	}

}
