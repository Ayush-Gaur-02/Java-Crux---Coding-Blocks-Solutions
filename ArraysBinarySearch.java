package HackerBlogs;

import java.util.Scanner;

public class ArraysBinarySearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int x = -1;
		int i = 0;
		int j = n - 1;

		while (i <= j) {

			int mid = (i + j) / 2;
			if (m == arr[mid]) {
				x = mid;
				break;
			} else if (m > arr[mid]) {
				i = mid + 1;
			} else {
				j = mid - 1;
			}
		}
		
		System.out.println(x);

	}

}
