package Strategy;

import Models.ChessBoard;
import Models.Game.Move;

public class KnightMovementStrategy implements MovingStrategy{
    @Override
    public boolean canMove(Move move, ChessBoard chessBoard) {
        return false;
    }
}
