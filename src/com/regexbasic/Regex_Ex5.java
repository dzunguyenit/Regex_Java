package com.regexbasic;

public class Regex_Ex5 {

	public static void main(String[] args) {

		String s1 = "a";
		System.out.println("s1=" + s1);
		// Kiểm tra toàn bộ s1 - Khớp với bất kỳ ký tự nào - Quy tắc: . - Return true
		boolean match = s1.matches(".");
		System.out.println("-Match . " + match);

		s1 = "abc";
		System.out.println("s1=" + s1);
		// Kiểm tra toàn bộ s1 - Khớp với bất kỳ ký tự nào ==> false (Rõ ràng, chuỗi 3 ký tự sao khớp với 1 ký tự bất kỳ?)
		match = s1.matches(".");
		System.out.println("-Match . " + match);

		// Kiểm tra toàn bộ s1 khớp với bất kỳ ký tự nào 0 hoặc nhiều lần - Kết hợp các quy tắc: . và * // ==> true
		match = s1.matches(".*");
		System.out.println("-Match .* " + match);
	}
}