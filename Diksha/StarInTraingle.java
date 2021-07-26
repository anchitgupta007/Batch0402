package oops.methods.parametric;

import java.util.Scanner;

public class StarInTraingle {

	public void triangleStar(int row) {
		int half ;
		if(row%2==0) {
			half=row/2;
		}
		else {
			half=(row/2)+1;
		}
				int st = 1;
		for (int i = 1; i <= half; i++) {
			for (int space = 1; space <= half - i; space++) {
				System.out.print("-");
			}
			for (int star = 1; star <= st; star++) {
				System.out.print("*");
			}
			if (i <= half) {
				  st++;
				  st++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter row number:");
		int row = n.nextInt();
		StarInTraingle obj = new StarInTraingle();
		obj.triangleStar(row);
	}

}
