package com.regexbasic;

public class Regexone_ex1 {

	public static void main(String[] args) {
		String TEXT1 = "abcdefg";
		String TEXT2 = "abcde";
		System.out.println("New TEXT1= " + TEXT1.replaceAll("def*g*", ""));
		System.out.println("New TEXT2= " + TEXT2.replaceAll("def*g*", ""));

		String TEXT3 = "abc123xyz";
		String TEXT4 = "define \"123\"";
		String TEXT5 = "var g = 123;";

		System.out.println("New TEXT3= " + TEXT3.replaceAll("\\D", ""));
		System.out.println("New TEXT4= " + TEXT4.replaceAll("\\D", ""));
		System.out.println("New TEXT5= " + TEXT5.replaceAll("\\D", ""));

	}
}