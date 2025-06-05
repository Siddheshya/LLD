package org.example;

import Models.ChessBoard;
import Models.Game.BoardGame;
import Models.Game.ChessGame;

public class Main {
    public static void main(String[] args) {

        ChessBoard board = new ChessBoard();
        BoardGame game = new ChessGame(board);
//        game.initBoard(board);
        game.initBoard();
        game.displayBoard();

    }
}