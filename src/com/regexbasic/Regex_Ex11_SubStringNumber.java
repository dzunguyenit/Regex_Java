package com.regexbasic;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class Regex_Ex11_SubStringNumber {

	public static void main(String[] args) {

		String text = "123,000.000:999";

		String[] newText = text.split("\\D");

		for (String te : newText) {
			System.out.println(te);
		}

//		System.out.println(StringUtils.join(newText, " "));
		String totalString = StringUtils.join(newText);
//		NumberUtils.createInteger(str)

		int tong = (NumberUtils.toInt(totalString)) + 1;

		System.out.println("Tong la: " + tong);
	}
}