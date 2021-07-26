package oops.methods.parametric;

public class StringOccurrence {

	public void occur(String str) {

		char[] str1 = str.toCharArray();
		int count = str1.length;
		for (int i = 0; i < str1.length; i++) {
			int count1 = 1;
			for (int j = i + 1; j < str1.length; j++) {
				if (str1[i] == (str1[j])) {
					count1++;
					str1[j] = 'm';
				}
			}
			if (str1[i] != 'm') {
				System.out.println("occurrence of " + str1[i] + " is " + count1);
			}
		}
	}

	public static void main(String[] args) {
		String str = "consolejavajvmj2eecommandstring";
		StringOccurrence obj = new StringOccurrence();
		obj.occur(str);

	}

}
