package HackerBlogs;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		printSteps(n,"A","B","C");
		
		
		
	}
	
	public static void printSteps(int n, String s, String d, String h) {
		
		if(n == 0) {
			return;
		}
		
		printSteps(n-1,s,h,d);
		System.out.println("Moving ring "+n+" from "+s+" to "+d);
		printSteps(n-1, h, d, s);
		
	}
	
	

}
