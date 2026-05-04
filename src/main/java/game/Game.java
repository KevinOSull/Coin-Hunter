package game;
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
import java.util.Random;
public class Game {

    private Screen screen;
    private Board board;
    private Renderer renderer;
    private InputHandler inputHandler;
    private GameSession session;
    private MenuManager menuManager;
    private ScreenState state;
    private boolean isRunning = false;

    public Game(){

    }


    private void start(){

    }

    private void gameLoop(){

    }

    private void update(){

    }

    private void render(){

    }

    private void resetGame(){

    }
}
