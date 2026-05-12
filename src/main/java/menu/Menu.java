package menu;

import java.util.Arrays;

public class Menu {

    private String title = "";
    private String[] items = new String[0];
    private int selectedIndex;

    public Menu(String title,String[]items,int selectedIndex){
        this.title = title;
        this.items = Arrays.copyOf(items,items.length);
        this.selectedIndex = selectedIndex;
    }

    public String[] getItems(){
        return this.items;
    }

    public String getTitle(){
        return this.title;
    }

    public int getSelectedIndex(){
        return this.selectedIndex;
    }

    private void moveUp(){

    }

    private void moveDown(){

    }

    public int getSelectedItem(){
        return 0;
    }


}
