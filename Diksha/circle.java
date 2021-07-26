package oops.constructor;

public class circle {
	double radius = 1.0;
	String color = "Red";

	public double getRadius(double r) {
		radius = r;
		return radius;
	}

	public double getArea(double radius) {
		double area = 3.14 * radius * radius;
		return area;
	}

	public static void main(String[] args) {

		circle obj = new circle();
		double r = obj.getRadius(10);
		System.out.println("Radius of circle is : "+r);
		double area = obj.getArea(r);

		System.out.println("Area of circle is = " + area);

	}

}
