package HackerBlogs;

import java.util.Scanner;

public class PrintReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mult = 1;
		int num = n;
		int number = 0;

		while (n > 0) {
			n /= 10;
			mult *= 10;
		}
		mult /= 10;
		while (mult > 0) {
			int digit = num % 10;
			number += digit * mult;
			mult /= 10;
			num /= 10;
		}

		System.out.println(number);
	}
}
