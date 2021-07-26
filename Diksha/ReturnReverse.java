package oops.methods.returnType;

import java.util.Scanner;

public class ReturnReverse {
	public int reverse(short num){
		short rem;
		int rev=0;
		while(num>0) {
			rem=(short) (num%10);
			rev= (rev*10+rem);
			num=(short) (num/10);
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number:");
		short num=scn.nextShort();
		ReturnReverse obj=new ReturnReverse();
		int rev=obj.reverse(num);
		System.out.println(obj.reverse(num));
		System.out.println("Reverse is :"+rev);

	}

}
