package regexSubString;

public class Regex_Exercise_4_2 {

	public static void main(String[] args) {
		String regex = ">([\\w\\s]*)<";
		String TEXT1 = "<a>This is a link</a>";
		System.out.println("Before TEXT1= " + TEXT1);
		String TEXT2 = "<div class='test_style'>Test</div>";
		System.out.println("Before TEXT2= " + TEXT2);

		System.out.println("After TEXT1= " + Regex.getSubString(TEXT1, regex));
		System.out.println("After TEXT2= " + Regex.getSubString(TEXT2, regex));

	}
}