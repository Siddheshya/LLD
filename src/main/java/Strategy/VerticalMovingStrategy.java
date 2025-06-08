package Strategy;

import Models.ChessBoard;
import Models.Game.Move;

public class VerticalMovingStrategy implements MovingStrategy {


    @Override
    public boolean canMove(Move move, ChessBoard chessBoard) {
        return false;
    }
}
