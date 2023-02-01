package HackerBlogs;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumSwaps {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int x = 0;
		int i = 0;
		while(i < n) {

			if (arr[i] - 1 == i) {
				i++;
			}else {
				swap(arr,i,arr[i]-1);
				x++;
			}
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(x);

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
