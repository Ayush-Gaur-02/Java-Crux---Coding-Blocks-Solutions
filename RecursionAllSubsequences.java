package HackerBlogs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class RecursionAllSubsequences {

	static ArrayList<String> al = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			printSubsequence(str, "");
			Collections.sort(al);
			for(String s:al) {
				System.out.println(s);
			}
			al.removeAll(al);
		}
		
		

	}

	public static void printSubsequence(String ques,String ans) {
		
		if(ques.length() == 0) {
			al.add(ans);
//			System.out.println(ans);
			return;
		}
		
		char c = ques.charAt(0);
		
		printSubsequence(ques.substring(1), ans);
		printSubsequence(ques.substring(1), ans + c);
		
		
	}
	
//	public static ArrayList<String> sort(ArrayList<String> al){
//		for()
//	}
	
}
