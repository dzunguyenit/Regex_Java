package com.regexbasic;

public class Regex_Ex6 {

	public static void main(String[] args) {

		String s2 = "m";
		System.out.println("s2=" + s2);
		// Kiểm tra toàn bộ s2 Bắt đầu bởi m Quy tắc ^ => true
		boolean match = s2.matches("^m");
		System.out.println("-Match ^m " + match);

		s2 = "mnp";
		System.out.println("s2=" + s2);
		// Kiểm tra toàn bộ s2 Bắt đầu bởi m Quy tắc ^ ==> false (Rõ ràng, chuỗi 3 ký tự
		// sao khớp với 1 ký tự bất kỳ bắt đầu bởi m)
		match = s2.matches("^m");
		System.out.println("-Match ^m " + match);

		// Bắt đầu bởi m Sau đó là ký tự bất kỳ, xuất hiện 1 hoặc nhiều lần - Quy tắc ^.
		// và + => true
		match = s2.matches("^m.+");
		System.out.println("-Match ^m.+ " + match);
	}
}