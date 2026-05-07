package game;
import GameState.GameStatus;
import GameState.ScreenState;
import board.Board;
import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import input.InputHandler;
import menu.MenuManager;
import render.Renderer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
public class Game {

    private Screen screen;
    private Board board;
    private Renderer renderer;
    private InputHandler inputHandler;
    private GameSession session;
    private MenuManager menuManager;
    private boolean isGameRunning = true;
    private GameStatus gameStatus;
    private ScreenState screenState;
    //private Map<ScreenState,>
    public Game(){

    }


    public void startGame()  {
        try {
            createScreen();
            gameLoop();
            screen.stopScreen();
        }catch(IOException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void gameLoop() throws IOException, InterruptedException {
        gameStatus = GameStatus.GAME_IN_PROGRESS;
        screenState = ScreenState.START_MENU;
        while(isGameRunning){
            screen.clear();
            render();
            if(gameStatus == GameStatus.GAME_OVER){
                screen.refresh();
                Thread.sleep(3000);
                screenState = ScreenState.START_MENU;
                resetGame();

            }
            screen.refresh();
            Thread.sleep(16);

        }
    }

    private void screenRouting(){

    }

    private void createScreen(){

    }

    private void update(){

    }

    private void render(){

    }

    private void resetGame(){

    }
}
