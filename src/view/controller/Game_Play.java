package view.controller;

import javafx.geometry.Rectangle2D;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import com.sun.javafx.scene.SceneHelper;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import view.Main;

import java.io.IOException;


public class Game_Play {



    public void pause() throws IOException {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("wareHouse");
        Pane root = FXMLLoader.load(getClass().getResource("Game_Play_Paused.fxml"));
        Image icon = new Image(getClass().getResourceAsStream("/image_source/game_logo.png"));
        window.setScene(new Scene(root, 400 , 600));
        window.getIcons().add(icon);
        window.showAndWait();
    }

}
