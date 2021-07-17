package basecode.Objects.Animal;

import basecode.Functions.Random_Location;
import basecode.Objects.X_Y;

public class Chicken extends Animal {

    int MAX_TIME;
    int CURRENT_TIME;

    public Chicken(int MAX_TIME) {
        X_Y xy = Random_Location.getInstance().random();
        this.x = xy.getX();
        this.y = xy.getY();
        this.speed = 1;
        this.type = "producer";
        this.activation = true;
        this.lives = 100;
        this.MAX_TIME = MAX_TIME;
        this.CURRENT_TIME = 0;
        this.isHungry = false;
    }

    public boolean time_to_produce(){
        CURRENT_TIME++;
        if (CURRENT_TIME == MAX_TIME){
            CURRENT_TIME = 0;
            return true;
        }
        else return false;
    }
}