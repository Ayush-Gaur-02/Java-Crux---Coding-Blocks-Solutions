package HackerBlogs;

import java.util.Scanner;

public class StringsOddEvenCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ans = "";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(i%2 == 0) {
				ans+=(char)(c+1);
			}else {
				ans+=(char)(c-1);
				
			}
		}
		
		System.out.println(ans);
		
	}

}
