package view.controller;

import basecode.Functions.Main_Manager;
import basecode.Functions.Variable_Reading;
import basecode.Objects.Logger;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import view.Main;

import java.io.IOException;

public class enter {
    Main main = new Main();

    @FXML
    private Label error_box;
    @FXML
    private TextField textField;
    @FXML
    private PasswordField passwordField;

    public void Login() throws IOException {
        error_box.setText("");
        if (textField.getText().isEmpty()){
            error_box.setText("Please Enter Username ...");
        }
        else if (passwordField.getText().isEmpty()){
            error_box.setText("Please Enter Password ...");
        }
        else {
            if (backUserINDEX(textField.getText())==-1){
                error_box.setText("This USERNAME have not found please try again...");
            }
            else {
                if (passwordField.getText().equalsIgnoreCase(Variable_Reading.getInstance().getUsers().get(backUserINDEX(textField.getText())).getPassword())){
                    Logger.getInstance().setLogger(Variable_Reading.getInstance().getUsers().get(backUserINDEX(textField.getText())));
                    Logger.getInstance().getLogger().info("This Username Entered.");
                    Main_Manager.getInstance().setCURRENT_USER(Variable_Reading.getInstance().getUsers().get(backUserINDEX(textField.getText())));
                    Logger.getInstance().getLogger().info("Password Accepted & Its Logged in.");
                    main.changeScene("controller/menu.fxml");
                }
                else {
                    Logger.getInstance().getLogger().warning("Wrong Password !");
                    error_box.setText("Wrong Password !");
                }
            }
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

    public void Signup() throws IOException {
        main.changeScene("controller/sign_up.fxml");
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
