package basecode.Objects.Products;

import basecode.Functions.Random_Location;
import basecode.Functions.Variable_Reading;
import basecode.Objects.X_Y;

public class BuffaloMilk extends Product{
    public BuffaloMilk(int animal_x , int animal_y) {
        X_Y xy = Random_Location.getInstance().base_random(animal_x,animal_y);
        this.x = xy.getX();
        this.y = xy.getY();
        this.price = Variable_Reading.getInstance().item_price("BuffaloMilk");
        this.capacity = Variable_Reading.getInstance().item_capacity("BuffaloMilk");
        this.InMap = true;
        this.InWerehouse = false;
        this.Processing = false;
        this.transporting = false;
        this.isDone = false;
    }
}
