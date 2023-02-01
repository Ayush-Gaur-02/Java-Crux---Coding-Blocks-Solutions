package HackerBlogs;

import java.util.Scanner;

public class Boardpath {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		int f = printBoardPath(n, m, "", 0);
		System.out.println("\n" + f);
		
	}
	
	public static int printBoardPath(int n, int m, String ans,int k) {
		
		if(n==k) {
			System.out.print(ans+" ");
			return 1;
		}
		if(k>n) {
			return 0;
		}
		int f = 0;
		for(int i = 1; i <= m;i++) {
			f = f+printBoardPath(n , m, ans+i,k+i);
		}
		
		return f;
	}
	
}
