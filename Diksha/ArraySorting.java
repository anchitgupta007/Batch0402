package oops.methods.parametric;

import java.util.*;

public class ArraySorting {
	
	public void sort(int[] arr) {
		int smaller = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					smaller = arr[i];
					arr[i] = arr[j];
					arr[j] = smaller;
				}
			}
		}
		System.out.println("Array After sorting "+Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter array size:");
		int length = n.nextInt();
		System.out.println("Please enter " + length + " elements:");
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = n.nextInt();
		}
		
		System.out.println("Entered array:"+Arrays.toString(arr));
		ArraySorting obj = new ArraySorting();
		obj.sort(arr);

	}

}
