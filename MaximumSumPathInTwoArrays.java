package HackerBlogs;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumSumPathInTwoArrays {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr = new int[n];
			int[] arrr = new int[m];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {
				arrr[i] = sc.nextInt();
			}
//			int[] arr = { 2, 3, 7, 10, 12, 15, 30, 34 };
//			int[] arrr = { 1, 5, 7, 8, 10, 15, 16, 19 };

//			long sum1 = 0;
//			long sum2 = 0;
//
//			int a = 0;
//			int b = 0;
//			long sum = 0;
//
//			ArrayList<Integer> al = new ArrayList<>();
//			// Finding intersection
//			int i = 0, j = 0;
//			while (i < arr.length && j < arrr.length) {
//				if (arr[i] == arrr[j]) {
//					al.add(arr[i]);
//					i++;
//					j++;
//				} else if (arr[i] < arrr[j]) {
//					i++;
//				} else {
//					j++;
//				}
//			}
//			i = 0;
//			while (a < arr.length && b < arrr.length) {
//
//				if (i >= al.size()) {
//					if (a < arr.length) {
//						sum1 += arr[a];
//						a++;
//					}
//					if (b < arrr.length) {
//						sum2 += arrr[b];
//						b++;
//					}
//				} else {
//					if (arr[a] != al.get(i)) {
//						sum1 += arr[a];
//						a++;
//					}
//					if (arrr[b] != al.get(i)) {
//						sum2 += arrr[b];
//						b++;
//					}
//					if (arr[a] == al.get(i) && arrr[b] == al.get(i)) {
//						sum1 += arr[a];
//						sum2 += arrr[b];
//						if (sum1 < sum2) {
//							sum1 = 0;
//							sum += sum2;
//							sum2 = 0;
//						} else {
//							sum2 = 0;
//							sum += sum1;
//							sum1 = 0;
//
//						}
//						a++;
//						b++;
//						i++;
//					}
//				}
//			}
//			if (sum1 < sum2) {
//				sum += sum2;
//			} else {
//				sum += sum1;
//			}
//			System.out.println(sum);

			int i = 0;
			int j = 0;

			int sum1 = 0;
			int sum2 = 0;

			int sum = 0;

			while (i < n && j < m) {

				if (arr[i] < arrr[j]) {
					sum1 += arr[i];
					i++;
				} else if (arr[i] > arrr[j]) {
					sum2 += arrr[j];
					j++;
				} else {
					sum += Math.max(sum1, sum2) + arr[i];
					sum1 = 0;
					sum2 = 0;
					i++;
					j++;
				}

			}
			
			while(i < n) {
				sum1 += arr[i];
				i++;
			}
			
			while(j < m) {
				sum2 += arrr[j];
				j++;
			}
			
			sum += Math.max(sum1, sum2);
			System.out.println(sum);
			

		}

	}

}
