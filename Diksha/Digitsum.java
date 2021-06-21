package demowhile;

import java.util.Scanner;

public class Digitsum {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
			System.out.println("Enter a number:");
			int num=n.nextInt();
			int sum=0;
			int rem;
		
			while(num>0) {
				rem=num%10;
				num=num/10;
				sum=sum+rem;
			}
			System.out.println("Digit sum of the number is:"+sum);

		}

	}


