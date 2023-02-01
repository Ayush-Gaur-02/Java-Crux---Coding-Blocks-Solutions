package HackerBlogs;

import java.util.ArrayList;
import java.util.Scanner;

public class RecursionSubsequences {

	static ArrayList<String> al = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printSubsequences(str,"");
		System.out.println();
		System.out.println(al.size());

	}
	
	public static void printSubsequences(String ques,String ans) {
		if(ques.length() == 0) {
			al.add(ans);
			System.out.print(ans + " ");
			return;
		}
		char c = ques.charAt(0);
		printSubsequences(ques.substring(1), ans);
		printSubsequences(ques.substring(1), ans + c);
	}
	
	
	

}
