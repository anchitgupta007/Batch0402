package oops.vaiarbles;

import java.util.Scanner;

public class AllVaiables {
	int fees;
	static String clgname = "I.G.N.College";

	public static void main(String[] args) {
		System.out.println("College name:" + clgname);
		System.out.println("Admission Fees according to courses:");
		AllVaiables ba = new AllVaiables();
		ba.fees = 4000;
		System.out.println("For B.A student:" + ba.fees);
		AllVaiables bcom = new AllVaiables();
		bcom.fees = 6500;
		System.out.println("For B.Com student:" + bcom.fees);
		AllVaiables bsc = new AllVaiables();
		bsc.fees = 9000;
		System.out.println("For B.Sc student:" + bsc.fees);
		clgname = "Indira Gandhi National College";
		System.out.println("College name:" + clgname);
		int num = 12000;
		System.out.println("total number of student:" + num);
		Scanner n = new Scanner(System.in);
		System.out.println("enter a number:");
		int number = n.nextInt();
		for (int i = 1; i <= number; i++) {
			int sum = 0;
			sum += i;
			System.out.println("sum is:" + sum);
		}
	}

}
