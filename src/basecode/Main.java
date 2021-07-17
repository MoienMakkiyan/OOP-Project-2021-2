package basecode;

import basecode.Functions.Input;
import basecode.Functions.Variable_Reading;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Variable_Reading.getInstance().initializing();
        Input.getInstance().run();
    }
}
