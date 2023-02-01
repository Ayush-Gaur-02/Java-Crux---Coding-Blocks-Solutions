package HackerBlogs;

import java.util.Scanner;

public class ArraysLinearSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		System.out.println(linearSearch(arr, m));
		
	}
	
	public static int linearSearch(int[] arr, int m) {
		
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == m) {
				return i; 
			}
		}
		return -1;
	}

}
