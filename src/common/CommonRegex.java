package common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonRegex {
	public String getTextRegex(String regex, String text, int group) {
		String textRegex = "";
		Pattern patternRegex = Pattern.compile(regex);
		Matcher m = patternRegex.matcher(text);

		if (m.find()) {
			textRegex = m.group(group);
		}
		return textRegex;
	}
}
