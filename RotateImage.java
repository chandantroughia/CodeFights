/**
 *
 * @author chandantroughia
 * @date 07/07/2017
 * @asked Amazon, Microsoft, Apple
 * 
 */

public class RotateImage {

	//Case 1: Rotate Clockwise
	public static void rotateClockwise(int[][] m, int n) {
	    for(int layer = 0; layer < n/2; layer++){
	        int first = layer;
	        int last = n - layer - 1;
	        for(int i = first; i < last; i++){
	            int offset = i - first;
	            //save top
	            int top = m[first][i];
	            
	            //left -> top
	            m[first][i] = m[last - offset][first];
	            
	            //bottom -> left
	            m[last - offset][first] = m[last][last - offset];
	            
	            //right -> bottom
	            m[last][last - offset] = m[i][last];
	            
	            //top -> right
	            m[i][last] = top;
	        }
	    }
	}
	
	//Case 2: Rotate Anti-Clockwise
	public static void rotateAnti(int[][] m, int n){
		for(int layer = 0; layer < n/2; layer++){
			int first = layer;
			int last = n - layer - 1;
			for(int i = first; i < last; i++){
				int offset = i - first;
				//save top
				int top = m[first][i];
				
				//right -> top
				m[first][i] = m[i][last];
				
				//bottom -> right
				m[i][last] = m[last][last - offset];
				
				//left -> bottom
				m[last][last - offset] = m[last - offset][first];
				
				//left -> top
				m[last - offset][first] = top;
			}
		}
	}
	
	public static void printMatrix(int[][] m){
		for (int i = 0; i < m.length; i++)
	    {
	        for (int j = 0; j < m.length; j++)
	           System.out.print(m[i][j] + ",");
	 
	        System.out.println();
	    }
	    System.out.println();
	}

	public static void main(String[] args) {
		int[][] m1 = {{1, 2, 3},
		             {4, 5, 6},
		             {7, 8, 9}};
		
		int[][] m2 = {{1, 2, 3},
	             {4, 5, 6},
	             {7, 8, 9}};
		
		int n = m1.length;
		
		rotateClockwise(m1, n);
		
		printMatrix(m1);
		
		rotateAnti(m2,n);
		
		printMatrix(m2);
		
	}

}
