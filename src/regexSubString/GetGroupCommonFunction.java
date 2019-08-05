package regexSubString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetGroupCommonFunction {

	public static void main(String[] args) {
		String total = getTextRegex("Showing 11 to 20 of (\\d+) entries", "Showing 11 to 20 of 57 entries", 1);
		System.out.println("Total = " + total);

	}

	public static String getTextRegex(String regex, String text, int group) {
		String textRegex = "";
		Pattern patternRegex = Pattern.compile(regex);
		Matcher m = patternRegex.matcher(text);

		if (m.find()) {
			textRegex = m.group(group);
		}
		return textRegex;
	}
}