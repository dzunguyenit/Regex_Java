package com.regexbasic;

import regexSubString.Regex;

public class Regexone_ex2 {

	public static void main(String[] args) {
		String TEXT1 = "tom@hogwarts.com";
		System.out.println("Before TEXT1= " + TEXT1);

		String TEXT2 = "tom.riddle@hogwarts.com";
		System.out.println("Before TEXT2= " + TEXT2);

		String TEXT3 = "hermione+regexone@hogwarts.com";
		System.out.println("Before TEXT3= " + TEXT3);

//		String newText1 = TEXT1.replaceAll("(@hogwarts.com)$", "");
		String newText1 = Regex.getSubString(TEXT1, "(@hogwarts.com)$");
		System.out.println("After newText1= " + newText1);

		String newTEXT2 = TEXT2.replaceAll("(@hogwarts.com)$", "");
		System.out.println("After newTEXT2= " + newTEXT2);

		String newTEXT3 = TEXT3.replaceAll("(@hogwarts.com)$*", "");
		System.out.println("After newTEXT3= " + newTEXT3);

	}
}