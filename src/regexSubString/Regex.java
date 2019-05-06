package regexSubString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static String getSubString(String data, String regex) {
		String newString = null;
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(data);
		if (matcher.find()) {
			newString = matcher.group();
		}
		return newString;

	}
}