package forloop;

import java.util.Scanner;

public class Mulitytable {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		  System.out.println("Enter a number:");
	    int a=n.nextInt();
	    System.out.println("Enter range:");
	    int ran=n.nextInt();
	    for(int i=0;i<=ran;i++) {
	    	System.out.print(a+"*"+i);
	    	System.out.println(  "="+(a*i));
	    }

	}

}
