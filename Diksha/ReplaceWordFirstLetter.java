package stringdemo;

import java.util.Arrays;

public class ReplaceWordFirstLetter {

	public static void main(String[] args) {
		String first = "java programming language";
		String[] farray = first.split(" ");

		for (int i = 0; i < farray.length; i++) {
			farray[i] = farray[i].substring(0, 1).toUpperCase() + farray[i].substring(1);

		}
		System.out.println(Arrays.toString(farray));
	}

}
