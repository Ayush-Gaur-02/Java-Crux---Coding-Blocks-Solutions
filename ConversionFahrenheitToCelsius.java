package HackerBlogs;

import java.util.Scanner;

public class ConversionFahrenheitToCelsius {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int minF = sc.nextInt();
		int maxF = sc.nextInt();
		int step = sc.nextInt();
		
		for (int i = minF; i <= maxF; i += step ) {
			int c = 5*(i - 32)/9;
			System.out.println(i + "\t" + c);
		}
		
	}

}
