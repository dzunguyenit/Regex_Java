package regexSubString;

public class RegexGetNumber {

	public static void main(String[] args) {
		String regex = "[A_,.\\s]";
		String TEXT1 = "AA09233 9991_,.99";

		String newString = TEXT1.replaceAll(regex, "");

		System.out.println("New = " + newString);

	}
}