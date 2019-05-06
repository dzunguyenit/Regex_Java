package com.regexbasic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Ex11_SubStringNumber {

	public static void main(String[] args) {
		String newString = null;
		String mydata = "some string with 9022 inside";
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(mydata);
		if (matcher.find())

		{
			System.out.println(matcher.group());
			newString = matcher.group();
		}

		int tong = Integer.parseInt(newString) + 3;

		System.out.println("Tong = " + tong);

	}
}