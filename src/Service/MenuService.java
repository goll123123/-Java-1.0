package Service;

import Dao.MenuDao;
import entity.Dish;
import myException.SelectDishException;
import utils.R;
import utils.Staus;

public class MenuService {
    private MenuDao menuDao;

    public MenuService(MenuDao menuDao) {
        this.menuDao = menuDao;
    }

    /**
     * 向总食谱里添加菜品
     * 参数：菜品(Dish类)
     * */
    public R addDish(Dish dish){
    try {
        menuDao.selectByDishId(dish.getId());
    }catch (SelectDishException e){
        menuDao.insert(dish);
        return R.ok(null);
    }

    return R.err(Staus.Dish_Exist.getCode(),Staus.Dish_Exist.getMessage());
    }

    /**
     * 查询总菜谱
     * */
    public R queryAll(){
        return R.ok(menuDao.queryAll());
    }

    /**
     * 根据id删除食谱
     * 参数：要删除食谱的id（String）
     * 返回值：删除的食谱（Dish）
     * */
    public R deleteDish(String id){
        try {
            menuDao.selectByDishId(id);
        }catch (SelectDishException e){
           return R.err(Staus.Dish_DeleteNone.getCode(),Staus.Dish_DeleteNone.getMessage()) ;
        }
        return R.ok(menuDao.deleteDishById(id));
    }

    /**
     * 设置早餐
     */
    public R setMorning(String id){
        Dish dish;
        try {
            dish=menuDao.selectByDishId(id);
        }catch (SelectDishException e){
            return R.err(Staus.Dish_SetNone.getCode(),Staus.Dish_SetNone.getMessage());
        }
        dish.setMorning(true);
        return R.ok(null);
    }
    /**
     * 设置午餐
     */
    public R setAfternoon(String id){
        Dish dish;
        try {
            dish=menuDao.selectByDishId(id);
        }catch (SelectDishException e){
            return R.err(Staus.Dish_SetNone.getCode(),Staus.Dish_SetNone.getMessage());
        }
        dish.setAfternoon(true);
        return R.ok(null);
    }
    /**
     * 设置午餐
     */
    public R setEvening(String id){
        Dish dish;
        try {
            dish=menuDao.selectByDishId(id);
        }catch (SelectDishException e){
            return R.err(Staus.Dish_SetNone.getCode(),Staus.Dish_SetNone.getMessage());
        }
        dish.setEvening(true);
        return R.ok(null);
    }

}
