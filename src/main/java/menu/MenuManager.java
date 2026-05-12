package menu;

import GameState.ScreenState;
import com.googlecode.lanterna.screen.Screen;
import headers.Headers;


public class MenuManager {

    private Menu startMenu;
    private Menu mainMenu;
    private Menu setGridSizeMenu;
    private Menu setGameDifficultyMenu;


    public  MenuManager(){
        startMenu = new Menu("Coin Hunter",new String[]{"Start Game","Exit game"},0);
        mainMenu = new Menu("Main Menu",new String[]{"Choose Preset Size","Set Custom Size","Back to Main"},0);
        setGridSizeMenu = new Menu("Set Grid Size",new String[]{"10 x 10","15 x 15","20 x 20","30 x 30","40 x 40","50 x 50"},0);
        setGameDifficultyMenu = new Menu("Very Easy",new String[]{"Easy","Medium","Hard","Very Hard","Back"},0);

    }

    public Menu getMenu(ScreenState screenState){
        if(screenState == ScreenState.START_MENU){
            return startMenu;
        }else if(screenState == ScreenState.MAIN_MENU_ITEMS_LIST){
            return mainMenu;
        }else if(screenState == ScreenState.SET_GRID_SIZE_MENU){
            return setGridSizeMenu;
        }else if(screenState == ScreenState.SET_DIFFICULTY_MENU){
            return setGameDifficultyMenu;
        }
        throw new IllegalStateException("Unknown screen state");
    }

    public ScreenState handleSelection(Menu menu){
        return null;
    }
}
