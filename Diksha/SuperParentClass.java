package oops.Inheritance.MultiLevel;

public class SuperParentClass {

	public SuperParentClass(int x) {

		System.out.println("SuperParentClass class 1 parameter constructor");
	}

	public SuperParentClass(int y, int z) {
		this(y);

		System.out.println("SuperParentClass class 2 parameter constructor");
	}

}
