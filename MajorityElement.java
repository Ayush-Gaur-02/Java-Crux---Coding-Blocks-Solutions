package HackerBlogs;

import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int K = 0;
		int x = 0;

		for (int i = 0; i < n - 1; i++) {
			int k = 0;

			for (int j = i; j < n; j++) {

				if (arr[i] == arr[j]) {
					k++;
					if (k > K) {
						K = k;
						x = arr[i];
					}
				}

			}
		}
		if(K > n/2) {
			System.out.println(x);
		}

	}

}
