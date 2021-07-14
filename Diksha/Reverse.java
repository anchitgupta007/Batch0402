// reverse of string
package stringdemo;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {

		String str = "Javalanguage";
		String str1 = "";
		int count = str.length();
		for (int i = count - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);
		}
		System.out.println(str1);

	}
}
