package oops.topicStatic;

public class StaticBlockDemo {
	static int x = 100;
	static {

		System.out.println(x);
	}

	public static void main(String[] args) {
		System.out.println("main method:");

	}

}
