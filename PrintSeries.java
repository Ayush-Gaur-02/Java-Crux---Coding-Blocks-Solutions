package HackerBlogs;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int i = 1;
		if (num1 > 0 && num1 < 100 && num2 > 0 && num2 < 100) {
			while (i <= num1) {
				int m = 3 * i + 2;

				if (m % num2 == 0) {
					num1++;
				} else {
					System.out.println(m);
				}
				i++;
			}
		}
	}

}
