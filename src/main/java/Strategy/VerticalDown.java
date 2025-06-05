package Strategy;

import Models.Cell;

public class VerticalDown implements MovingStrategy{
    @Override
    public boolean isPathClear(Cell StartCell, Cell EndCell) {
        return false;
    }

    @Override
    public boolean canMove(Cell StartCell, Cell EndCell) {
        return false;
    }
}
