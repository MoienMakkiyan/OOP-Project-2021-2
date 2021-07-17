package basecode.Objects.Products;

import basecode.Functions.Random_Location;
import basecode.Functions.Variable_Reading;
import basecode.Objects.X_Y;

public class PocketMilk extends Product{
    public PocketMilk() {
        X_Y xy = Random_Location.getInstance().random();
        this.x = xy.getX();
        this.y = xy.getY();
        this.price = Variable_Reading.getInstance().item_price("PocketMilk");
        this.capacity = Variable_Reading.getInstance().item_capacity("PocketMilk");
        this.InMap = true;
        this.InWerehouse = false;
        this.Processing = false;
        this.transporting = false;
        this.isDone = false;
    }
}
