package HackerBlogs;

import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}

			int a = -1;
			int b = -1;
			for (int j = arr.length - 1; j > 0; j--) {

				if (a == -1) {
					for (int k = j - 1; k > -1; k--, j--) {
						if (arr[k] < arr[j]) {
							a = k;
							break;
						}
					}
				}
				if ( a != -1) {
					break;
				}
			}
			for (int j = arr.length - 1; j > 0; j--) {
				if (b == -1) {

					for (int k = n - 1; k > a; k--) {
						if (arr[k] > arr[a]) {
							b = k;
							break;
						}
					}
				}

				if (b != -1) {
					break;
				}

			}
			if (a != -1 && b != -1) {
				swap(arr, a, b);
			}
			reverse(arr, a + 1, arr.length - 1);
			System.out.println(Arrays.toString(arr));
		}

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void reverse(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
