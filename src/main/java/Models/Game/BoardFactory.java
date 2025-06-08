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
        List<Piece> whitePieces = getPawns(Color.White);
        List<Piece> blackPieces = getPawns(Color.Black);
        placeWhitePawns(whitePieces);
        placeBlackPawns(blackPieces);
        List<Rook> whiteRooks = getRooks(Color.White);
        List<Rook> blackRooks = getRooks(Color.Black);
        placeRooks(whiteRooks,blackRooks);
        List<Knight> whiteKnights = getKnights(Color.White);
        List<Knight> blackKnights = getKnights(Color.Black);
        placeKnights(whiteKnights,blackKnights);
        List<Bishop> whiteBishops = getBishops(Color.White);
        List<Bishop> blackBishops = getBishops(Color.Black);
        placeBishop(whiteBishops,blackBishops);
    }

    void placeRooks(List<Rook> whiteRooks, List<Rook> blackRooks) {
        board.getBoard().get(0).get(0).setPiece(whiteRooks.get(0));
        board.getBoard().get(0).get(7).setPiece(whiteRooks.get(1));
        board.getBoard().get(7).get(0).setPiece(blackRooks.get(0));
        board.getBoard().get(7).get(7).setPiece(blackRooks.get(1));
    }

    List<Piece> getPawns(Color pawnColor) {
        List<Piece> whitePawns = new ArrayList<>();
        whitePawns.add(new Pawn(pawnColor, Name.PAWN1));
        whitePawns.add(new Pawn(pawnColor, Name.PAWN2));
        whitePawns.add(new Pawn(pawnColor, Name.PAWN3));
        whitePawns.add(new Pawn(pawnColor, Name.PAWN4));
        whitePawns.add(new Pawn(pawnColor, Name.PAWN5));
        whitePawns.add(new Pawn(pawnColor, Name.PAWN5));
        whitePawns.add(new Pawn(pawnColor, Name.PAWN7));
        whitePawns.add(new Pawn(pawnColor, Name.PAWN8));
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

    void placeBlackPawns(List<Piece> blackPawns) {
        board.setPiece(6,0,blackPawns.get(0));
        board.setPiece(6,1,blackPawns.get(1));
        board.setPiece(6,2,blackPawns.get(2));
        board.setPiece(6,3,blackPawns.get(3));
        board.setPiece(6,4,blackPawns.get(4));
        board.setPiece(6,5,blackPawns.get(5));
        board.setPiece(6,6,blackPawns.get(6));
        board.setPiece(6,7,blackPawns.get(7));
    }

    List<Rook> getRooks(Color rookColor) {
        List<Rook> rooks = new ArrayList<>();
        rooks.add(new Rook(rookColor,Name.ROOK1));
        rooks.add(new Rook(rookColor,Name.ROOK2));
        return rooks;
    }

    List<Knight> getKnights(Color knightColor) {
        List<Knight> knights = new ArrayList<>();
        knights.add(new Knight(knightColor,Name.KNIGHT1));
        knights.add(new Knight(knightColor,Name.KNIGHT2));
        return knights;
    }

    void placeKnights(List<Knight> blackKnights, List<Knight> whiteKnights) {
        board.getBoard().get(0).get(1).setPiece(whiteKnights.get(0));
        board.getBoard().get(0).get(6).setPiece(whiteKnights.get(1));
        board.getBoard().get(7).get(1).setPiece(blackKnights.get(0));
        board.getBoard().get(7).get(6).setPiece(blackKnights.get(1));
    }

    List<Bishop> getBishops(Color bishopColor) {
        List<Bishop> bishops = new ArrayList<>();
        bishops.add(new Bishop(bishopColor,Name.BISHOP1));
        bishops.add(new Bishop(bishopColor,Name.BISHOP2));
        return bishops;
    }

    void placeBishop(List<Bishop> blackBishop, List<Bishop> whiteBishop) {
        board.getBoard().get(0).get(2).setPiece(whiteBishop.get(0));
        board.getBoard().get(0).get(5).setPiece(whiteBishop.get(1));
        board.getBoard().get(7).get(2).setPiece(blackBishop.get(0));
        board.getBoard().get(7).get(5).setPiece(blackBishop.get(1));
    }
}
