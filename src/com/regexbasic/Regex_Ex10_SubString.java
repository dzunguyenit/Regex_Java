package com.regexbasic;

import org.apache.commons.lang3.StringUtils;

public class Regex_Ex10_SubString {

	public static void main(String[] args) {
		String[] strArray = { "string1", "string2", "string3" };
		System.out.println("Joining array of strings");
		System.out.println(StringUtils.join(strArray));
		System.out.println(StringUtils.join(strArray, " "));
	}
}