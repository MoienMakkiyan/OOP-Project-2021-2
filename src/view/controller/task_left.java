package view.controller;

import basecode.Functions.Main_Manager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class task_left {
    @FXML
    Label level;
    @FXML
    Label coin;
    @FXML
    Label wild_animal;
    @FXML
    Label bread;
    @FXML
    Label buffalo_milk;
    @FXML
    Label egg;
    @FXML
    Label flour;
    @FXML
    Label icecream;
    @FXML
    Label pocketmilk;
    @FXML
    Label shirt;
    @FXML
    Label textile;
    @FXML
    Label feather;
    @FXML
    Label time_passed;

    public void initialize(){
        level.setText("Level "+ Main_Manager.getInstance().getCurrent_level());
        coin.setText(Main_Manager.getInstance().getCURRENT_USER().getCoin()+"/"+Main_Manager.getInstance().getMissions().get(Main_Manager.getInstance().getCurrent_level()-1).getCoin());
        wild_animal.setText(Main_Manager.getInstance().getWild_animal_n()+"/"+Main_Manager.getInstance().getMissions().get(Main_Manager.getInstance().getCurrent_level()-1).getWild_animal());
        bread.setText(Main_Manager.getInstance().getBread_n()+"/"+Main_Manager.getInstance().getMissions().get(Main_Manager.getInstance().getCurrent_level()-1).getBread());
        buffalo_milk.setText(Main_Manager.getInstance().getBuffalo_milk_n()+"/"+Main_Manager.getInstance().getMissions().get(Main_Manager.getInstance().getCurrent_level()-1).getBuffalo_milk());
        egg.setText(Main_Manager.getInstance().getEgg_n()+"/"+Main_Manager.getInstance().getMissions().get(Main_Manager.getInstance().getCurrent_level()-1).getEgg());
        flour.setText(Main_Manager.getInstance().getFlour_n()+"/"+Main_Manager.getInstance().getMissions().get(Main_Manager.getInstance().getCurrent_level()-1).getFlour());
        icecream.setText(Main_Manager.getInstance().getIcecream_n()+"/"+Main_Manager.getInstance().getMissions().get(Main_Manager.getInstance().getCurrent_level()-1).getIcecream());
        pocketmilk.setText(Main_Manager.getInstance().getPocketmilk_n()+"/"+Main_Manager.getInstance().getMissions().get(Main_Manager.getInstance().getCurrent_level()-1).getPocketmilk());
        shirt.setText(Main_Manager.getInstance().getShirt_n()+"/"+Main_Manager.getInstance().getMissions().get(Main_Manager.getInstance().getCurrent_level()-1).getShirt());
        textile.setText(Main_Manager.getInstance().getTextile_n()+"/"+Main_Manager.getInstance().getMissions().get(Main_Manager.getInstance().getCurrent_level()-1).getTextile());
        feather.setText(Main_Manager.getInstance().getTurkey_feather_n()+"/"+Main_Manager.getInstance().getMissions().get(Main_Manager.getInstance().getCurrent_level()-1).getTurkey_feather());
        time_passed.setText(String.valueOf(Main_Manager.getInstance().getMissions().get(Main_Manager.getInstance().getCurrent_level()-1).getTime_passed_in_this_level()));
    }

    public void back(ActionEvent actionEvent){
        Node source = (Node)  actionEvent.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        stage.close();
    }
}
