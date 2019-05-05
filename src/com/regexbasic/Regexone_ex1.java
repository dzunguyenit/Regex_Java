package com.regexbasic;

public class Regexone_ex1 {

	public static void main(String[] args) {
		String TEXT1 = "abcdefg";
		String TEXT2 = "abcde";
		System.out.println("New TEXT1= " + TEXT1.replaceAll("def*g*", ""));
		System.out.println("New TEXT2= " + TEXT2.replaceAll("def*g*", ""));

	}
}