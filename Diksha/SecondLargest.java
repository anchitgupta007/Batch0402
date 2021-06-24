package Arrayprogram;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
	     System.out.println("Enter the size of array:");
	     int size=a.nextInt();
	     int[] arr1=new int[size];
	    int largest=0;
	    int second=0;
       System.out.println("enter "+size+" element");
	     for( int i=0;i<arr1.length;i++) {
	    	 arr1[i]=a.nextInt();
	    	 if(largest<arr1[i]) {
	    		 second=largest;
		    		largest=arr1[i];
		    		}
	    	 else if(second<arr1[i])
		    {
		    	
	    			 second=arr1[i];
	    		
	    	 }
	      	  }
	     System.out.println("Second largest element is :"+second);
}
}


