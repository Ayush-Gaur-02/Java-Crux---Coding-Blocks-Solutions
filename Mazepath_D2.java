package HackerBlogs;

import java.util.Scanner;

public class Mazepath_D2 {

	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		mazepath(n - 1, "", 0, 0);
		if (n > 1) {
			System.out.println();
		}
		System.out.println(count);

	}

	public static void mazepath(int n, String ans, int i, int j) {

		if (i == n && j == n) {
			if (ans != "") {
				System.out.print(ans + " ");
				count++;
			}
			return;
		}

		if (i > n || j > n) {
			return;
		}

		mazepath(n, ans + "V", i, j + 1);
		mazepath(n, ans + "H", i + 1, j);
		if (i == j || i == n - i + 1) {
			mazepath(n, ans + "D", i + 1, j + 1);
		}

	}
}

