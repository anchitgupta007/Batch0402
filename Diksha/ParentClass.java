package oops.Inheritance.MultiLevel;

public class ParentClass extends SuperParentClass {

	public ParentClass(int x, int y) {
		this(x);

		System.out.println("Parent class 2 parameter constructor");
	}

	public ParentClass(int x) {
		super(x, x);
		
		System.out.println("Parent class 1 parameter constructor");
	}
}
