package oops.topicStatic;

//import math class in this class but we can use with classname
/*import java.lang.Math.*;

public class ImportStatic {

	public static void main(String[] args) {
		double num=Math.sqrt(25);
		
		System.out.println(num);
	
		

	}

}*/
//import static variable of math class in this class and we can use these variable without classname
import static java.lang.Math.*;

public class ImportStatic {

	public static void main(String[] args) {
		double num = sqrt(25);

		System.out.println(num);

	}

}
