package Strategy;

import Models.Cell;
import Models.Piece;

public class VerticalUp implements MovingStrategy{
    @Override
    public boolean isPathClear(Cell StartCell, Cell EndCell) {
        return false;
    }

    @Override
    public boolean canMove(Cell StartCell, Cell EndCell) {
        return false;
    }
}
