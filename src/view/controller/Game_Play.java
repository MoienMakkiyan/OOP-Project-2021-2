package view.controller;

import basecode.Functions.GAME_ORDERS;
import basecode.Functions.Main_Manager;
import basecode.Functions.Variable_Reading;
import basecode.Main;
import basecode.Objects.Animal.*;
import basecode.Objects.Products.*;
import basecode.Objects.X_Y;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
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

import java.io.IOException;
import java.util.HashMap;


public class Game_Play {

    private final int WIDTH = 346;
    private final int HEIGHT = 314;
    private final int XX = 215;
    private final int YY = 168;

    @FXML
    AnchorPane all_scene;

    @FXML
    AnchorPane base_map;

    @FXML
    Button bakery;

    @FXML
    Button MilkPacking;

    @FXML
    Button Mill;

    @FXML
    Button textile;

    @FXML
    Button icecream_shop;

    @FXML
    Button tailoring;

    @FXML
    Button buy_bakery;

    @FXML
    Button buy_MilkPacking;

    @FXML
    Button buy_Mill;

    @FXML
    Button buy_textile;

    @FXML
    Button buy_icecream_shop;

    @FXML
    Button buy_tailoring;

    public void initialize(){

        base_map.setOnMouseClicked(event -> {
            Add_Grass(event.getX(), event.getY());
        });

        if (Main_Manager.getInstance().getSecondaryWorkshop_bakeries().size() == 0){
            bakery.setDisable(true);
        }
        else bakery.setDisable(false);

        if (Main_Manager.getInstance().getPrimaryWorkshop_milkPackings().size() == 0){
            MilkPacking.setDisable(true);
        }
        else MilkPacking.setDisable(false);

        if (Main_Manager.getInstance().getPrimaryWorkshop_mills().size() == 0){
            Mill.setDisable(true);
        }
        else Mill.setDisable(false);

        if (Main_Manager.getInstance().getPrimaryWorkshop_textiles().size() == 0){
            textile.setDisable(true);
        }
        else textile.setDisable(false);

        if (Main_Manager.getInstance().getSecondaryWorkshop_icecreamShops().size() == 0){
            icecream_shop.setDisable(true);
        }
        else icecream_shop.setDisable(false);

        if (Main_Manager.getInstance().getSecondaryWorkshop_tailorings().size() == 0){
            tailoring.setDisable(true);
        }
        else tailoring.setDisable(false);
    }

