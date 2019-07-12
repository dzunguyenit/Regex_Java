package regexSubString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Exercise_Name_Group {

	public static void main(String[] args) {
		String regex = "I have (\\d+) dola";
		String TEXT1 = "I have 100 dola";

		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(TEXT1);

		if (m.find()) {
			System.out.println(m.group(0));
			System.out.println(m.group(1));

			int total = Integer.parseInt(m.group(1)) + 100;
			System.out.println(total);

		}

	}
}