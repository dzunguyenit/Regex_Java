package com.regexbasic;

public class Regexone_ex1 {

	public static void main(String[] args) {
		String TEXT1 = "abcdefg";
		System.out.println("Before TEXT1= " + TEXT1);
		String TEXT2 = "abcde";
		System.out.println("Before TEXT1= " + TEXT1);

		System.out.println("After TEXT1= " + TEXT1.replaceAll("def*g*", ""));
		System.out.println("After TEXT2= " + TEXT2.replaceAll("def*g*", ""));

		String TEXT3 = "abc123xyz";
		String TEXT4 = "define \"123\"";
		String TEXT5 = "var g = 123;";

		System.out.println("New TEXT3= " + TEXT3.replaceAll("\\d", ""));
		System.out.println("New TEXT4= " + TEXT4.replaceAll("\\d", ""));
		System.out.println("New TEXT5= " + TEXT5.replaceAll("\\d", ""));

		String TEXT6 = "1000:888,000999000gfh";

		System.out.println("Before TEXT6= " + TEXT6);
		String newText6 = TEXT6.replaceAll("\\D", "");

		System.out.println("After TEXT6= " + newText6);

		long parseNumber = Long.parseLong(newText6);

		long tong = parseNumber + 1;

		System.out.println("Tong = " + tong);

	}
}