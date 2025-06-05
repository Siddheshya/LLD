package Models;

import Strategy.MovingStrategy;

import java.util.ArrayList;

public abstract class ChessPiece {

    private Cell currentCell;

    private boolean isKilled;

    private final Name name;

    private final Color color;

    private ArrayList<MovingStrategy> ways;

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

    public void setWays(ArrayList<MovingStrategy> ways) {
        this.ways = ways;
    }

    public String getPieceSymbol() {
        String colorPrefix = this.color == Color.White?"W":"B";
        return colorPrefix + this.name.toString();
    }

}
