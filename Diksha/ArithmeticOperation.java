package oops.methods.returnType;

import java.util.Scanner;

public class ArithmeticOperation {

	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public int subtraction(int a, int b) {
		int c;
		if (a > b) {
			c = a - b;
		} else {
			c = b - a;
		}
		return c;
	}

	public int multiply(int a, int b) {
		int c = a * b;
		return c;

	}

	public float division(float a, float b) {
		float c;
		c = a / b;
		return c;
	}

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int first = n.nextInt();
		System.out.println("Enter 2nd number:");
		int second = n.nextInt();
		ArithmeticOperation obj = new ArithmeticOperation();
		System.out.println("sum of given number is:" + obj.sum(first, second));
		System.out.println("Subtraction of given number is:" + obj.subtraction(first, second));
		System.out.println("multiply of given number is:" + obj.multiply(first, second));
		System.out.println("Division of given number is:" + obj.division(first, second));
	}

}
