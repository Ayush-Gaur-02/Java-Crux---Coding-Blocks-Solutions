package HackerBlogs;

public class NthTriangleRecursion {

	
	public static void main(String[] args) {
		
		System.out.println(NthTriangle(3, 1));
		
	}
	
	public static int NthTriangle(int n, int i) {
		
		if(i == n) {
			return i;
		}
		
		return i + NthTriangle(n, i + 1); 
	}
	
}
