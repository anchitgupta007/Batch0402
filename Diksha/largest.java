package assignment;

import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
	Scanner n=new Scanner(System.in);
    System.out.println("Enter first number");
	int a=n.nextInt();
	System.out.println("Enter 2nd number");
	int b=n.nextInt();
	System.out.println("Enter 3rd number");
	int c=n.nextInt();
	if(a>b && a>c) {
		System.out.println(a+ " is largest number");
	}
	else if(b>a && b>c) {
		System.out.println(b+ " is largest number");
	}
	else {
		System.out.println(c+ " is largest number");
	}
	

	}

}
