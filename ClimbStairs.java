package HackerBlogs;

import java.util.Scanner;

public class ClimbStairs {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

        if(n<41){
		int f = printBoardPath(n, 2, 0);
		System.out.println(f);
        }
	}

	public static int printBoardPath(int n, int m, int k) {

		if (n == k) {
//			System.out.print(ans + " ");
			return 1;
		}
		if (k > n) {
			return 0;
		}
		int f = 0;
			f = f + printBoardPath(n, 1, k + 1);
			f = f + printBoardPath(n, 2, k + 2);

		return f;
	}

}
