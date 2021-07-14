package stringdemo;

import java.util.Arrays;

public class ReverseEachword {

	public static void main(String[] args) {
		String st = "learn java programming language";
		String[] st1 = st.split(" ");
		int count1 = st1.length, count2;
		System.out.println(Arrays.toString(st1));
		System.out.println(count1);
		String temp = "", reverse = "";
		for (int i = 0; i < count1; i++) 
		{
			String rev = "";
			temp = st1[i];
			count2 = temp.length();
			for (int j = count2 - 1; j >= 0; j--) 
			{
				rev = rev + temp.charAt(j);
			}
			reverse = reverse.concat(rev + " ");
		}
		System.out.println(reverse.trim());
		
		

	}

}
