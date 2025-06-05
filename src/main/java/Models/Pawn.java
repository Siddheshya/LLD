package Models;

public class Pawn extends ChessPiece implements Piece{

    public Pawn(Color color,Name name) {
        super(color, name);
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
