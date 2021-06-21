//program to perform addition,subtraction,multiply,division using switch statement
package assignment;

import java.util.Scanner;

public class arithoperate {

	public static void main(String... args) {
	Scanner a=new Scanner(System.in);
	System.out.println("Please enter the value between 1 to 4");
	int p=a.nextInt(); 
	
	switch(p){
       case 1:
    		System.out.println("Enter the first number ");
    		int b=a.nextInt();
    		System.out.println("Enter the 2nd number");
    		int c=a.nextInt();
		int sum=b+c;
		System.out.println("Addition of given number is:"+sum);
		break;
	case 2:	System.out.println("Enter the first number ");
	int d=a.nextInt();
	System.out.println("Enter the 2nd number");
	int e=a.nextInt();
		int sub=d-e;
	    System.out.println("Subtraction of given numbers:"+sub);
	    break;
	case 3:	
		System.out.println("Enter the first number ");
	int f=a.nextInt();
	System.out.println("Enter the 2nd number");
	int g=a.nextInt();
		int multi=f*g;
        System.out.println("Multiplication of given number is:"+multi);
		break;
	case 4:
		System.out.println("Enter the first number ");
		int h=a.nextInt();
		System.out.println("Enter the 2nd number");
		int i=a.nextInt();
		int div=h/i;
		int mod=h%i;
		if(h>i) {
			System.out.println("Division result of given number:"+div);
			System.out.println("Remainder of given number :"+mod);
		}
		else {	
			System.out.println("Dividend(first) should be greather than divisor(2nd)");
		}
         break;
         default:
        	 System.out.println("please enter the value within range");
	
   }
	
   }
	
	}


	
	



