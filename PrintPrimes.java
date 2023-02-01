package HackerBlogs;

import java.util.Scanner;

public class PrintPrimes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if (n >= 1 && n <= 1000) {

			int num = 2;
			while (num <= n) {
				int div = 2;
				int count = 2;

				if (num >= 2) {
					while (div < num) {
						if (num % div == 0) {
							count++;
						}
						div++;
					}
					if (count == 2) {
						System.out.println(num);
					}
				}
				num++;
			}
		}
	}

}
