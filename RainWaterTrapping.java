package HackerBlogs;

import java.util.Scanner;

public class RainWaterTrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {

			int n = sc.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {

				arr[i] = sc.nextInt();

			}
			int maxLeft = arr[0];
			int maxRight = arr[n-1];

			int trappedWater = 0;

			int max = Integer.MIN_VALUE;
			int maxI = 0;
			
			for(int i = 1; i < n; i++) {
				
				if(arr[i] > max) {
					max = arr[i];
					maxI = i;
				}
				
			}
			
			for(int i = 1; i < maxI; i++) {
				if(arr[i] > maxLeft) {
					maxLeft = arr[i];
				}else {
					trappedWater += maxLeft - arr[i];
				}
			}

			for(int i = n -2; i > maxI; i--) {
				if(arr[i] > maxRight) {
					maxRight = arr[i];
				}else {
					trappedWater += maxRight - arr[i];
				}
			}
			
			
//			while(i < j) {
//				
//				
//				maxLeft = Math.max(maxLeft, arr[i]);
//				maxRight = Math.max(maxRight,arr[j]);
//				
//				if(maxLeft < maxRight) {
//					trappedWater += maxLeft - arr[i];
//					i++;x
//				}else {
//					trappedWater += maxRight - arr[j];
//					j--;
//					
//				}
//				
//			}
//			
//			for (int i = maxLeft + 1; i < maxRight; i++) {
//				if (arr[maxLeft] > arr[maxRight]) {
//					trappedWater += arr[maxRight] - arr[i];
//				}else {
//					trappedWater += arr[maxLeft] - arr[i];
//					
//				}
//			}

			System.out.println(trappedWater);

		}
	}

}
