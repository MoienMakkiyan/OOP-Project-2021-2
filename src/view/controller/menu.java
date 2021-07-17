package view.controller;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import view.Main;

import java.io.IOException;

public class menu {

    Main main = new Main();

    public void start() throws IOException {
        main.changeScene("controller/levels.fxml");
    }

    public void setting() throws IOException {
        main.changeScene("controller/setting.fxml");
    }

    public void about_us() throws IOException {
        main.changeScene("controller/about_us.fxml");
    }

    public void contact_us() throws IOException {
        main.changeScene("controller/contact_us.fxml");
    }

    public void advanced_mood() throws IOException {
        main.changeScene("controller/advanced_mood.fxml");
    }

    public void logout() throws IOException {
        main.changeScene("controller/enter.fxml");
    }

    public void force_Exit(){
        Alert aLert = new Alert(Alert.AlertType.NONE);
        aLert.setTitle("Exit");
        aLert.setHeaderText("You're about to exit the program");
        aLert.setContentText("Are you sure?");
        aLert.getButtonTypes().addAll(ButtonType.YES, ButtonType.NO);
        if(aLert.showAndWait().get() == ButtonType.YES) {
            System.exit(1);
        }
    }
}
