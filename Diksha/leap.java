package assignment;

import java.util.Scanner;

public class leap {

	public static void main(String[] args)
	{
	Scanner n=new Scanner(System.in);
	  System.out.println("Enter a year:");
    int a=n.nextInt();
  
    if(a%4==0) {
    	System.out.println(a+" is a leap year");
    }
    else{
    	System.out.println(a+" Is not a leap year");
    }
    }

}
