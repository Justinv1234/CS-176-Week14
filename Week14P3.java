
public class Week14P3 {

	public static boolean boardChecker(String[][] board) {
		for (int i = 0; i < board.length;i++) {
			for (int j = 0;j < board.length;j++) {
				for (int k = j+1;k < board[j].length;k++) {
					if (board[i][j].equals(board[i][k]) && !(board[i][j].equals("."))) {
						return false;
					}
				}
					
			}
		}
		
		for (int i = 0;i < board[0].length;i++) {
			for (int j = 0;j < board.length;j++) {
				for (int k = j+1; k < board.length;k++) {
					if (board[j][i].equals(board[k][i]) && !(board[j][i].equals("."))) {
						return false;
					}
				}					
			}						    
		}							

		for (int startRow = 0; startRow < 9; startRow += 3) {
		    for (int startCol = 0; startCol < 9; startCol += 3) {
		        for (int a = startRow; a < startRow + 3; a++) {
		            for (int b = startCol; b < startCol + 3; b++) {
		                for (int k = a; k < startRow + 3; k++) {
		                    for (int l = (k == a) ? b + 1 : startCol; l < startCol + 3; l++) {
		                        if (board[a][b].equals(board[k][l]) && !(board[a][b].equals("."))) {
		                            return false;
		                        }
		                    }
		                }
		            }
		        }
		    }
		}
		
		return true;
	}
	
	public static void main(String[] args) {
			String[][] board1 = {
				    {"5","3",".",".","7",".",".",".","."},
				    {"6",".",".","1","9","5",".",".","."},
					{".","9",".",".",".",".",".","6","."},  //a working board
				    {"8",".",".",".","6",".",".",".","3"},
				    {"4",".",".","8",".","3",".",".","1"},
				    {"7",".",".",".","2",".",".",".","6"},
					{".","6",".",".",".",".","2","8","."},
					{".",".",".","4","1","9",".",".","5"},
					{".",".",".",".","8",".",".","7","9"}
				};
				
				System.out.println(boardChecker(board1));
				
			String[][] board2 = {
				    {"5","3",".",".","7",".",".",".","."},
				    {"6",".",".","1","9","5",".",".","."},
					{".","9",".",".",".",".",".","6","."},  //a board with duplicate row
				    {"8",".",".",".","6",".",".",".","3"},
				    {"4",".","1","8",".","3",".",".","1"}, // << two 1's in this row
				    {"7",".",".",".","2",".",".",".","6"},
					{".","6",".",".",".",".","2","8","."},
					{".",".",".","4","1","9",".",".","5"},
					{".",".",".",".","8",".",".","7","9"}
				};
				
				System.out.println(boardChecker(board2));
				
				String[][] board3 = {
					    {"5","3",".",".","7",".",".",".","."},
					    {"6",".",".","1","9","5",".",".","9"}, // << two 9's in the col
						{".","9",".",".",".",".",".","6","."},  
					    {"8",".",".",".","6",".",".",".","3"},
					    {"4",".",".","8",".","3",".",".","1"},//a board with duplicate col
					    {"7",".",".",".","2",".",".",".","6"},
						{".","6",".",".",".",".","2","8","."},
						{".",".",".","4","1","9",".",".","5"},
						{".",".",".",".","8",".",".","7","9"} //<<
					};
					
					System.out.println(boardChecker(board3));
					
					String[][] board4 = {
						    {"5","3",".",".","7",".",".",".","."},
						    {"6",".",".","1","9","5",".",".","."},
							{".","9",".",".",".",".",".","6","."},  //a board with duplicate in 3x3
						    {"8",".",".",".","6",".",".",".","3"},
						    {"4",".",".","8",".","3",".",".","1"},
						    {"7",".",".",".","2",".",".",".","6"},
							{".","6",".",".",".",".","2","8","."},
							{".",".",".","4","1","9",".",".","5"},
							{".",".","6",".","8",".",".","7","9"} // <<<< two 6's in 3x3
						};
						
						System.out.println(boardChecker(board4));
				
	}

}
