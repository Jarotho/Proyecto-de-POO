package controller.signIn;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import model.Account;
import model.AccountsDAO;
import static model.ConnectionPoolMySQL.EXCEPCIONES;
import utilities.ControllerGeneralModel;

/**
 *
 * @author wilim
 */

public class SignInFormController implements Initializable {
    
    @FXML
    private TextField txtUserSignIn, txtPasswordSignInMask;
    
    @FXML
    private PasswordField txtPasswordSignIn;
    
    @FXML
    private CheckBox checkViewPassSignIn;
    
    @FXML
    private Button btnSignIn, btnClean;
    
    private Account account;
    private AccountsDAO modelUser = new AccountsDAO();
        
    
    @FXML
    public void eventKey(KeyEvent e){
        
        String c = e.getCharacter();
        
        if(c.equalsIgnoreCase(" ")){
            e.consume();
        }
        
    }
    
    @FXML
    public void actionEvent(ActionEvent e) throws IOException{
        
        Object evt = e.getSource();
        
        if(btnSignIn.equals(evt)){                    
                         
            if(!txtUserSignIn.getText().isEmpty() && !txtPasswordSignIn.getText().isEmpty()){

                
                account = modelUser.selectAccount(txtUserSignIn.getText());
                
                if(account != null){

                    if(account.getPassword().equals(txtPasswordSignIn.getText())){
                                         
                        Parent parent = FXMLLoader.load(getClass().getResource("/SmashTestUI/MenuBar.fxml"));
                        Stage stage = new Stage();
                        Scene scene = new Scene(parent);
                        stage.setScene(scene);
                        stage.show();
                        Stage mystage = (Stage) this.btnSignIn.getScene().getWindow();
                        mystage.close();
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "La Contraseña que ha ingresado no es la correcta", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);                                            
                    }

                }else{

                    if(EXCEPCIONES.size()>0){
                        JOptionPane.showMessageDialog(null, "Surgieron errores en el proceso de consulta, posibles errores:\n"+
                                                      ControllerGeneralModel.toString(EXCEPCIONES), "ERROR", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "El Usuario no existe en la Base de Datos", "SIN RESULTADOS", JOptionPane.ERROR_MESSAGE);
                    }

                }
            
            }else{
                JOptionPane.showMessageDialog(null, "Asegurese que todos los campos esten llenos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }            
                        
        }else if(btnClean.equals(evt)){        
            
        }
    
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        maskPassword(txtPasswordSignIn, txtPasswordSignInMask, checkViewPassSignIn);
        
        
    }    
    
    public void maskPassword(PasswordField pass, TextField text, CheckBox check){
    
        text.setVisible(false);
        text.setManaged(false);
            
        text.managedProperty().bind(check.selectedProperty());
        text.visibleProperty().bind(check.selectedProperty());
        
        text.textProperty().bindBidirectional(pass.textProperty());
    
    }
    
    
    
}

