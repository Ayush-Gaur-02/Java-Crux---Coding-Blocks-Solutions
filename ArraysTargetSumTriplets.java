package HackerBlogs;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTargetSumTriplets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int target = sc.nextInt();
		bubbleSort(arr);
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {
//						if ((arr[i] < arr[j]) && (arr[j] < arr[k])) {
							System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
//						} else if ((arr[i] < arr[k]) && (arr[k] < arr[j])) {
//
//							System.out.println(arr[i] + ", " + arr[k] + " and " + arr[j]);
//
//						} else if ((arr[j] < arr[k]) && (arr[k] < arr[i])) {
//
//							System.out.println(arr[j] + ", " + arr[k] + " and " + arr[i]);
//						} else if ((arr[j] < arr[i]) && (arr[i] < arr[k])) {
//
//							System.out.println(arr[j] + ", " + arr[i] + " and " + arr[k]);
//						} else if ((arr[k] < arr[i]) && (arr[i] < arr[j])) {
//
//							System.out.println(arr[k] + ", " + arr[i] + " and " + arr[j]);
//						} else {
//							System.out.println(arr[k] + ", " + arr[j] + " and " + arr[i]);
//						}

					}
				}
			}
		}

	}
	public static void bubbleSort(int[] arr) {

		for (int j = 1; j < arr.length; j++) {
			for (int i = 0; i <= arr.length - 2; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

}
