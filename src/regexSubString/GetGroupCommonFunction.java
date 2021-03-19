package regexSubString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetGroupCommonFunction {

	public static void main(String[] args) {
		String group = getTextRegex("(.*)-(.*)", "KhuvucII-V63");
		System.out.println("Group = " + group);

	}

	public static String getTextRegex(String regex, String text) {
		String textRegex = "";
		Pattern patternRegex = Pattern.compile(regex);
		Matcher m = patternRegex.matcher(text);

		if (m.find()) {
			textRegex = m.group(2);
		}
		return textRegex;
	}
}