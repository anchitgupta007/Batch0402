//program to print area of rectangle
package assignment;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		Scanner rect=new Scanner(System.in);
		System.out.println("Enter the length of an rectangle:");
		int l=rect.nextInt();
		System.out.println("Enter the breath of an rectangle:");
		int b=rect.nextInt();
		int p=(l+b)*2;
		int a=l*b;
	System.out.println("Perimeter of rectangle is:"+p);
	
	System.out.println("Area of rectangle is:"+a);

	}

}
