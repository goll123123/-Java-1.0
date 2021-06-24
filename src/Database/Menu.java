package Database;

import entity.Dish;

import java.util.HashMap;

public class Menu {
    public HashMap<String, Dish> totalMenu;

    public Menu() {
        totalMenu = new HashMap<>();
    }
}
