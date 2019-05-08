package regexSubString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Exercise_Group {

	public static void main(String[] args) {
		String regex = "(\\d\\s?) .* (\\d+) .*";
		String TEXT1 = "AA09233 9991,.99";

		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(TEXT1);
		if (m.find()) {
			String total = "";
			// if our pattern matches the string, we can try to extract our groups
			if (m.find()) {
				// get the two groups we were looking for
				String group1 = m.group(1);
				String group2 = m.group(2);

				total = group1 + group2;
				System.out.println(total);

			}

		}
	}
}