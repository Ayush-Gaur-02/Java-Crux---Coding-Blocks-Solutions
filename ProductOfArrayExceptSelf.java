package HackerBlogs;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		long[] arrr = new long[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			arrr[i] = 1;
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i==j) {
					continue;
				}
				arrr[i] *= arr[j];
			}
		}

		for(long i:arrr) {
			System.out.print(i + " ");
		}
	}

}
