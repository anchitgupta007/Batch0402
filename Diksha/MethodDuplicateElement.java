package oops.methods.parametric;

import java.util.Arrays;

public class MethodDuplicateElement {
	
	public void duplicate(int[] arr) {
		int length = arr.length;

		for (int i = 0; i <length; i++) {
			int count = 1;
			for (int j = i+1; j < length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = 0;
				}

			}
			if (arr[i] !=0) {
				System.out.println(arr[i] + " occurs " + count + " times");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 1, 4, 8, 1, 6, 1, 4, 5, 1, 4, 5 };
		
		System.out.println(Arrays.toString(arr));
		
		MethodDuplicateElement obj = new MethodDuplicateElement();
		obj.duplicate(arr);

	}

}
