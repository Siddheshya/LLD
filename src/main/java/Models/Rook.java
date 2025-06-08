package Models;

import Strategy.HorizontalMovingStrategy;
import Strategy.PawnDiagonalMovementStrategy;
import Strategy.PawnVerticalMovementStrategy;
import Strategy.VerticalMovingStrategy;

import java.util.Arrays;

public class Rook extends ChessPiece implements Piece {

    public Rook(Color color,Name name) {
        super(color, name);
        this.ways = Arrays.asList(new VerticalMovingStrategy(),new HorizontalMovingStrategy());
    }


    @Override
    public boolean canMove(Cell start, Cell end) {
        return false;
    }

    @Override
    public boolean makeAMove(Cell start, Cell end) {
        return false;
    }

    @Override
    public String getPieceSymbol() {
        return super.getPieceSymbol();
    }
}
