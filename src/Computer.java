/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Computer extends Player{
    
    public Computer(int player){
        super(player);
        System.out.println("Player 'Computer' created");
    
    }
    
    @Override
    public void play(Board board){
        Try(board);
        board.setPosition(attempt, this.player);
        
    }
    
    @Override
    public void Try(Board board){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println(Integer.toString(i) + " " + Integer.toString(j));
                attempt[0] = i;
                attempt[1] = j;
                if( board.getPosition(attempt) == 0 ){
                    return;
                }
            }
        }
    }
    
}