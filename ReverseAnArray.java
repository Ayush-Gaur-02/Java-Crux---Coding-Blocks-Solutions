package HackerBlogs;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		for(int i:arr) {
			System.out.println(i);
		}
	}

}
