// Program to print a string entered by user
package stringdemo;

import java.util.Arrays;
import java.util.Scanner;

public class BulitInFunctionOfString {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = n.nextLine();
		System.out.println("entered string is: " + str);
		// count length of string
		System.out.println("===============================");
		int count = str.length();
		System.out.println("Length of entered string " + count);
		// convert the string into character array
		System.out.println("===============================");
		char[] ch = str.toCharArray();
		System.out.println(Arrays.toString(ch));
		// fetch the index value with index number
		System.out.println("===============================");
		char value;
		for (int i = 0; i < count; i++) {
			value = str.charAt(i);
			System.out.println(value + " placed on " + i + "th index number");
		}
		// covert to string in lower to upper letters
		System.out.println("===============================");
		str = str.toUpperCase();
		System.out.println(str);
		// replace single character in entered string
		System.out.println("===============================");
		str = str.replace('A', 'a');
		System.out.println(str);
		// split the string by space
		System.out.println("===============================");
		String[] str1 = { "" };
		str1 = str.split(" ");
		System.out.println(Arrays.toString(str1));
		// sort the array
		System.out.println("===============================");
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		// compare to string
		System.out.println("===============================");
		String scn = "java language";
		int st1;
		st1 = str.compareTo(scn);
		System.out.println(st1);
		// check two strings are equal or not
		System.out.println("===============================");
		String s = "";
		s = s + str.equalsIgnoreCase(scn);
		System.out.println(s);
		// Connect the two string
		System.out.println("===============================");
		String s1="";
		s1=scn.concat(" "+str);
		System.out.println(s1);
		//Replace the whole word in a string
		System.out.println("==============================");
		String a="The white dog jumps over the brown dog";
		a = a.replaceAll("dog","fox");
		System.out.println("After word replacement:"+a);
	}

}
