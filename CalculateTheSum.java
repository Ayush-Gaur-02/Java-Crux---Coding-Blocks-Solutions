package HackerBlogs;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateTheSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int N = sc.nextInt();
		
		for (int j = 0; j < N; j++) {
			int a = sc.nextInt();
			arr2 = Arrays.copyOf(arr, n);
			for (int i = 0; i < n; i++) {
				if (i - a < 0) {
					arr[i] += arr2[arr2.length + i - a];
				} else {
					arr[i] += arr2[i - a];
				}
			}
		}
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += arr[i];
		}
		System.out.println((int)(sum%(Math.pow(10, 9)+ 7)));
//		System.out.println(Arrays.toString(arr));

	}

}
