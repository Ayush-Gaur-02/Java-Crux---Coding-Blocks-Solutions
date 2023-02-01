package HackerBlogs;

import java.util.Scanner;

public class MaximumCircularSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}
			int maxSum = 0;
			for(int a = 0; a < n; a++) {
				int sum = 0;
				int x = arr[0];
				for(int b = 0; b < n-1; b++ ) {
					arr[b]=arr[b+1];
				}
				arr[n-1]=x;
				
				for(int j = 0; j < n; j++) {
//					for(int k = j; k < n; k++) {
////						for(int l = j; l <=k; l++) {
////							sum += arr[l];
////							System.out.print(arr[l]);
////							
////						}
//						sum += arr[k];
//						System.out.println("==>" + sum);
//						if(maxSum < sum) {
//							maxSum = sum;
//						}
//					}
					sum += arr[j];
					if(sum<0) {
						sum = 0;
					}
					if(sum> maxSum) {
						maxSum = sum;
					}
					
				}
			}
			
			System.out.println(maxSum);
			
		}
		
	}

}
