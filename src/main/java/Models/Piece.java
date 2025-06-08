package Models;

public interface Piece {

    boolean canMove(Cell start, Cell end);

    boolean makeAMove(Cell start, Cell end);

    public String getPieceSymbol();

    public Color getColor();
}
