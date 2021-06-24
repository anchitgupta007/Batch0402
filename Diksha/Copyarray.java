package Arrayprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Copyarray {

	public static void main(String[] args) {
     /*Scanner a=new Scanner(System.in);
     System.out.println("Enter the size of array:");
     int size=a.nextInt();
     int[] arr1=new int[size];
     int[] arr2=new int[size];
   
     System.out.println("enter "+size+"element");
     for(int i=0;i<size;i++) {
    	 arr1[i]=a.nextInt();
    	
     }
     System.out.println(Arrays.toString(arr1));
    
   for(int j=0;j<size;j++) {
    arr2[j]=arr1[j];	
   }
   System.out.println(Arrays.toString(arr2));
	}*/

		Scanner a=new Scanner(System.in);
	     System.out.println("Enter the size of array:");
	     int size=a.nextInt();
	     int[] arr1=new int[size];
	     int[] arr2=new int[size];
	   
	     System.out.println("enter "+size+" element");
	     for(int i=0;i<size;i++) {
	    	 arr1[i]=a.nextInt();
	    	
	     }
	     System.out.println("1st array is:");
	     System.out.println(Arrays.toString(arr1));
	   for(int n:arr1) {
		   arr2=arr1;
	   }
	   System.out.println("2nd array is:");
	   System.out.println(Arrays.toString(arr2));
	}
}
	
