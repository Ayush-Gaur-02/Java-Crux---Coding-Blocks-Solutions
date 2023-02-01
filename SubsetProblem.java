package HackerBlogs;
import java.util.*;

public class SubsetProblem {
	static List<String> list = new ArrayList<>();
//	static int count = 0;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
	
		int target = sc.nextInt();
		
		printSubset(arr, target, "", 0);
		print(list);
//		System.out.println();
//		System.out.println(count);
	}
	
	public static void printSubset(int[] arr, int target, String ans, int index) {
		
		if(target == 0) {
			list.add(ans);
//			count++;
			return;
		}
		
		for(int i = index; i < arr.length; i++) {
			if(target>=arr[i]) {
				printSubset(arr, target - arr[i], ans + arr[i],i + 1);
			}
		}
		
	}
	
	public static void print(List<String> list) {
		for(int i = list.size() - 1; i >= 0; i--) {
			printRev(list.get(i));
			System.out.println();
		}
	}
	
	public static void printRev(String s) {
		for(int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i) + " ");
		}
	}

}
