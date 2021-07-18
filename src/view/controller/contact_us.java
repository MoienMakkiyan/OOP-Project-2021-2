package view.controller;

import view.Main;

import java.io.IOException;

public class contact_us {
    Main main = new Main();

    public void back() throws IOException {
        main.changeScene("controller/menu.fxml");
    }
}
