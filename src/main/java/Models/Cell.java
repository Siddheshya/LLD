package Models;

import Models.HelperModel.Pair;

import java.util.Optional;

public class Cell {

    private Pair pair;

    private Color color;

    private Optional<Piece> piece;

    public Cell(Pair pair) {
        this.pair = pair;
        this.piece = Optional.empty();
    }

    public boolean hasPiece(){
        return piece.isPresent();
    }

    public void setPiece(Piece piece){
        this.piece = Optional.of(piece);
    }

    public String getPieceSymbol(){
        return piece.get().getPieceSymbol();
    }

    public Pair getPair() {
        return pair;
    }

    public Optional<Piece> getPiece() {
        return piece;
    }


}
