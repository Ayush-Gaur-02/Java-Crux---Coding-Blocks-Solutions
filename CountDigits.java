package HackerBlogs;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int digit = sc.nextInt();
		int count = 0;
		if (n >= 0 && digit >= 0 && digit <= 9) {
			while (n > 0) {
				int dg = n % 10;
				if (dg == digit) {
					count++;
				}
				n /= 10;
			}
		}
		System.out.println(count);
	}

}
