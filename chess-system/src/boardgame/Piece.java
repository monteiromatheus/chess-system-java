/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

/**
 *
 * @author Matheus
 */
public class Piece {
    
    protected Position position;
    private Board board;
    
    public Piece(){
        
    }
    public Piece(Board board) {
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }
    
}
