package demowhile;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
	Scanner n=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=n.nextInt();
	int temp=num;
	int rem;
	int ar=0;
	while(num>0) {
		rem=num%10;
		ar=ar+(rem*rem*rem);
		num=num/10;
		System.out.println(temp+"............."+ar);
	}
	if(temp==ar) {
		System.out.println(temp+" is armstrong number");
	}
	else {
		System.out.println(temp+" is not a armstrong  number");
	}
	}
	
		
}
