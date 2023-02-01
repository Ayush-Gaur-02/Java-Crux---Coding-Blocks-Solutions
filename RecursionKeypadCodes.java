package HackerBlogs;

import java.util.Scanner;

public class RecursionKeypadCodes {

	static String[] dict = {"", "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wx" , "yz"};
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
		keyPaid(ques, "");
	}
	
	public static void keyPaid(String ques, String ans) {
		
		if(ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		
		char ch = ques.charAt(0);
		String pressString = dict[ch - 48];
		
		for(int i = 0; i < pressString.length(); i++) {
			keyPaid(ques.substring(1), ans + pressString.charAt(i));
		}
	}
	
	public static void printPermutation(String ques, String ans) {
		
		if(ques.length() == 0) {
			System.out.println();
			return;
		}
		
		for(int i = 0; i < ques.length(); i++) {
			char c = ques.charAt(i);
			String ros = ques.substring(0,i) + ques.substring(i+1);
			printPermutation(ros, ans + c);
		}
		
	}
	

}
