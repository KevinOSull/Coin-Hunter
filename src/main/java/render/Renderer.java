package render;
import board.Board;
import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import game.GameSession;
import headers.Headers;
import menu.Menu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Renderer {
    private TerminalSize size;
    private  int width;
    private int height;
    private  int x;
    private  int y;

    public Renderer(){

    }

    private void clear(){

    }

    private void refresh(){

    }

    private void drawBoard(Board board){

    }

    private void drawMenu(Menu menu,Screen screen){
        TextGraphics tg = screen.newTextGraphics();
        int startY = y + menu.getTitle().length()+2;
        for(int i = 0; i < menu.getItems().length; i++){
            String item = menu.getItems()[i];
            int menuX = (width-item.length())/2;
            int menuY = startY + i;
            if(i == menu.getSelectedIndex()){
                tg.setForegroundColor(TextColor.ANSI.BLACK);
                tg.setBackgroundColor(TextColor.ANSI.WHITE);
                tg.putString(menuX, menuY, item);
                tg.setForegroundColor(TextColor.ANSI.DEFAULT);
                tg.setBackgroundColor(TextColor.ANSI.DEFAULT);
            }else{
                tg.putString(menuX,menuY,item);
            }

        }
    }

    private void drawScores(GameSession gameSession){

    }

    private void drawWinner(String message){

    }

    private int getWidth(){
        return size.getColumns();
    }

    private int getHeight(){
        return size.getRows();
    }

    private int calculateHeaderX(){
        int x = (width - Headers.GAME_HEADER_TITLE[0].length())/2;
        return Math.max(0,x);
    }

    private int calculateHeaderY(){
        double topFraction = 0.16;
        int y = (int)(height*topFraction);
        return Math.max(0,y);
    }

}
