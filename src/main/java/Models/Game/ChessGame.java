package Models.Game;

import Models.Board;
import Models.ChessBoard;

public class ChessGame implements BoardGame {

    private final ChessBoard chessBoard;

    private BoardFactory boardFactory;

    public ChessGame(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
        boardFactory = new BoardFactory(chessBoard);
    }


    @Override
    public void initBoard() {
        boardFactory.initBoard();
    }

    @Override
    public void displayBoard() {
        chessBoard.displayBoard();
    }
}
