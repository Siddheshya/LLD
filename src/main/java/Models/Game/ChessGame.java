package Models.Game;

import Models.Board;
import Models.ChessBoard;

public class ChessGame implements BoardGame {

    private final ChessBoard chessBoard;

    public ChessGame(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }


    @Override
    public void initBoard() {

    }

    @Override
    public void displayBoard() {
        chessBoard.displayBoard();
    }
}
