package view.controller;

import javafx.application.Platform;
import view.Main;

import java.io.IOException;

public class advanced_mood {

    Main main = new Main();

    public void End() throws IOException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        Platform.runLater(thread);

        main.changeScene("controller/menu.fxml");
    }
}
