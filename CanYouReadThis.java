package HackerBlogs;

import java.util.Scanner;

public class CanYouReadThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.print(s.charAt(0));
		for(int i =1; i < s.length(); i++) {
			if(s.charAt(i) < 'a') {
				System.out.println();
			}
			System.out.print(s.charAt(i));
		}
	}

}
