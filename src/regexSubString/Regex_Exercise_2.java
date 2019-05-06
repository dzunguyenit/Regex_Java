package regexSubString;

public class Regex_Exercise_2 {

	public static void main(String[] args) {
		String regex = "1?[\\s-]?\\(?(\\d{3})\\)?[\\s-]?\\d{3}";
		String TEXT1 = "1403555XYZ";
		System.out.println("Before TEXT1= " + TEXT1);
		String TEXT2 = "1 416 555AA";
		System.out.println("Before TEXT2= " + TEXT2);

		System.out.println("After TEXT1= " + Regex.getSubString(TEXT1, regex));
		System.out.println("After TEXT2= " + Regex.getSubString(TEXT2, regex));

	}
}