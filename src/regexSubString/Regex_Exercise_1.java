package regexSubString;

public class Regex_Exercise_1 {

	public static void main(String[] args) {
		String regex = "\\d[\\,\\.]\\d*";
		String TEXT1 = "3.14ABC";
		System.out.println("Before TEXT1= " + TEXT1);
		String TEXT2 = "5,14ALP";
		System.out.println("Before TEXT2= " + TEXT2);

		System.out.println("After TEXT1= " + Regex.getSubString(TEXT1, regex));
		System.out.println("After TEXT2= " + Regex.getSubString(TEXT2, regex));

	}
}