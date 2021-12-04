/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package SmashTestUI;

import Controladores.UsuariosJpaController;
import Entidad.Usuarios;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
//import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author donco
 */
public class FXMLLoginController implements Initializable {
    UsuariosJpaController CUsuarios= new UsuariosJpaController();
    Usuarios usuario= new Usuarios();
    @FXML
    private Button BtnRegistro;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUser;
    
    @FXML
    void cambiarStage(ActionEvent event) throws IOException{
        /*Parent rankingParent=FXMLLoader.load(getClass().getResource("RankingUI.fxml"));
        Scene rankingScene=new Scene(rankingParent);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(rankingScene);
        window.show();*/
        Parent menuParent=FXMLLoader.load(getClass().getResource("MenuUI.fxml"));
        Scene menuScene=new Scene(menuParent);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(menuScene);
        window.show();
    }

    @FXML
    void addUser(ActionEvent event) {
        
        usuario.setNombreUsuario(txtUser.getText());
        usuario.setContrasenaUsuario(txtPassword.getText());
        usuario.setExperienciaUsuario("0");
        CUsuarios.create(usuario);
        txtUser.setText("");
        txtPassword.setText("");
        
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
}
