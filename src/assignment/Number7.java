package assignment;


public class Number7 {

	public static void main(String[] args) {
		int x = 2;
		int y = 4;
		
		int[ ][ ] matrix1 = { 
				{5, 10, 15, 20},
				{2, 4, 6, 8} };
		int[ ][ ] matrix2 = {
				{1, 2, 3, 4},
				{3, 6, 9, 12} };
	
		int[ ][ ] sum = new int[x][y];
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
//				System.out.println(matrix1[i][j] + " " + matrix2[i][j]);
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
				System.out.println(sum[i][j]);
			}
		}
	}
}
