//program to print install java version
package assignment;

import java.lang.Runtime.Version;

public class jversion {

	public static void main(String[] args) {
		Version version = java.lang.Runtime.version();
		System.out.println("Java Version = "+version);
		System.out.println("Java Version Feature Element = "+version.feature());
		System.out.println("Java Version Interim Element = "+version.interim());
		System.out.println("Java Patch Element Version = "+version.patch());
		System.out.println("Java Update Element Version = "+version.update());
		System.out.println("Java Version Build = "+version.build().get());
		System.out.println("Java Pre-Release Info = "+version.pre().orElse("NA"));

	}

}
