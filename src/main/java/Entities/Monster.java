package Entities;

import board.Board;
import com.googlecode.lanterna.gui2.Direction;
import game.GameSession;
import strategy.MovementStrategy;

public class Monster extends Entity {

    private MovementStrategy movementStrategy;

    public Monster(){
        this.setSymbol('M');
    }

    @Override
    public void interact(GameSession session) {
        
    }

    public void move(Board board, Direction playerDirection){

    }




}
