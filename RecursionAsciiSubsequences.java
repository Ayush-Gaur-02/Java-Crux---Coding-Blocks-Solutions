package HackerBlogs;

import java.util.ArrayList;
import java.util.Scanner;

public class RecursionAsciiSubsequences {

	static ArrayList<String> al = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		printAsciiSubsquences(str, "");
		System.out.println();
		System.out.println(al.size());
	}

	public static void printAsciiSubsquences(String ques, String ans) {
		// TODO Auto-generated method stub
		
		if(ques.length() == 0) {
			al.add(ans);
			System.out.print(ans+" ");
			return;
		}
		char c = ques.charAt(0);
		
		printAsciiSubsquences(ques.substring(1), ans);
		printAsciiSubsquences(ques.substring(1), ans + c);
		printAsciiSubsquences(ques.substring(1), ans + (int)c);
	}
	
	

}
