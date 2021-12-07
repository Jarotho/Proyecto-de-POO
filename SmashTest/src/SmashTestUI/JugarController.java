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
public class JugarController implements Initializable {

    @FXML
    private AnchorPane JugarPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void CuestionarioMario(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("CuestionarioMario.fxml"));
    JugarPane.getChildren().setAll(pane);
    }

    @FXML
    private void CuestionarioKirby(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("CuestionarioKirby.fxml"));
    JugarPane.getChildren().setAll(pane);
        
    }

    @FXML
    private void CuestionarioSamus(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("CuestionarioSamus.fxml"));
    JugarPane.getChildren().setAll(pane);
        
    }

    @FXML
    private void CuestionarioDK(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("CuestionarioDK.fxml"));
    JugarPane.getChildren().setAll(pane);
    
    }
    
}
