package HackerBlogs;

import java.util.Scanner;

public class DifferenceInAsciiCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i = 0; i < str.length() - 1; i++) {
			System.out.print(str.charAt(i));
			int diff = str.charAt(i+1) - str.charAt(i);
			System.out.print(diff);
		}
		System.out.println(str.charAt(str.length()-1));
	}

}
