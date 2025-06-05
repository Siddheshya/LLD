package Models.Game;

import Models.Cell;

public class Move {

    private final Cell startCell;

    private final Cell endCell;

    public Move(Cell startCell, Cell endCell) {
        this.startCell = startCell;
        this.endCell = endCell;
    }

    public Cell getStartCell() {
        return startCell;
    }

    public Cell getEndCell() {
        return endCell;
    }
}
