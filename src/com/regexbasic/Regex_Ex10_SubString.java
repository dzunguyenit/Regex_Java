package com.regexbasic;

import org.apache.commons.lang3.StringUtils;

public class Regex_Ex10_SubString {

	public static void main(String[] args) {

		String text = "I love      cats          and dogs";

		String[] newText = text.split("\\s+");
	
		for (String te : newText) {
			System.out.println(te);
		}

//		String[] strArray = { "string1", "string2", "string3" };
//		System.out.println("Joining array of strings");
		System.out.println(StringUtils.join(newText));
		System.out.println(StringUtils.join(newText, " "));
	}
}