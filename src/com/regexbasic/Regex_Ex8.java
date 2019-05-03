package com.regexbasic;

public class Regex_Ex8 {

	public static void main(String[] args) {
		String s4 = "2ybcd";
		System.out.println("s4=" + s4);
		// Bắt đầu là 2
		// Tiếp theo x hoặc y hoặc z
		// Tiếp theo bất kỳ 1 hoặc nhiểu lần.
		// Kết hợp các quy tắc: [abc] , . , +
		// true
		boolean match = s4.matches("2[xyz].+");

		System.out.println("-Match 2[xyz].+ " + match);

		String s5 = "2aaaanaaabcbbbbccccbcccbbbbkbz...";
		// Bắt đầu là bất kỳ, 1 hoặc nhiểu lần
		// Tiếp theo a hoặc b, hoặc c: [abc]
		// Tiếp theo z hoặc v: [zv]
		// Tiếp theo bất kỳ
		// true
		match = s5.matches(".+[abc][zv].*");

		System.out.println("-Match .+[abc][zv].* " + match);
	}
}