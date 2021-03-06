package regexSubString;

public class Regex_Exercise_8 {

	public static void main(String[] args) {
		String regex = "(\\w+)://([\\w\\-\\.]+)(:(\\d+))?";
		String TEXT1 = "ftp://file_server.com:21/top_secret/life_changing_plans.pdf";
		System.out.println("Before TEXT1= " + TEXT1);
		String TEXT2 = "market://search/angry%20birds";
		System.out.println("Before TEXT2= " + TEXT2);

		System.out.println("After TEXT1= " + Regex.getSubString(TEXT1, regex));
		System.out.println("After TEXT2= " + Regex.getSubString(TEXT2, regex));

	}
}