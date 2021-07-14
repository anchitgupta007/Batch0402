package stringdemo;

import java.util.Arrays;

public class OccurrenceofWord {

	public static void main(String[] args) {
		String str = "java java console java java console java java";
		String str1="";
		String[] occur = str.split(" ");
		System.out.println(Arrays.toString(occur));
		
		for (int i = 0; i < occur.length; i++) {
			int count = 1;
			for (int j = i + 1; j < occur.length; j++) {
				if (occur[i].equals(occur[j])) {
					count++;
					occur[j]="matched";
				}
			}
			if(occur[i]!= "matched") {
		System.out.println("occurrence of "+occur[i]+" is "+count);
			}
		}
		System.out.println(str1);
	}
}
