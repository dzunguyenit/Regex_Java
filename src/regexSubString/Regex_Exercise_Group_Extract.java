package regexSubString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Exercise_Group_Extract {

	public static void main(String[] args) {
		String stringToSearch = "score and seven years ago our fathers";

		// specify that we want to search for two groups in the string
		Pattern p = Pattern.compile("(scor\\S+) .* (\\S+the\\S+)");
		Matcher m = p.matcher(stringToSearch);
		String total = "";
		// if our pattern matches the string, we can try to extract our groups
		if (m.find()) {
			// get the two groups we were looking for
			String group0 = m.group(0);
			System.out.println("Group0 = " + group0);
			String group1 = m.group(1);
			System.out.println("Group1 = " + group1);
			String group2 = m.group(2);
			System.out.println("Group2 = " + group2);

			total = group1 + group2;

			System.out.println(total);
		}

	}

}