//break the string in string array
package stringdemo;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
	String str="Java=programming=string=split";
	
		String[] str1 = str.split("=");
	System.out.println(Arrays.toString(str1));
	}
	
	}
