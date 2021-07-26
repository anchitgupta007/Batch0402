package oops.topicStatic;

public class MoreStaticBlock {
	static int x;
	static {
		x = 100;
		System.out.println("first static block:");
	}
	static {
		System.out.println("second static block:");
	}

	public static void main(String[] args) {
		System.out.println("value of x:" + x);
	}

	static {
		System.out.println("third static block");
	}
}
