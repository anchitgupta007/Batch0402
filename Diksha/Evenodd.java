package arrayProgram;

import java.util.Arrays;

public class Evenodd {

	public static void main(String[] args) {
		int[] arr = { 12, 23, 5, 4, 87, 56, 42, 10, 55, 99, 17 };

		int size = arr.length;
		int even = 0;
		int odd = 0;
		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 == 0) {
				even = even + 1;
				System.out.print(arr[i] + " ");
			} else {
				odd = odd + 1;

			}
		}
		System.out.println("total even number in array:" + even);
		System.out.println("total odd number in array:" + odd);

	}

}
