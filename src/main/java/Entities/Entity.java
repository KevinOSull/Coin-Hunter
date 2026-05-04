package Entities;

import GameLogic.Position;
import game.GameSession;

public abstract class Entity {

    private char symbol;
    private int row;
    private int col;

    public Entity(){

    }

    public void setCol(int col){
        this.col = col;
    }

    public int getCol(){
        return this.col;
    }

    public void setRow(int row){
        this.row = row;
    }

    public int getRow(){
        return this.row;
    }

    public char getSymbol(){
        return this.symbol;
    }

    public void setSymbol(char symbol){
        this.symbol = symbol;
    }

    protected void setPosition(int row,int col){
        this.row = row;
        this.col = col;
    }

    public abstract void interact(GameSession session);






}
