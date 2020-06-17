/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

/**
 *
 * @author Matheus
 */
public abstract class ChessPiece extends Piece {
    
    private Color color;
    
    public ChessPiece(){

    }
    
    public ChessPiece(Color color, Board board) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
   protected boolean isThereOpponentPiece(Position position){
       
       ChessPiece p = (ChessPiece) getBoard().piece(position);
       return p != null && p.getColor() == color;       
   }     
}
