package HackerBlogs;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		if(c>='a'&&c<='z') {
			System.out.println("lowercase");
		}else if(c>='A'&&c<='Z') {
			System.out.println("UPPERCASE");
		}else {
			System.out.println("Invalid");
		}
		
	}

}
