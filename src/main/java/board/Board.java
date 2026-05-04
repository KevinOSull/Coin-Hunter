package board;

import Entities.Entity;
import render.Renderer;

import java.util.ArrayList;

public class Board {

    private int startRow;
    private int startCol;
    private static final int MAX_COL_SIZE = 100;
    private static final int MAX_ROW_SIZE = 100;
    private int gridSize;
    private String[][] grid = new String[MAX_ROW_SIZE][MAX_COL_SIZE];
    private ArrayList<Entity> entityList = new ArrayList<>();

    public  Board(){

    }

    private void initialize(){

    }

    private boolean isOutOfBounds(){
        return true;
    }

    private void placeEntity(Entity entity){

    }

    private void removeEntity(Entity entity){

    }

    private void draw(Renderer renderer){

    }





}
