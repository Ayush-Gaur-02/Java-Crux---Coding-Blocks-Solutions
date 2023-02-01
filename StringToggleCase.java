package HackerBlogs;

import java.util.Scanner;

public class StringToggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for (int i = 0; i < s.length(); i++) {
			String c =""; 
			c+= s.charAt(i);
			if (s.charAt(i) < 'a') {
				System.out.print(c.toLowerCase());
			} else {
				System.out.print(c.toUpperCase());
			}
		}

	}

}
