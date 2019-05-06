package com.regexbasic;

public class Regexone_ex3 {

	public static void main(String[] args) {
		String TEXT1 = "<a>This is a link</a>";
		System.out.println("Before TEXT1= " + TEXT1);

		String TEXT2 = "<a>This is a link</a>";
		System.out.println("Before TEXT2= " + TEXT2);
		String TEXT3 = "<a href='https://regexone.com'>Link</a>";
		System.out.println("Before TEXT3= " + TEXT3);

		String newText1 = TEXT1.replaceAll("<(\\w+)>\\w*[\\s\\w]*", "");
		System.out.println("After newText1= " + newText1);
		String newTEXT2 = TEXT2.replaceAll(">([\\w\\s]*)<", "");
		System.out.println("After newTEXT2= " + newTEXT2);
		String newTEXT3 = TEXT3.replaceAll("'([\\w://.]*)'", "");
		System.out.println("After newTEXT3= " + newTEXT3);

	}
}