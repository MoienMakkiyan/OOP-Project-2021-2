package view.controller;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class levels {
    private Label error_box;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    public void level1(){

    }

    public void level2(){

    }

    public void level3(){

    }

    public void level4(){

    }

    public void level5(){

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
