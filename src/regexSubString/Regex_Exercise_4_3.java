package regexSubString;

public class Regex_Exercise_4_3 {

	public static void main(String[] args) {
		String regex = "='([\\w://.]*)'";
		String TEXT1 = "<a href='https://regexone.com'>Link</a>";
		System.out.println("Before TEXT1= " + TEXT1);
		String TEXT2 = "<div class='test_style'>Test</div>";
		System.out.println("Before TEXT2= " + TEXT2);

		System.out.println("After TEXT1= " + Regex.getSubString(TEXT1, regex));
		System.out.println("After TEXT2= " + Regex.getSubString(TEXT2, regex));

	}
}