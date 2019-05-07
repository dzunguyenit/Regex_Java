package regexSubString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Exercise_Group {

	public static void main(String[] args) {
		String regex = "(\\d\\s?\\d+)";
		String TEXT1 = "AA09233 9991,.99";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(TEXT1);
		while (matcher.find()) {
			System.out.println(matcher.group(0));
		}

	}
}