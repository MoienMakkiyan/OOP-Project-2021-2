package view.controller;

import basecode.Functions.GAME_ORDERS;
import basecode.Functions.Variable_Reading;
import basecode.Objects.User;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import view.Main;

import java.io.FileNotFoundException;
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

    public void Login() throws IOException {
        main.changeScene("controller/enter.fxml");
    }

    public void Register() throws IOException {
        accept_user.setText("");
        accept_password.setText("");
        if (textField.getText().isEmpty()){
            accept_user.setText("Enter Username");
        }
        else if (passwordField.getText().isEmpty()){
            accept_password.setText("Enter Password");
        } else if (backUserINDEX(textField.getText())!=-1){
            accept_user.setText("Already Exist");
        } else {
            accept_user.setText("Accepted");
            accept_password.setText("Accepted");
            Variable_Reading.getInstance().getUsers().add(new User(textField.getText(), passwordField.getText()));
            GAME_ORDERS.getInstance().newUser(textField.getText());
            try {
                Variable_Reading.getInstance().save();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Variable_Reading.getInstance().save();
            main.changeScene("controller/enter.fxml");
        }
    }

    public int backUserINDEX(String name){
        int a=-1;
        for (int i=0;i<Variable_Reading.getInstance().getUsers().size();i++){
            if (name.equalsIgnoreCase(Variable_Reading.getInstance().getUsers().get(i).getName())){
                a=i;
                break;
            }
        }
        return a;
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
