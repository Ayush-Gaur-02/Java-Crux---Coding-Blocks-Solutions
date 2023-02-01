package HackerBlogs;

import java.util.Scanner;

public class GenerateBinaryStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			generate(str, "");
		}
	}

	public static void generate(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char c = ques.charAt(0);
		if (c == '?') {
			generate(ques.substring(1), ans + "0");
			generate(ques.substring(1), ans + "1");
		} else {
			generate(ques.substring(1), ans + c);
		}
	}
}
