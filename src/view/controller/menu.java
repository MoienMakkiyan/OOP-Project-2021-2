package view.controller;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

public class menu {

    public void start(){

    }

    public void setting(){

    }

    public void about_us(){

    }

    public void contact_us(){

    }

    public void advanced_mood(){

    }

    public void logout(){

    }

    public void exit(Stage stage) throws IOException {
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
