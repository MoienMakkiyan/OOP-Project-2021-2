package view.controller;

import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class sign_up {
    private Label accept_user;
    private Label accept_password;
    private TextField textField;
    private PasswordField passwordField;

    public void Login(){

    }

    public void Register(){

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
