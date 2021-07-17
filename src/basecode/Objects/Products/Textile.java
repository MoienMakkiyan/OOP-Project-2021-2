package basecode.Objects.Products;

import basecode.Functions.Random_Location;
import basecode.Functions.Variable_Reading;
import basecode.Objects.X_Y;

public class Textile extends Product{
    public Textile() {
        X_Y xy = Random_Location.getInstance().random();
        this.x = xy.getX();
        this.y = xy.getY();
        this.price = Variable_Reading.getInstance().item_price("Textile");
        this.capacity = Variable_Reading.getInstance().item_capacity("Textile");
        this.InMap = true;
        this.InWerehouse = false;
        this.Processing = false;
        this.transporting = false;
        this.isDone = false;
    }
}
