package Arrayprogram;

import java.util.Arrays;
import java.util.Scanner;

public class SmallerElement {


	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
	     System.out.println("Enter the size of array:");
	     int size=a.nextInt();
	     int[] arr1=new int[size];
	     int smaller;
	    
        System.out.println("enter "+size+" element");
	     for( int i=0;i<arr1.length;i++) {
	    	 arr1[i]=a.nextInt();
	   
	    	  }
	     System.out.println("array element is:");
	     System.out.println(Arrays.toString(arr1));
	     smaller=arr1[0];
	   
	     for(int i=0;i<arr1.length;i++) {
	     if(smaller>arr1[i]) {
	    	 smaller=arr1[i];
	  
	       }
	    
	   
	    	 }
	     System.out.println("Smallest element of array is:"+smaller);
	     
	}
}
	