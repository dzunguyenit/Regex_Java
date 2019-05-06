package com.regexbasic;

public class Regexone_ex4 {

	public static void main(String[] args) {
		String TEXT1 = "			The      quick    brown   fox...";
		System.out.println("Before TEXT1= " + TEXT1);

		String newText1 = TEXT1.replaceAll("\\s+", " ");
		System.out.println("After newText1= " + newText1);

	}
}