package HackerBlogs;

import java.util.Scanner;

public class ShoppingGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if (n >= 1 && n <= 1000) {
			int i = 0;
			while (i < n) {
				int a = sc.nextInt();
				int h = sc.nextInt();
				if (a >= 1 && h >= 1) {
					int aB = 0;
					int hB = 0;
					int count = 0;
					while (a > 0 || h > 0) {
						if (a > 0) {
							aB += ++count;
							a -= count;
						}
						if (h > 0) {
							hB += ++count;
							h -= count;
						}
					}
					if (aB < hB) {
						System.out.println("Harshit");
					} else {
						System.out.println("Aayush");
					}
				}
				i++;
			}
		}

	}

}
