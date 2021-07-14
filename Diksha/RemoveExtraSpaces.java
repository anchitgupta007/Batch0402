package stringdemo;

import java.util.Arrays;

public class RemoveExtraSpaces {

	public static void main(String[] args) {
		String str="java  programming    and automation     tool";
		
		char[] ch=str.toCharArray();
	System.out.println(Arrays.toString(ch));
	String newstr=" ";
	char ch1=' ';
	for(int i=0;i<ch.length;i++) {
		if(ch[i]==' ' && ch[i]==ch1) {
			continue;
		}
		else {
			newstr += ch[i];
		}
		ch1=ch[i];
	}
	 System.out.println("new string is:-"+newstr);
	}
	}
