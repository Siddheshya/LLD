package Models;

import Strategy.MovingStrategy;
import Strategy.PawnDiagonalMovementStrategy;
import Strategy.PawnVerticalMovementStrategy;

import java.util.ArrayList;
import java.util.Arrays;

public class Pawn extends ChessPiece implements Piece{



    public Pawn(Color color,Name name) {
        super(color, name);
        this.ways = Arrays.asList(new PawnDiagonalMovementStrategy(this),new PawnVerticalMovementStrategy(this));
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

    @Override
    public Color getColor() {
        return super.getColor();
    }
}
