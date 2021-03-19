package regexSubString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetGroupOne {

	public static void main(String[] args) {
		String ticket = getTextRegex("\\D\\d{2}", "KhuvucII-V63");
		System.out.println("Ticket = " + ticket);

		String name = getTextRegex("\\D+", "Vu Nguyen 1993");
		System.out.println("Name = " + name.trim());

		String birthDay = getTextRegex("\\d{2}-\\d{2}-\\d{4}", "Vu Nguyen 26-01-1993");
		System.out.println("BirthDay = " + birthDay);

	}

	public static String getTextRegex(String regex, String text) {
		String textRegex = "";
		Pattern patternRegex = Pattern.compile(regex);
		Matcher m = patternRegex.matcher(text);

		if (m.find()) {
			textRegex = m.group(0);
		}
		return textRegex;
	}
}