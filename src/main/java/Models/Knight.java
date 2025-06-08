package Models;

public class Knight extends ChessPiece implements Piece{


    public Knight(Color color,Name name) {
        super(color,name);
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
