package HackerBlogs;

import java.util.Scanner;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		
		int a =mazepath("", 0, 0, m, n);
		System.out.println("\n" + a);
	}

	public static int mazepath(String ans, int i, int j, int n, int m) {

		if (m - 1 == j && i == n - 1) {
			System.out.print(ans + " ");
			return 1;
		}
		if (i == n || j == m) {
			return 0;
		}
		int f1 = 0, f2 = 0, f3 = 0;
		f2 += mazepath(ans + "V", i + 1, j, n, m);
		f1 += mazepath(ans + "H", i, j + 1, n, m);
		f3 += mazepath(ans + "D", i + 1, j + 1, n, m);
		int f = f1 + f2 + f3;
		return f;
	}

}
