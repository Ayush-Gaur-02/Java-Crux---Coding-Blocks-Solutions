package HackerBlogs;

import java.util.Scanner;

public class BostonNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int n = num;
		int sum1 = 0;
		int sum2 = 0;
		while (num > 0) {
			int digit = num % 10;
			sum1 += digit;
			num /= 10;
		}
		int div = 2;
		while (n > 1) {
			if (n % div == 0) {
				int d = div;
				while (d > 0) {
					int digit2 = d % 10;
					sum2 += digit2;
					d /= 10;
				}

				n /= div;
			} else {
				div++;
			}
		}
		if (sum1 == sum2) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}