    public void Refresh() throws IOException {
        GAME_ORDERS.getInstance().Turn(1,Main_Manager.getInstance().getCURRENT_USER());
        Main_Manager.getInstance().print();
        base_map.getChildren().clear();
        Add_images();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    public void Add_images(){
        //Add Grass
        for (int i = 0; i < Variable_Reading.getInstance().getMap_size()[0] ; i++){
            for (int j = 0 ; j < Variable_Reading.getInstance().getMap_size()[1] ; j++){
                if (Main_Manager.getInstance().getCell()[i][j].hasGrass()){
                    for (int k = 0 ; k < Main_Manager.getInstance().getCell()[i][j].getHasGrass() ; k++){
                        image(i+1,j+1,"grass",false);
                    }
                }
            }
        }
        //Add bear
        for (Bear bear : Main_Manager.getInstance().getBears()){
            if (bear.isActivation()){
                image(bear.getX(),bear.getY(),"bear",false);
            }
            else {
                image(bear.getX(),bear.getY(),"bear",true);
                if (bear.getCage_counter() == 1){
                    image(bear.getX(),bear.getY(),"cage1",true);
                } else if (bear.getCage_counter() == 2){
                    image(bear.getX(),bear.getY(),"cage2",true);
                } else if (bear.getCage_counter() == 3){
                    image(bear.getX(),bear.getY(),"cage3",true);
                } else if (bear.getCage_counter() == 4){
                    image(bear.getX(),bear.getY(),"cage4",true);
                }
            }
        }
        //Add Buffalo
        for (Buffalo buffalo : Main_Manager.getInstance().getBuffalos()){
            image(buffalo.getX(),buffalo.getY(),"Buffalo",false);
        }
        //Add Chicken
        for (Chicken chicken : Main_Manager.getInstance().getChickens()){
            image(chicken.getX(),chicken.getY(),"chicken",false);
        }
        //Add CollectorCat
        for (CollectorCat collectorCat : Main_Manager.getInstance().getCollectorCats()){
            image(collectorCat.getX(),collectorCat.getY(),"cat",false);
        }
        //Add HunterDog
        for (HunterDog hunterDog : Main_Manager.getInstance().getHunterDogs()){
            image(hunterDog.getX(),hunterDog.getY(),"dog",false);
        }
        //Add Lion
        for (Lion lion : Main_Manager.getInstance().getLions()){
            if (lion.isActivation()){
                image(lion.getX(),lion.getY(),"lion",false);
            }
            else {
                image(lion.getX(),lion.getY(),"lion",true);
                if (lion.getCage_counter() == 1){
                    image(lion.getX(),lion.getY(),"cage1",true);
                } else if (lion.getCage_counter() == 2){
                    image(lion.getX(),lion.getY(),"cage2",true);
                } else if (lion.getCage_counter() == 3){
                    image(lion.getX(),lion.getY(),"cage3",true);
                } else if (lion.getCage_counter() == 4){
                    image(lion.getX(),lion.getY(),"cage4",true);
                }
            }
        }
        //Add Ostrich
        for (Ostrich ostrich : Main_Manager.getInstance().getOstriches()){
            image(ostrich.getX(),ostrich.getY(),"ostrich",false);
        }
        //Add tiger
        for (Tiger tiger : Main_Manager.getInstance().getTigers()){
            if (tiger.isActivation()){
                image(tiger.getX(),tiger.getY(),"tiger",false);
            }
            else {
                image(tiger.getX(),tiger.getY(),"tiger",true);
                if (tiger.getCage_counter() == 1){
                    image(tiger.getX(),tiger.getY(),"cage1",true);
                } else if (tiger.getCage_counter() == 2){
                    image(tiger.getX(),tiger.getY(),"cage2",true);
                } else if (tiger.getCage_counter() == 3){
                    image(tiger.getX(),tiger.getY(),"cage3",true);
                } else if (tiger.getCage_counter() == 4){
                    image(tiger.getX(),tiger.getY(),"cage4",true);
                }
            }
        }
        //Add bread
        for (Bread bread : Main_Manager.getInstance().getBreads()){
            if (bread.isInMap()){
                image(bread.getX(),bread.getY(),"BREAD",false);
            }
        }
        //Add BuffaloMilk
        for (BuffaloMilk buffaloMilk : Main_Manager.getInstance().getBuffaloMilks()){
            if (buffaloMilk.isInMap()){
                image(buffaloMilk.getX(),buffaloMilk.getY(),"MILK",false);
            }
        }
        //Add Egg
        for (Egg egg : Main_Manager.getInstance().getEggs()){
            if (egg.isInMap()){
                image(egg.getX(),egg.getY(),"EGG",false);
            }
        }
        //Add Flour
        for (Flour flour : Main_Manager.getInstance().getFlours()){
            if (flour.isInMap()){
                image(flour.getX(),flour.getY(),"FLOUR",false);
            }
        }
        //Add Icecream
        for (Icecream icecream : Main_Manager.getInstance().getIcecreams()){
            if (icecream.isInMap()){
                image(icecream.getX(),icecream.getY(),"ICE_CREAM",false);
            }
        }
        //Add PocketMilk
        for (PocketMilk pocketMilk : Main_Manager.getInstance().getPocketMilks()){
            if (pocketMilk.isInMap()){
                image(pocketMilk.getX(),pocketMilk.getY(),"PACKET_MILK",false);
            }
        }
        //Add Shirt
        for (Shirt shirt : Main_Manager.getInstance().getShirts()){
            if (shirt.isInMap()){
                image(shirt.getX(),shirt.getY(),"SHIRT",false);
            }
        }
        //Add Textile
        for (Textile textile : Main_Manager.getInstance().getTextiles()){
            if (textile.isInMap()){
                image(textile.getX(),textile.getY(),"FABRIC",false);
            }
        }
        //Add TurkeyFeather
        for (TurkeyFeather turkeyFeather : Main_Manager.getInstance().getTurkeyFeathers()){
            if (turkeyFeather.isInMap()){
                image(turkeyFeather.getX(),turkeyFeather.getY(),"FEATHER",false);
            }
        }
    }

    public void image(int x, int y, String name, boolean wild){
        ImageView image = new ImageView(new Image("@../../image_source/"+name+".png"));//TODO
        X_Y x_y_view = back_scaleXY(x,y);
        image.setLayoutX(x_y_view.getX());
        image.setLayoutY(x_y_view.getY());
        image.setFitWidth(WIDTH/Variable_Reading.getInstance().getMap_size()[0]);
        image.setFitHeight(HEIGHT/Variable_Reading.getInstance().getMap_size()[1]);
        if (wild){
            image.setOnMouseClicked(event -> {
                GAME_ORDERS.getInstance().Cage(x,y,Main_Manager.getInstance().getCURRENT_USER());
            });
        }
        base_map.getChildren().add(image);
    }

    public void buy_bakery_click(){
        //TODO
        bakery.setDisable(false);
        all_scene.getChildren().remove(buy_bakery);
    }

    public void buy_MilkPacking_click(){
        //TODO
        MilkPacking.setDisable(false);
        all_scene.getChildren().remove(buy_MilkPacking);
    }

    public void buy_Mill_click(){
        //TODO
        Mill.setDisable(false);
        all_scene.getChildren().remove(buy_Mill);
    }

    public void buy_textile_click(){
        //TODO
        textile.setDisable(false);
        all_scene.getChildren().remove(buy_textile);
    }

    public void buy_icecream_shop_click(){
        //TODO
        icecream_shop.setDisable(false);
        all_scene.getChildren().remove(buy_icecream_shop);
    }

    public void buy_tailoring_click(){
        //TODO
        tailoring.setDisable(false);
        all_scene.getChildren().remove(buy_tailoring);
    }

    public void truck_click(){

    }

    public void warehouse_click(){

    }

    public void Add_Grass(double X, double Y){
        System.out.println(X);
        System.out.println(Y);
        X_Y x_y = scaleXY(X,Y);
        System.out.println(x_y.getX());
        System.out.println(x_y.getY());
        if (GAME_ORDERS.getInstance().Plant(x_y.getX(),x_y.getY(),Main_Manager.getInstance().getCURRENT_USER())){
            ImageView image = new ImageView(new Image("@../../image_source/grass.png"));//TODO
            X_Y x_y_view = back_scaleXY(x_y.getX(),x_y.getY());
            image.setLayoutX(x_y_view.getX());
            image.setLayoutY(x_y_view.getY());
            image.setFitWidth(WIDTH/Variable_Reading.getInstance().getMap_size()[0]);
            image.setFitHeight(HEIGHT/Variable_Reading.getInstance().getMap_size()[1]);
            base_map.getChildren().add(image);
        }
    }

    public X_Y scaleXY(double X, double Y){
        X_Y x_y = new X_Y(0,0);
        x_y.setX((int) Math.ceil((X)/(WIDTH/ Variable_Reading.getInstance().getMap_size()[0])));
        x_y.setY((int) Math.ceil((Y)/(HEIGHT/ Variable_Reading.getInstance().getMap_size()[1])));
        return x_y;
    }

    public X_Y back_scaleXY(int X, int Y){
        X_Y x_y = new X_Y(0,0);
        x_y.setX((X-1)*(WIDTH/Variable_Reading.getInstance().getMap_size()[0]));
        x_y.setY((Y-1)*(HEIGHT/Variable_Reading.getInstance().getMap_size()[1]));
        return x_y;
    }


    public void MilkPacking_click(){

    }

    public void Mill_click(){

    }

    public void Textile_click(){

    }

    public void Bakery_click(){

    }

    public void Icecream_shop_click(){

    }

    public void Tailoring_click(){

    }

    public void BuyCat(){
        GAME_ORDERS.getInstance().Buy("Cat",Main_Manager.getInstance().getCURRENT_USER());
    }

    public void BuyDog(){
        GAME_ORDERS.getInstance().Buy("Dog", Main_Manager.getInstance().getCURRENT_USER());
    }

    public void BuyBuffalo(){
        GAME_ORDERS.getInstance().Buy("Buffalo",Main_Manager.getInstance().getCURRENT_USER());
    }

    public void BuyOstrich(){
        GAME_ORDERS.getInstance().Buy("Ostrich",Main_Manager.getInstance().getCURRENT_USER());
    }

    public void BuyChicken(){
        GAME_ORDERS.getInstance().Buy("Chicken",Main_Manager.getInstance().getCURRENT_USER());
    }

    public void welling(){
        GAME_ORDERS.getInstance().Well(Main_Manager.getInstance().getCURRENT_USER());
    }

    public void pause() throws IOException {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Pause");
        Pane root = FXMLLoader.load(getClass().getResource("Game_Play_Paused.fxml"));
        Image icon = new Image(getClass().getResourceAsStream("/image_source/game_logo.png"));
        window.setScene(new Scene(root, 400 , 600));
        window.getIcons().add(icon);
        window.showAndWait();
    }

}
