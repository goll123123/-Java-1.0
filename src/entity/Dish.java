package entity;

public class Dish {
    private  String id;
    boolean morning=false,afternoon=false,evening=false;
    private DishDetail dishDetail;

    public boolean isMorning() {
        return morning;
    }

    public void setMorning(boolean morning) {
        this.morning = morning;
    }

    public boolean isAfternoon() {
        return afternoon;
    }

    public void setAfternoon(boolean afternoon) {
        this.afternoon = afternoon;
    }

    public boolean isEvening() {
        return evening;
    }

    public void setEvening(boolean evening) {
        this.evening = evening;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DishDetail getDishDetail() {
        return dishDetail;
    }

    public void setDishDetail(DishDetail dishDetail) {
        this.dishDetail = dishDetail;
    }

    public Dish(String id, DishDetail dishDetail) {
        this.id = id;
        this.dishDetail = dishDetail;
    }

    @Override
    public String toString() {
        return '\n'+"食谱id:"+ id + '\t' + dishDetail;
    }
}
