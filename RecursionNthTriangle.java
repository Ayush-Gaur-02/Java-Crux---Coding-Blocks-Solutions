package HackerBlogs;

import java.util.Scanner;

public class RecursionNthTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(nthTriangle(n));

	}

	public static int nthTriangle(int n) {

		if(n == 1) {
			return 1;
		}
		
		return n + nthTriangle(n-1);
	}

}
