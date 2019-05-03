package com.regexbasic;

public class SplitRegexNumber {

	public static void main(String[] args) {
		String TEXT = "1000,000,000";
		System.out.println("TEXT=" + TEXT);

		String newText = TEXT.replaceAll("\\D", "");

		System.out.println("New text=" + newText);
	}
}