/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class MetroidAlbumController implements Initializable {

    @FXML
    private AnchorPane MetroidPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SamusWiki(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("SamusWiki.fxml"));
    MetroidPane.getChildren().setAll(pane);
    }

    @FXML
    private void BackToMenu(ActionEvent event) throws IOException {
    AnchorPane pane = FXMLLoader.load(getClass().getResource("SamusWiki.fxml"));
    MetroidPane.getChildren().setAll(pane);
    }
    
    
}
