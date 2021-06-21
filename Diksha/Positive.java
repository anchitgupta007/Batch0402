package assignment;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter a number");
			int a=n.nextInt();
			if(a>=0) {
				System.out.println(a+ " is a +ve number");
			}
			else  {
				System.out.println(a+ " is a -ve number");
			}

	}

}
