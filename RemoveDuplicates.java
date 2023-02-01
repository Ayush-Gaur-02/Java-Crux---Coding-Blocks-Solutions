package HackerBlogs;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String s = "";
		
		s += str.charAt(0);
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == str.charAt(i - 1)) {
				
			}else {
				s+= str.charAt(i);
			}
		}
		
		System.out.println(s);
	}

}
