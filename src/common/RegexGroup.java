package common;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGroup {
	public static void main(String[] args) {
		String chuoi = "Then set value column {string} to {vunguyen}";

		List<String> listVar = getTextGroupRegex(chuoi);

		for (String string : listVar) {
			System.out.println(string);

		}
	}

	public static List<String> getTextGroupRegex(String text) {
		List<String> listVar = new ArrayList<String>();

		Pattern pattern = Pattern.compile("\\{(.*?)\\}");
		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			String value = matcher.group(0);
			listVar.add(value);
		}
		return listVar;
	}
}
