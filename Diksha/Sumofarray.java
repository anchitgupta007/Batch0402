package Arrayprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Sumofarray {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
	     System.out.println("Enter the size of array:");
	     int size=a.nextInt();
	     int[] arr1=new int[size];
	    
         int sum=0;	   
	     System.out.println("enter "+size+" element");
	     for(int i=0;i<arr1.length;i++) {
	    	 arr1[i]=a.nextInt();
	    	 sum=sum+arr1[i];
	    	
	     }
	     System.out.println("1st array is:");
	     System.out.println(Arrays.toString(arr1));
	     System.out.println("Sum of array element is:"+sum);
	}

}
