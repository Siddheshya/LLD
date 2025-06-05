package Models;

import Models.HelperModel.Pair;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard implements Board{

    private final int rowCount = 8;

    private final int columnCount = 8;

    private List<List<Cell>> board;

    public ChessBoard() {
        board = new ArrayList<>();
        for (int i = 0; i < rowCount; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < columnCount; j++) {
                row.add(new Cell(new Pair(i, j)));
            }
            board.add(row);
        }
    }

    @Override
    public void displayBoard() {
        for(int i=0;i<rowCount;i++) {
            for(int j=0;j<columnCount;j++) {
               if(board.get(i).get(j).hasPiece()){
                   System.out.print(board.get(i).get(j).getPieceSymbol()+"|");
               }
               else{
                   System.out.print("___|");
               }
            }
            System.out.println();
        }
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setPiece(int row,int column, Piece piece){
        board.get(row).get(column).setPiece(piece);
    }


}
