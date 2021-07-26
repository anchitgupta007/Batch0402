package oops.vaiarbles;

public class instanceVariable {
	int x=100;
	static int y=200;

	public static void main(String[] args) {
		System.out.println(y);
		instanceVariable obj=new instanceVariable();
		System.out.println(obj.x);

	}

}
