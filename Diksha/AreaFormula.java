package oops.topicStatic;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class AreaFormula {
	
	public static float area(float radius) {
		float area = (float) (PI * radius * radius);
		return area;

	}

	public static float perimeter(float radius) {
		float perimeter = (float) (2 * PI * radius);
		return perimeter;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(in);
		out.println("enter a number:");
		float radius = scn.nextFloat();
		out.println(area(radius));
		out.println(perimeter(radius));

	}

}
