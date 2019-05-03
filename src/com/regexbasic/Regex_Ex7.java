package com.regexbasic;

public class Regex_Ex7 {

	public static void main(String[] args) {
		String s3 = "p";
		System.out.println("s3=" + s3);
		// Kiểm tra s3 kết thúc bằng p
		// Quy tắc $
		// true
		boolean match = s3.matches("p$");
		System.out.println("-Match p$ " + match);

		s3 = "2nnp";
		System.out.println("s3=" + s3);
		// Kiểm tra toàn bộ s3
		// Kết thúc bằng p
		// ==> false (Rõ ràng, chuỗi 4 ký tự sao khớp với 1 ký tự p cuối cùng)
		match = s3.matches("p$");
		System.out.println("-Match p$ " + match);

		// Kiểm tra toàn bộ s3
		// Ký tự bất kỳ xuất hiện 1 lần: .
		// tiếp theo là n, xuất hiện 1 hoặc tối đa 3 lần.
		// Kết thúc bởi p: p$
		// Kết hợp các quy tắc: . , {X,Y}, $
		// true
		match = s3.matches(".n{1,3}p$");
		System.out.println("-Match .n{1,3}p$ " + match);
	}
}