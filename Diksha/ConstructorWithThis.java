package oops.constructor.ThisKeyword;

public class ConstructorWithThis {
	ConstructorWithThis() {
		System.out.println("Constructor 1");
	}

	ConstructorWithThis(int x) {
		this();
		System.out.println("value of x" + x);
	}

	ConstructorWithThis(int x, String str) {
		this(x);
		System.out.println("value of x is " + x + " and String is : " + str);
	}

	public static void main(String[] args) {
		int x = 100;
		String str = "constructor";
		ConstructorWithThis obj = new ConstructorWithThis(x, str);
	}

}
