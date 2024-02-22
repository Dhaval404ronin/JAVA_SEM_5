import java.util.Random;

public class d1 {
    public static void main(String[] args) {
        char[][] board = generateBoard();
        displayBoard(board);
    }

    public static char[][] generateBoard() {
        char[][] board = new char[3][3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int randomValue = random.nextInt(3);
                if (randomValue == 0)
                    board[i][j] = 'X';
                else if (randomValue == 1)
                    board[i][j] = 'O';
                else
                    board[i][j] = ' ';
            }
        }

        return board;
    }

    public static void displayBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }
}
/* each time random game 
o/p ->
-------------
|   | X | X | 
-------------
| O | O | O | 
-------------
| X | O |   | 
-------------
*/