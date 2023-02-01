package HackerBlogs;

import java.util.Scanner;

public class IncreasingDecreasingSequence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int i = 0;
		boolean flag = true;
		if (n == 1) {
			System.out.println(flag);
		}
		if (n > 1 && n < 1000) {
			int x = Integer.MAX_VALUE;
			boolean decreasing = true;
			boolean increasing = false;
			while (i < n) {

				int a = sc.nextInt();
				if (a > 0) {
					if (a == x) {
						flag = false;
						increasing = false;
						decreasing = false;
					}
					if (a < x && decreasing) {
						x = a;
					} else {
						decreasing = false;
						increasing = true;
					}

					if (a < x && increasing) {
						flag = false;
					}
					if (a > x && increasing) {
						x = a;
					} else {
						increasing = false;
					}
					if (a > x && decreasing) {
						flag = false;
					}
				}
				i++;
			}
			System.out.println(flag);
		}
	}

}
