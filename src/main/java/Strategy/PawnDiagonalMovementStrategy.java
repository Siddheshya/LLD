package Strategy;

import Models.Cell;
import Models.ChessBoard;
import Models.Color;
import Models.Game.Move;
import Models.Pawn;

public class PawnDiagonalMovementStrategy implements MovingStrategy{

    private final Pawn pawn;

    public PawnDiagonalMovementStrategy(Pawn pawn) {
        this.pawn = pawn;
    }

    @Override
    public boolean canMove(Move move, ChessBoard chessBoard) {
        Cell star = move.getStartCell();
        Cell end = move.getEndCell();
        int startingX = star.getPair().getX();
        int endingX = end.getPair().getX();
        int startingY = star.getPair().getY();
        int endingY = end.getPair().getY();
        if(Math.abs(endingY - startingY)>1 || Math.abs(endingX - startingX)>1){
            return false;
        }
        int Xstep = endingX - startingX;

        if((Xstep<0 && pawn.getColor()==Color.White) || (Xstep>0 && pawn.getColor()==Color.Black)){
            return false;
        }

        return !chessBoard.getBoard().get(endingX).get(endingY).hasPiece();
    }
}
