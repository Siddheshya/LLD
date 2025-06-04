package Models;

public class Pawn extends ChessPiece implements Piece{

    public Pawn(Color color, Cell currentCell, Name name) {
        super(color, currentCell, name);
    }

    @Override
    public boolean canMove(Cell start, Cell end) {
        return false;
    }
}
