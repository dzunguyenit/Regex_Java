package regexSubString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Exercise_Group {

	public static void main(String[] args) {
		String regex = "AA(\\d+\\s?)(\\d+),.(\\d+)";
		String TEXT1 = "AA09233 9991,.99";

		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(TEXT1);
		if (m.find()) {
			String total = "";
			// if our pattern matches the string, we can try to extract our groups
			// get the two groups we were looking for
			System.out.println(m.group(0));
			String group1 = m.group(1);
			System.out.println(m.group(1));
			String group2 = m.group(2);
			System.out.println(m.group(2));
			String group3 = m.group(3);
			System.out.println(m.group(3));

			total = group1 + group2 + group3;
			System.out.println(total);

		}

	}
}