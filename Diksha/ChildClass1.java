package oops.Inheritance.SingleLevel;

import java.util.Scanner;

public class ChildClass1 extends ParentClass {

	public static void main(String[] args) {
		ChildClass1 obj=new ChildClass1();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=scn.nextInt();
		System.out.println("Enter another number:");
		int y=scn.nextInt();
		System.out.println(add(x, y));
		System.out.println(multi(x, y));
		

	}

}
