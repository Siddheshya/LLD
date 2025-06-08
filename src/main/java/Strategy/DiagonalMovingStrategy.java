package Strategy;

import Models.ChessBoard;
import Models.Game.Move;

public class DiagonalMovingStrategy implements MovingStrategy{
    @Override
    public boolean canMove(Move move, ChessBoard chessBoard) {
        return false;
    }
}
