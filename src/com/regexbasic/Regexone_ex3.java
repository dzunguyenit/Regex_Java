package com.regexbasic;

public class Regexone_ex3 {

	public static void main(String[] args) {
		String TEXT1 = "ABC:*+MN415-555-1234";
		System.out.println("Before TEXT1= " + TEXT1);

		String TEXT2 = "KL(416)555-3456:TH-";
		System.out.println("Before TEXT2= " + TEXT2);
		String TEXT3 = "Lpp202 555 PP} 4567";
		System.out.println("Before TEXT3= " + TEXT3);

		String newText1 = TEXT1.replaceAll("\\D*", "");
		System.out.println("After newText1= " + newText1);
		String newTEXT2 = TEXT2.replaceAll("\\D*", "");
		System.out.println("After newTEXT2= " + newTEXT2);
		String newTEXT3 = TEXT3.replaceAll("\\D*", "");
		System.out.println("After newTEXT3= " + newTEXT3);

	}
}