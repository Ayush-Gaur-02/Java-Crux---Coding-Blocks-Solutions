package HackerBlogs;

import java.util.*;

public class VivekLovesArrayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			int n = sc.nextInt();
			int[] arr = new int[n];

			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}
			System.out.println(vivekArray(arr, 0, n-1));
		}
	}

	public static int vivekArray(int[] arr, int si, int ei) {

		for (int i = si; i < ei; i++) {
			int sum = 0;
			for (int j = si; j <= i; j++) {
				sum += arr[j];
			}
			int sum1 = 0;
			for (int j = i+1; j <=ei; j++) {
				sum1 += arr[j];
			}
			if(sum == sum1) {
				int lf = vivekArray(arr, si, i);
				int rf = vivekArray(arr, i+1, ei);
				return Math.max(lf, rf) + 1;
			}
		}
		return 0;

	}

}
