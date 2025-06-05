package Strategy;

import Models.Cell;

public interface MovingStrategy {

    boolean isPathClear(Cell StartCell, Cell EndCell);

    boolean canMove(Cell StartCell, Cell EndCell);
}
