/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.signUp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javax.swing.JOptionPane;
import model.Account;
import model.AccountsDAO;

import static model.ConnectionPoolMySQL.EXCEPCIONES;
import utilities.ControllerGeneralModel;

/**
 *
 * @author wilim
 */
public class SignUpFormController implements Initializable {

    @FXML
    private TextField txtUserSignUp;
    
    @FXML
    private PasswordField txtPassword, txtConfirmPassword;
    
 
    
    @FXML
    private Button btnSignUp, btnCleanSignUp;
    
    
    private AccountsDAO modelAccount = new AccountsDAO();
    

    
    @FXML
    public void keyEvent(KeyEvent e){
        
        String c = e.getCharacter();
        
        if(c.equalsIgnoreCase(" ")){
            e.consume();
        }
        
    }   
    
    @FXML
    public void actionEvent(ActionEvent e){
        
        Object evt = e.getSource();
        
        if(btnSignUp.equals(evt)){
        
            if(!txtUserSignUp.getText().isEmpty() && 
               !txtConfirmPassword.getText().isEmpty() && !txtPassword.getText().isEmpty()){
                
                    
                    if(txtUserSignUp.getText().length()>=3){


                            if(txtConfirmPassword.getText().equals(txtPassword.getText())){
                                
                                if(modelAccount.selectAccount(txtUserSignUp.getText())== null){

                                Account account = new Account();
                                account.setPassword(txtPassword.getText());
                                account.setUser(txtUserSignUp.getText());

                                if(modelAccount.insertAccount(account)){

                                    JOptionPane.showMessageDialog(null, "Se ha registrado correctamente", "OPERACIÓN ÉXITOSA", JOptionPane.INFORMATION_MESSAGE);
                                    

                                }else{

                                    if(EXCEPCIONES.size()>0){
                                        JOptionPane.showMessageDialog(null, "Surgieron errores en el proceso, posibles errores: \n"
                                                + ControllerGeneralModel.toString(EXCEPCIONES));
                                    }

                                }

                                }else{
                                     JOptionPane.showMessageDialog(null, "El usuario ya existe", "ERROR", JOptionPane.ERROR_MESSAGE);
                                }
                                
                            }else{
                                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }

                    }else{
                        JOptionPane.showMessageDialog(null, "El Nombre de usuario debe contener al menos tres caracteres", "ERROR", JOptionPane.ERROR_MESSAGE);                                                                                                       
                    }
                    
                                
                
            }else{
                JOptionPane.showMessageDialog(null, "Asegurese que todos los campos esten llenos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }                        
                                
        }else if(btnCleanSignUp.equals(evt)){        
                    
        }
    
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

