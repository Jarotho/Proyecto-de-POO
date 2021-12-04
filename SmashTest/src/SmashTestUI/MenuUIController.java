/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package SmashTestUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author donco
 */
public class MenuUIController implements Initializable {

    @FXML
    private Button butAlbum;

    @FXML
    private Button butInicio;

    @FXML
    private Button butJugar;

    @FXML
    private Button butRanking;

    @FXML
    void album(ActionEvent event) {

    }

    @FXML
    void inicio(ActionEvent event) {

    }

    @FXML
    void jugar(ActionEvent event) {

    }

    @FXML
    void rankingShow(ActionEvent event) throws IOException {
        Parent rankParent=FXMLLoader.load(getClass().getResource("RankingUI.fxml"));
        Scene rankScene=new Scene(rankParent);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(rankScene);
        window.show();
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
