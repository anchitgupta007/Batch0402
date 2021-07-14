// occurrence of single character
package stringdemo;

public class OccurrenceofCharacter {

	public static void main(String[] args) {
		String str = "FascinatingFacts";
		int count = str.length();
		System.out.println(count);
		char target = 't', temp;
		int num = 0;
		for (int i = 0; i < count; i++) {
			temp = str.charAt(i);
			if (target == temp) {
				num++;
			}

		}
		System.out.println("Ocuurrence of " + target + " element is:" + num);

	}

}
