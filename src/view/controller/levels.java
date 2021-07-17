package view.controller;

import basecode.Functions.Main_Manager;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import view.Main;

import java.io.IOException;

public class levels {
    Main main = new Main();

    @FXML
    private Label error_box;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;

    public void initialize(){
        if (!check_level(1)){
            button1.setDisable(true);
        }
        else {
            button1.setDisable(false);
        }
        if (!check_level(2)){
            button2.setDisable(true);
        }
        else {
            button2.setDisable(false);
        }
        if (!check_level(3)){
            button3.setDisable(true);
        }
        else {
            button3.setDisable(false);
        }
        if (!check_level(4)){
            button4.setDisable(true);
        }
        else {
            button4.setDisable(false);
        }
        if (!check_level(5)){
            button5.setDisable(true);
        }
        else {
            button5.setDisable(false);
        }
    }

    public boolean check_level(int n){
        if (Main_Manager.getInstance().getCURRENT_USER().getLevel()>=n)
            return true;
        else return false;
    }

    public void level1() throws IOException {
        Main_Manager.getInstance().setCurrent_level(1);
        main.changeScene("controller/Game_Play.fxml");
    }

    public void level2() throws IOException {
        Main_Manager.getInstance().setCurrent_level(2);
        main.changeScene("controller/Game_Play.fxml");
    }

    public void level3() throws IOException {
        Main_Manager.getInstance().setCurrent_level(3);
        main.changeScene("controller/Game_Play.fxml");
    }

    public void level4() throws IOException {
        Main_Manager.getInstance().setCurrent_level(4);
        main.changeScene("controller/Game_Play.fxml");
    }

    public void level5() throws IOException {
        Main_Manager.getInstance().setCurrent_level(5);
        main.changeScene("controller/Game_Play.fxml");
    }

    public void logout() throws IOException {
        main.changeScene("controller/enter.fxml");
    }

    public void main_menu() throws IOException {
        main.changeScene("controller/menu.fxml");
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
