public class Checkers
{
 
    public static void main( ){
String[][] checkerBoard = new String[8][8];

        for (int i = 0; i < checkerBoard.length; i++) {
            int oddRow = i % 2; 
            for (int j = 0; j < checkerBoard[0].length; j++) {
               int oddColumn = j % 2;
               
               values[i][j] = "B";   
               // Assign "BLACK" or "WHITE" to the appropriate squares

            }
        }

        // Print out the board as 8 rows with either null,
        // "BLACK", or "WHITE" in each element
        // Hint: use both the println and print methods
        // of System.out
        
    }
    
}
