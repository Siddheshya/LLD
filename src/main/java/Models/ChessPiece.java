package Models;

public abstract class ChessPiece {

    private Cell currentCell;

    private boolean isKilled;

    private final Name name;

    private final Color color;

    public ChessPiece(Color color,Cell currentCell,Name name) {
        this.color = color;
        this.currentCell = currentCell;
        this.isKilled = false;
        this.name = name;
    }


    public Color getColor() {
        return color;
    }

    public Cell getCurrentCell() {
        return currentCell;
    }

    public boolean isKilled() {
        return isKilled;
    }

    private void setKilled() {
        isKilled = true;
    }

    private void setCurrentCell(Cell currentCell) {
        this.currentCell = currentCell;
    }

}
