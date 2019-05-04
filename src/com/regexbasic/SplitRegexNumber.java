package com.regexbasic;

public class SplitRegexNumber {

	public static void main(String[] args) {
		String TEXT = "1000,---0,Pl:-:'''']====";
		System.out.println("TEXT=" + TEXT);

		String newText = TEXT.replaceAll("\\D", "");

		System.out.println("New text=" + newText);

		int parseNumber = Integer.parseInt(newText);

		int tong = parseNumber + 100;
		System.out.println("Tong la: " + tong);
	}
}