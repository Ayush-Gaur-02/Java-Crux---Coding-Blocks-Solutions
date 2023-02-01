package HackerBlogs;

import java.util.Scanner;

public class NthFibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int i = 0;
		if (n >= 0 && n <= 1000) {
			while (i < n) {
				int c = a + b;
				a = b;
				b = c;
				i++;

			}
			System.out.println(a);
		}
	}

}
