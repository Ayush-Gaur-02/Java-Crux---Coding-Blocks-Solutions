package HackerBlogs;

import java.util.Arrays;
import java.util.Scanner;

public class dictionaryOrderSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
		String quess = new String(ques);
		char[] arr = ques.toCharArray();
		ques = "";
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			ques += arr[i];
		}
		printPermutation(ques, "",quess);
		
	}

	
	public static void printPermutation(String ques, String ans, String quess) {
		
		if(ques.length() == 0) {
			if(quess.compareTo(ans)>0) {
				System.out.println(ans);
				
			}
			
			return;
		}
		
		
		for(int i = 0; i < ques.length(); i++) {
			char c = ques.charAt(i);
			String ros = ques.substring(0,i) + ques.substring(i+1);
			printPermutation(ros, ans + c,quess);
		}
		
	}
}
