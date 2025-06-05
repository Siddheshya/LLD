package Strategy;

import Models.Cell;
import Models.ChessBoard;
import Models.Game.Move;

public interface MovingStrategy {

    boolean canMove(Move move, ChessBoard chessBoard);
}
