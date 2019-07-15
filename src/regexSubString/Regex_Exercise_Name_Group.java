package regexSubString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Exercise_Name_Group {

	public static void main(String[] args) {
		String regex100 = "I have (\\d+) dola";
		String text100 = "I have 100 dola";

		Pattern pattern100 = Pattern.compile(regex100);
		Matcher matcherText100 = pattern100.matcher(text100);

		int money100 = 0;

		if (matcherText100.find()) {
			System.out.println(matcherText100.group(0));
			System.out.println(matcherText100.group(1));

			money100 = Integer.parseInt(matcherText100.group(1));

			System.out.println("Money 100$ = " + money100);

		}
		String regex200 = "She give me (\\d+) dola";
		String text200 = "She give me 200 dola";

		Pattern pattern200 = Pattern.compile(regex200);
		Matcher matcherText200 = pattern200.matcher(text200);

		int money200 = 0;

		if (matcherText200.find()) {
			System.out.println(matcherText200.group(0));
			System.out.println(matcherText200.group(1));

			money200 = Integer.parseInt(matcherText200.group(1));
			System.out.println("Money 200$ = " + money200);

		}

		int total = money100 + money200;

		System.out.println("Total = " + total);

	}
}