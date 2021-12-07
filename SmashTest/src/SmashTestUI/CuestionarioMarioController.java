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
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class CuestionarioMarioController implements Initializable {

    @FXML
    private AnchorPane Cuestionario3Pane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackToQuestionaire(ActionEvent event) throws IOException  {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Jugar.fxml"));
    Cuestionario3Pane.getChildren().setAll(pane);
    }

    @FXML
    private void CorrectaP1(ActionEvent event) {
    }
    
}
