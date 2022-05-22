import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
            System.out.println("\nLet's play tic tac toe");

            char[][] board = {
              {'_', '_', '_'},
              {'_', '_', '_'},
              {'_', '_', '_'},
            };

            printBoard(board);
              int[] spot = new int[2];

              for(int i=0; i<9;i++){
                if(i%2==0){
                  System.out.println("Turn X: ");
                  spot = askUser(board);
                  board[spot[0]][spot[1]] = 'X';
                  
                }else{
                  System.out.println("Turn O: ");
                  spot = askUser(board);
                  board[spot[0]][spot[1]] = 'O';
                
                }
                printBoard(board);

                int value = winner(board);
                System.out.println("value: "+ value);
                if (value == 3) {
                  System.out.println("X Wins");
                  break;
                } else if (value == -3) {
                  System.out.println("O wins");
                  break;
                }
              }
            scan.close();
        }
 
        // Printing the values of the board.
    public static void printBoard(char[][] board){
      System.out.println();
      for(int i=0; i<board.length;i++){
        System.out.print("\t");
        for(int j=0;j<board[i].length;j++){
          System.out.print(board[i][j] + " ");
        }
      System.out.println();
      }
    }   


    public static int[] askUser(char[][] board){
      int[] spot = new int[2];
      System.out.println("Pick a row and a column: ");
      int row = scan.nextInt();
      int col = scan.nextInt();
      if (board[row][col]!='_'){
        System.out.println("Spot taken, try again: ");
         row = scan.nextInt();
         col = scan.nextInt();
      }
      spot[0]=row;
      spot[1]=col;
      return spot;
    }

// Finding the winner of the game.
     public static int winner(char[][] board){
        int count=0;
       for(int i=0;i<board.length;i++){
         for(int j=0;j<board[i].length;j++){
          //  Checking for rows
           if(board[i][j]=='X'){
             count++;
           }else if(board[i][j]=='O'){
             count --;
           }
         }
         if (count == 3 || count == -3) {
           break;
         }else{
           count =0;
         }
       }

      //  Checking for columns 
       for (int i = 0; i < board.length; i++) {
         for (int j = 0; j < board[i].length; j++) {
           // CHECKING every row
           if (board[j][i] == 'X') {
             count++;
           } else if (board[j][i] == 'O') {
             count--;
           }
         }
         if (count == 3 || count == -3) {
           break;
         } else {
           count = 0;
         }
       }


      // checking for right diagonal
       for(int i=0;i<board.length;i++){
        
            if (board[i][i] == 'X') {
             count++;
           } else if (board[i][i] == 'O') {
             count--;
           }
         }
         
         if(count==3 || count==-3){
            return count;
         }else{
           count =0;
         }
       
        //  checking for the left diagonal.
       for(int i=0;i<board.length;i++){
         int rowindex = 2 - i;
         if(board[rowindex][i]=='X'){
           count++;
         }else if(board[rowindex][i]=='O'){
           count--;
         }
       }

       return count;
     }


}
