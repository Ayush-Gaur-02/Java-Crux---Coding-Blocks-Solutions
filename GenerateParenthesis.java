package HackerBlogs;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerateParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> al = new ArrayList<>();
		printParenthesis(n,"", al, 0, 0);
//		System.out.println(al);
		for(String s:al) {
			System.out.println(s);
		}
		
	}

	public static void printParenthesis(int n,String ans, ArrayList<String> al, int opening, int closing) {

		if(opening == n && closing == n) {
			al.add(0, ans);;
			return;
		}
		
		if (opening < n) {
			printParenthesis(n, ans + "(",al, opening + 1, closing);
		}
		if (closing < opening) {
			printParenthesis(n, ans + ")",al, opening, closing + 1);
		}
	}

}
