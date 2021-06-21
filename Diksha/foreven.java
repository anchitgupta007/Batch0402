package forloop;

import java.util.Scanner;

public class foreven {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num =n.nextInt();
	    int even=0;
        int odd=0;
        for(int i=1;i<=num;i++) {
        	if(i%2==0) {
        even=even+1;
        
        	}
        	
        	else {
        		odd=odd+1;
        		
        		}
        } 
        System.out.println("total even numbers in given number:"+even);
        System.out.println("total odd numbers in gven number :"+odd);

	}

}
