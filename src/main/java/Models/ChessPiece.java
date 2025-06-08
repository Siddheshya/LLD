package Models;

import Strategy.MovingStrategy;

import java.util.ArrayList;
import java.util.List;

public abstract class ChessPiece {


    private boolean isKilled;

    private final Name name;

    private final Color color;

    protected List<MovingStrategy> ways;

    private String pieceSymbol;

    private boolean isMovingFirstTime;

    public ChessPiece(Color color,Name name) {
        this.color = color;
        this.isKilled = false;
        this.name = name;
        this.pieceSymbol = this.getColor().toString().substring(0,1)+name.toString().substring(0,1)+name.toString().substring(name.toString().length()-1);
        this.isMovingFirstTime = true;
    }



    public Color getColor() {
        return color;
    }



    public boolean isKilled() {
        return isKilled;
    }

    private void setKilled() {
        isKilled = true;
    }


    public void setWays(ArrayList<MovingStrategy> ways) {
        this.ways = ways;
    }

    protected void setPieceSymbol(String pieceSymbol) {
        this.pieceSymbol = pieceSymbol;
    }
    protected String getPieceSymbol() {
        return pieceSymbol;
    }

    public boolean isMovingFirstTime() {
        return isMovingFirstTime;
    }

}
