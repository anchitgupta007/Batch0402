package oops.Inheritance.MultiLevel;

public class ChildClass extends ParentClass {
	
	public ChildClass(int x, int y) {
		super(x,y);
		System.out.println("child class 2 parameter constructor");
	}

	public static void main(String[] args) {
		ChildClass obj = new ChildClass(100, 120);

	}

}
