package HackerBlogs;

import java.util.Scanner;

public class N_KnightProblem {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] board = new boolean[n][n];
		nKnight(board, n, 0,"",0);
		System.out.println("\n" + count);
		
	}
	
	public static void nKnight(boolean[][] board, int tq, int row, String ans, int col) {
		
		if(tq == 0) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		
		if(col == board.length){
			row++;
			col = 0;
		}
		
		if(row == board.length) {
			return;
		}
		
		if(isItSafe(board,row,col)) {
			board[row][col] = true;
			nKnight(board, tq - 1, row, ans + "{" + row + "-" + col + "} ", col + 1);
			board[row][col] = false;
		}
		nKnight(board, tq, row, ans, col+1);
		
	}
	
	public static boolean isItSafe(boolean[][] board, int row, int col) {
		int r[] = {-2,-2,-1,-1};
		int c[] = {-1,1,-2,2};
		for (int i = 0; i < c.length; i++) {
			int x = row + r[i];
			int y = col + c[i];
			while(x >= 0 && y >= 0 && y < board.length && board[x][y] == true) {
				return false;
			}	
		}
		return true;
	}

}
