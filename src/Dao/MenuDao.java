package Dao;

import Database.Menu;
import entity.Dish;
import myException.LoginException;
import myException.SelectDishException;
import utils.Staus;

import java.util.ArrayList;

public class MenuDao {
    private Menu menu;

    public MenuDao(Menu menu) {
        this.menu = menu;
    }

    public void insert(Dish dish){
        menu.totalMenu.put(dish.getId(),dish);
    }

    public Dish selectByDishId(String id){
     Dish dish =   menu.totalMenu.get(id);
        if (dish == null){
            throw new SelectDishException(Staus.No_DishId.getMessage());
        }else {
            return dish;
        }
    }

    public ArrayList<Dish> queryAll(){
        ArrayList<Dish> arrayList = new ArrayList<>();
        if (menu.totalMenu == null){
            return arrayList;
        }

        for (Dish dish:menu.totalMenu.values()){
            arrayList.add(dish);
        }
        return arrayList;
    }

    public Dish deleteDishById(String id){
      return   menu.totalMenu.remove(id);
    }
}
