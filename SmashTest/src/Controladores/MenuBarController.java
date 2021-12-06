package Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.Parent;

/**
 *
 * @author Jarotho
 */
public class MenuBarController implements Initializable {

    @FXML
    private BorderPane bp;
    @FXML
    private AnchorPane ap;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Inicio(MouseEvent event) {
        bp.setCenter(ap);
    }

    @FXML
    private void Jugar(MouseEvent event) {
        loadPage("Jugar");
    }

    @FXML
    private void Album(MouseEvent event) {
        loadPage("Album");
    }

    @FXML
    private void Ranking(MouseEvent event) {
        loadPage("Ranking");
    }
    
    private void loadPage(String page){
        Parent root = null;
        
        try {
            root = FXMLLoader.load(getClass().getResource(page+".fxml"));
        } catch (IOException ex) {
            Logger.getLogger(MenuBarController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        bp.setCenter(root);
        
    }
    
}
