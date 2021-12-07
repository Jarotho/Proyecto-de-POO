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
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class MarioAlbumController implements Initializable {

    @FXML
    private AnchorPane MarioPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void MarioWiki(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("MarioWiki.fxml"));
    MarioPane.getChildren().setAll(pane);
    }

    @FXML
    private void BackToMenu(ActionEvent event) throws IOException {
        ScrollPane pane = FXMLLoader.load(getClass().getResource("Album.fxml"));
    MarioPane.getChildren().setAll(pane);
    }
    
}
