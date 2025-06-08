package Strategy;

import Models.Cell;
import Models.ChessBoard;
import Models.Color;
import Models.Game.Move;
import Models.Pawn;

public class PawnVerticalMovementStrategy implements MovingStrategy{

    private final Pawn pawn;

    public PawnVerticalMovementStrategy(Pawn pawn) {
        this.pawn = pawn;
    }

    @Override
    public boolean canMove(Move move, ChessBoard chessBoard) {
        Cell start = move.getStartCell();

        Cell end = move.getEndCell();

        int startingY = start.getPair().getY();

        int endingY = end.getPair().getY();

        int startingX = start.getPair().getX();

        int endingX = end.getPair().getX();

        //if they are not same means verticalMovement not possible.

        int step = (this.pawn.getColor()==Color.White ? 1 : -1);
        int displacement = Math.abs(endingX - startingX);

        if(this.pawn.isMovingFirstTime() && displacement == 2*step){
            return !end.hasPiece() && !chessBoard.getBoard().get(startingX+step).get(startingY+step).hasPiece();
        }

        return displacement == step && (end.hasPiece() && chessBoard.getBoard().get(endingX+step).get(endingY+step).getPiece().get().getColor()!=pawn.getColor());

    }


}
