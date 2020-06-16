/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

/**
 *
 * @author Matheus
 */
public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(color, board);
    }
    
    @Override
    public String toString(){
        
        return "R";
    }
    
}
