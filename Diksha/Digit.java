package assignment;

import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter a  number range between 1-10,000");
			int a=n.nextInt();
			if(a>=1 && a<10) {
				System.out.println(" single digit number");
			}
			else if(a>=10 && a<99) {
				System.out.println( " 2 digit number");
			}
			else if(a>=100 && a<999) {
				System.out.println("3 digit number");}
				else if(a>=1000 && a<9999) {
					System.out.println("4 digit number");
				}
				else {
					System.out.println("Please enter number within range");
				}
			}
	

}

