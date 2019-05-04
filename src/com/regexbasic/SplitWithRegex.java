package com.regexbasic;

public class SplitWithRegex {

	public static void main(String[] args) {
		String TEXT = "This     is     my     text";
		System.out.println("TEXT=" + TEXT);
		// Khoảng trắng xuất hiện 1 hoặc nhiều lần.
		// Các ký tự khoảng trắng: \t\n\x0b\r\f
		// Kết hợp quy tắc: \s và +
		String regex = "\\s+";
		String[] splitString = TEXT.split(regex);
		// 4
		System.out.println(splitString.length);

		for (String string : splitString) {
			System.out.println(string);
		}

		// Chuẩn hóa chuỗi
		String newText = TEXT.replaceAll("\\s+", " ");
		System.out.println("New text= " + newText);
	}
}