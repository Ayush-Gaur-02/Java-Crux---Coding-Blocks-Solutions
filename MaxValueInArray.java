package HackerBlogs;

import java.util.Scanner;

public class MaxValueInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxVal(arr));
		

	}
	
	public static int maxVal(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
