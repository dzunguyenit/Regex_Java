package regexSubString;

public class RegexGetNumber {

	public static void main(String[] args) {
		String regex = "\\D";
		String TEXT1 = "AA09233 9991,.99";

		String newString = TEXT1.replaceAll(regex, "");

		System.out.println("New = " + newString);

	}
}