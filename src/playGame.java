/**
 * Created by Brett Patterson on 1/23/2018.
 */
public class playGame {

    /**
     * Desc: Tells you if a player has won
     * @param board the board to be checked
     * @param player the player to check for
     * @return true if the player wins, false if they haven't won
     */
    public static boolean didPlayerWin(BoxClass[][] board, BoxClass.State player){

        if(board[0][0].getState() == player && board[0][1].getState() == player && board[0][2].getState() == player){  //going down left
            return true;
        }

        if(board[0][1].getState() == player && board[1][1].getState() == player && board[2][1].getState() == player){ //going down middle
            return true;
        }

        if(board[2][0].getState() == player && board[2][1].getState() == player && board[2][2].getState() == player){  //going down right
            return true;
        }

        if(board[0][0].getState() == player && board[1][0].getState() == player && board[2][0].getState() == player){ //going across top
            return true;
        }

        if(board[0][1].getState() == player && board[1][1].getState() == player && board[2][2].getState() == player){  //going across middle
            return true;
        }

        if(board[0][2].getState() == player && board[1][2].getState() == player && board[2][2].getState() == player){  //going across bottom
            return true;
        }

        if(board[0][0].getState() == player && board[1][1].getState() == player && board[2][2].getState() == player){ //diagonal going right
            return true;
        }

        if(board[0][2].getState() == player && board[1][1].getState() == player && board[2][0].getState() == player){ //diagonal going left
            return true;
        }

        return false;
    }

    public static void drawBoard(BoxClass [][] board){

        System.out.println("  "+board[0][0].toString()+"  |   "+board[0][1].toString()+"  |   "+board[0][2].toString()+"");
        for (int num = 0; num < 18; num ++){
            System.out.print("-");
        }
        System.out.println();
        System.out.println("  "+board[1][0].toString()+"  |   "+board[1][1].toString()+"  |   "+board[1][2].toString()+"");
        for (int num = 0; num < 18; num ++){
            System.out.print("-");
        }
        System.out.println();
        System.out.println("  "+board[2][0].toString()+"  |   "+board[2][1].toString()+"  |   "+board[2][2].toString()+"");

    }

    public static void main( String [] args){
        BoxClass [][] board = new BoxClass[3][3];

        for(int r = 0; r < board.length; r++){
            for (int c = 0; c < board[0].length; c++){
                board[r][c] = new BoxClass();
            }
        }

        boolean gameOver = false;

        while( !gameOver ){


            if( didPlayerWin(board, BoxClass.State.player1) || didPlayerWin(board, BoxClass.State.player2) ){
                gameOver = true;
            }
//            board[row][col].setState(player);
            gameOver = true;
        }

        if( didPlayerWin(board, BoxClass.State.player1) ){
            System.out.println("Player 1 has won");
        }
        else{
            System.out.println("Player 2 has won");
        }

        board[1][1].setState(BoxClass.State.player1);

        drawBoard(board);
    }

}