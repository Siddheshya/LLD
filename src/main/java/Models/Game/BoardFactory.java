package Models.Game;

import Models.*;

import java.util.ArrayList;
import java.util.List;

public class BoardFactory {

    private final ChessBoard board;


    public BoardFactory(ChessBoard chessBoard) {
        this.board = chessBoard;
    }

    public void initBoard() {
        prepareWhitePieces();
    }

    void prepareWhitePieces() {
        List<Piece> whitePieces = getWhitePawns();
        placeWhitePawns(whitePieces);
    }

    List<Piece> getWhitePawns(){
        List<Piece> whitePawns = new ArrayList<>();
        whitePawns.add(new Pawn(Color.White, Name.PAWN1));
        whitePawns.add(new Pawn(Color.White, Name.PAWN2));
        whitePawns.add(new Pawn(Color.White, Name.PAWN3));
        whitePawns.add(new Pawn(Color.White, Name.PAWN4));
        whitePawns.add(new Pawn(Color.White, Name.PAWN5));
        whitePawns.add(new Pawn(Color.White, Name.PAWN5));
        whitePawns.add(new Pawn(Color.White, Name.PAWN7));
        whitePawns.add(new Pawn(Color.White, Name.PAWN8));
        return whitePawns;
    }

    void placeWhitePawns(List<Piece> whitePawns) {
        board.setPiece(1,0,whitePawns.get(0));
        board.setPiece(1,1,whitePawns.get(1));
        board.setPiece(1,2,whitePawns.get(2));
        board.setPiece(1,3,whitePawns.get(3));
        board.setPiece(1,4,whitePawns.get(4));
        board.setPiece(1,5,whitePawns.get(5));
        board.setPiece(1,6,whitePawns.get(6));
        board.setPiece(1,7,whitePawns.get(7));
    }
}
