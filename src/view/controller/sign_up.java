package view.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import view.Main;

import java.io.IOException;

public class sign_up {
    Main main = new Main();

    @FXML
    private Label accept_user;
    @FXML
    private Label accept_password;
    @FXML
    private TextField textField;
    @FXML
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
