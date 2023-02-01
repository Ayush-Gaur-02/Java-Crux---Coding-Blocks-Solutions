package HackerBlogs;

public class OddEvenUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(6,6);
	}

	public static void print(int n,int a) {
		if (n == 0) {
			return;
		}
		if (n % 2 != 0) {
			System.out.println(n);
		}
		print(n - 1,a);
		if (n % 2 == 0 && a != n) {
			System.out.println(n);
		}

	}

}
