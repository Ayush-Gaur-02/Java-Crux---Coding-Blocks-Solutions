package HackerBlogs;

import java.util.Scanner;

public class RecursionWhatIsInTheParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		printTextInParenthesis(str,"",0);
		
		
	}
	
	public static void printTextInParenthesis(String ques,String ans,int opening) {
		
		if(ques.length() == 0) {
			return;
		}
		char c = ques.charAt(0);
		
		if(c != '('&&opening==0) {
			printTextInParenthesis(ques.substring(1), ans,opening);
		}else if(c == '(') {
			printTextInParenthesis(ques.substring(1), ans, 1);
		}
		if(c !=')'&&opening==1) {
		printTextInParenthesis(ques.substring(1), ans+c, opening);
		}
		if(c == ')') {
			
			System.out.println(ans);
			return;
		}
		
	}

}
