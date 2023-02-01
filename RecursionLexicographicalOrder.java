package HackerBlogs;

public class RecursionLexicographicalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printLexicalCounting(10, 0);

	}

	public static void printLexicalCounting(int num, int ans) {

		if (ans > num) {
			return;
		}

		System.out.print(ans+" ");
		int i = 0;
		if (ans == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			printLexicalCounting(num, ans*10 + i);
		}
	}
}
