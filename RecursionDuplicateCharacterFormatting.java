package HackerBlogs;

import java.util.Scanner;

public class RecursionDuplicateCharacterFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		formatDup(str, "",'$');

	}

	public static void formatDup(String ques, String ans, char c) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char d = ques.charAt(0);
		if (d != c) {
			formatDup(ques.substring(1), ans + d, d);
		} else {
			formatDup(ques.substring(1), ans + "*" + d, d);
		}
	}

}
