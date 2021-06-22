package assignment;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=n.nextInt();
        int temp=num;
    	int rem;
    	int rev=0;
    	while(num>0) {
    		rem=num%10;
    		rev=rev*10+rem;
    		num=num/10;
    		//System.out.println(temp+"............."+rev);
    	}
    	if(temp==rev) {
    		System.out.println(temp+" is palidrome number");
    	}
    	else {
    		System.out.println(temp+" is not a palidrome  number");
    	}

	}

}
