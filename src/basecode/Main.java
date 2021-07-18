package basecode;

import basecode.Functions.Input;
import basecode.Functions.Variable_Reading;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Variable_Reading.getInstance().initializing();
        Input.getInstance().run();
    }
}
