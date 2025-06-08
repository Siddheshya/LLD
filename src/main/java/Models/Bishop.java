package Models;

import Strategy.DiagonalMovingStrategy;
import Strategy.HorizontalMovingStrategy;

import java.util.Arrays;

public class Bishop extends ChessPiece implements Piece{

    public Bishop(Color color,Name name) {
        super(color, name);
        this.ways = Arrays.asList(new DiagonalMovingStrategy());
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
