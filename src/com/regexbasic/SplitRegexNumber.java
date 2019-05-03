package com.regexbasic;

public class SplitRegexNumber {

	public static void main(String[] args) {
		String TEXT = "1000,000,000";
		System.out.println("TEXT=" + TEXT);
		// Khoảng trắng xuất hiện 1 hoặc nhiều lần.
		// Các ký tự khoảng trắng: \t\n\x0b\r\f
		// Kết hợp quy tắc: \s và +
		String regex = "\\,";
		String[] splitString = TEXT.split(regex);
		System.out.println(splitString.length);

		for (String string : splitString) {
			System.out.println(string);
		}

		// Thay thế tất cả các khoảng trắng với ký tự tab.
		String newText = TEXT.replaceAll("\\,", "");
		System.out.println("New text=" + newText);
	}
}