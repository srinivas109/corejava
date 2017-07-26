package Day2;


import org.springframework.util.springUtils;

public class CountCharacters {

	public static void main(String args[]) {
		String input = "Today is Monday";
		int count = StringUtils.countOccurrencesOf(input, "a");
		System.out.println("count of occurrence of character 'a' on String: "
				+ " Today is Monday' using Spring StringUtils " + count);

		// Using Apache commons lang StringUtils class
		int number = org.apache.commons.lang.StringUtils.countMatches(input, "a");
		System.out.println("count of character 'a' on String: 'Today is Monday' using commons StringUtils " + number);
		// counting occurrence of character with loop
		int charCount = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a') {
				charCount++;
			}
		}
		System.out.println("count of character 'a' on String: 'Today is Monday' using for loop " + charCount);
		charCount = 0;
		// resetting character count
		for (char ch : input.toCharArray()) {
			if (ch == 'a') {
				charCount++;
			}
		}
		System.out.println("count of character 'a' on String: 'Today is Monday' using for each loop " + charCount);
	}

}

