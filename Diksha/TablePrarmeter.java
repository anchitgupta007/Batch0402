package oops.methods.parametric;

import java.util.Scanner;

public class TablePrarmeter {
	public void table(short num, short range) {
		for(int i=0;i<=range;i++) {
			System.out.println(num + "*" +i + "=" + num *i);
		}

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number to print table of entered number:");
		short num=scn.nextShort();
		System.out.println("enter range of table:");
		short range=scn.nextShort();
		TablePrarmeter obj = new TablePrarmeter();
		
		obj.table(num,range);

	}

}
