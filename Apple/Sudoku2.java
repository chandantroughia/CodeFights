/**
 *
 * @author chandantroughia
 * @date 07/07/2017
 * @asked Apple, Uber
 * 
 */
package Apple;

import java.util.HashSet;

public class Sudoku2 {
	static boolean sudoku2(char[][] grid) {
	    if(grid == null || grid.length != 9 || grid[0].length !=9){
	        return false;
	    }
	    
	    HashSet<Character> set = new HashSet<Character>();
	    
	    for(int i = 0; i < 9; i++){
	        for(int j = 0; j < 9; j++){
	            if(grid[i][j] == '.') continue;
	            if(set.contains(grid[i][j])) return false;
	            set.add(grid[i][j]);
	        }
	        set.clear();
	    }
	    
	    
	    for(int j = 0; j < 9; j++){
	        for(int i = 0; i < 9; i++){
	            if(grid[i][j] == '.') continue;
	            if(set.contains(grid[i][j])) return false;
	            set.add(grid[i][j]);
	        }
	        set.clear();
	    }
	    
	    
	    for(int k = 0; k < 9; k++){
	        for(int i = k/3*3; i < k/3*3+3; i++){
	            for(int j = (k%3)*3; j < (k%3)*3+3; j++){
	                if(grid[i][j] == '.') continue;
	                if(set.contains(grid[i][j])) return false;
	                set.add(grid[i][j]);
	            }
	        }
	        set.clear();
	    }
	    return true;
	}

	
	public static void main(String[] args) {
		
		char[][] grid = {{'.', '.', '.', '1', '4', '.', '.', '2', '.'},
		                 {'.', '.', '6', '.', '.', '.', '.', '.', '.'},
		                 {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
		                 {'.', '.', '1', '.', '.', '.', '.', '.', '.'},
		                 {'.', '6', '7', '.', '.', '.', '.', '.', '9'},
		                 {'.', '.', '.', '.', '.', '.', '8', '1', '.'},
		                 {'.', '3', '.', '.', '.', '.', '.', '.', '6'},
		                 {'.', '.', '.', '.', '.', '7', '.', '.', '.'},
		                 {'.', '.', '.', '5', '.', '.', '.', '7', '.'}};
		
		System.out.println(sudoku2(grid));
	}
	
}
