package HackerBlogs;

import java.util.Scanner;

public class SortingInLinearTime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int red = 0;
		int blue = 0;
		int white = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			
			arr[i] = sc.nextInt();
			if(arr[i] == 0) {
				red++;
			}else if(arr[i] == 2) {
				blue++;
			} else if(arr[i] == 1) {
				white++;
			}
		}
		int i = 0;
		while(red!=0||white!=0||blue!=0) {
			if(red!=0) {
				arr[i] = 0;
				red--;
			}else if(white != 0) {
				arr[i] = 1;
				white--;
			} else {
				arr[i] = 2;
				blue--;
			}
			i++;
		
		}
		for(int k: arr) {
			System.out.println(k);
		}
		
	}

}
