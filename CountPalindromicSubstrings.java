package HackerBlogs;

import java.util.Scanner;

public class CountPalindromicSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int cnt = 0;
		for(int i =0; i < str.length(); i++) {
			for(int j = i+1; j <= str.length(); j++) {
				String s = str.substring(i, j);
				if(isPalindrome(s)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		
	}
	
	public static boolean isPalindrome(String str) {
		
		for(int i = 0, j = str.length() - 1; i < j; i++,j--) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		
		return true;
	}

}
