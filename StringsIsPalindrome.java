package HackerBlogs;

import java.util.Scanner;

public class StringsIsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean a = true;
		for(int i = 0, j = str.length() - 1; i < j; i++, j--) {
			
			if(str.charAt(i) == str.charAt(j)) {
				
			}else {
				a = false;
				break;
			}
		}
		
		System.out.println(a);
	
	}
	
	
	
	

}
