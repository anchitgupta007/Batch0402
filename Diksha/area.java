//program to find area & parameter of circle
package assignment;

import java.util.Scanner;

public class area {

	public static void main(String... args) {
		Scanner are= new Scanner(System.in);
		System.out.println("Please enter the radius of a circle:");
		int r=are.nextInt();
		double a=3.14*r*r;
		System.out.println("Area of circle:"+a);
		float p=(float) (2*3.14*r);
	System.out.println("Perimeter of circle is:"+p);
		

	}

}
