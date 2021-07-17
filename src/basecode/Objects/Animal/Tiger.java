package basecode.Objects.Animal;

import basecode.Functions.Random_Location;
import basecode.Objects.X_Y;

public class Tiger extends Animal {

    private int cage_counter;
    public Tiger() {
        X_Y xy = Random_Location.getInstance().random();
        this.x = xy.getX();
        this.y = xy.getY();
        this.speed = 2;
        this.type = "wild";
        this.activation = true;
        this.lives = 4;
        this.isHungry = false;
        cage_counter = 0;
    }

    public int getCage_counter() {
        return cage_counter;
    }

    public void setCage_counter(int cage_counter) {
        this.cage_counter = cage_counter;
    }

    public void passTime(){
        if (cage_counter>0) {
            cage_counter--;
            activation = false;
        }
        if (cage_counter == 0) activation = true;
    }

    public boolean caught(){
        if (cage_counter >= lives){
            return true;
        }
        else return false;
    }
}
