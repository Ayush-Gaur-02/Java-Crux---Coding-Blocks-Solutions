package HackerBlogs;

import java.util.Scanner;

public class AlexGoesShopping {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n >= 1) {
			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {

				arr[i] = sc.nextInt();
			}

			int q = sc.nextInt();
			for (int i = 0; i < q; i++) {

				int K = 0;

				int A = sc.nextInt();
				int k = sc.nextInt();
				if (A >= 1 && k >= 1 && k <= n) {

					for (int j = 0; j < n; j++) {

						if (A % arr[j] == 0) {
							K++;
						}
					}
					if (K == k) {
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}
				}
			}
		}
	}

}
