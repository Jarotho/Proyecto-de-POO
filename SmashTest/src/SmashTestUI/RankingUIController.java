/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package SmashTestUI;

import Controladores.UsuariosJpaController;
import Entidad.Usuarios;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * FXML Controller class
 *
 * @author donco
 */
public class RankingUIController implements Initializable {
    
    
    final EntityManagerFactory emf=Persistence.createEntityManagerFactory("SmashTestPU");
    final EntityManager em=emf.createEntityManager();
    //UsuariosJpaController CUsuarios= new UsuariosJpaController();
    //Usuarios usuario= new Usuarios();
    //List<Usuarios> userList;
    //@FXML
    //private TableColumn<Usuarios, String> col_contra;

    @FXML
    private TableColumn<Usuarios, Integer> col_exp;

    //@FXML
    //private TableColumn<Usuarios, Integer> col_id;

    @FXML
    private TableColumn<Usuarios, String> col_usuario;

    @FXML
    private TableView<Usuarios> tableView;
    @FXML
    void actualizarTabla(ActionEvent event) {
        tableView.setItems(getUsuarios());
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        initColumns();
        tableView.setItems(getUsuarios());
        
    }
    private ObservableList<Usuarios> usuarios;
    private UsuariosJpaController control;
public void initColumns(){
    //col_id.setCellValueFactory(new PropertyValueFactory<>("idUsuarios"));
    col_usuario.setCellValueFactory(new PropertyValueFactory<>("nombreUsuario"));
    //col_contra.setCellValueFactory(new PropertyValueFactory<>("contrasenaUsuario"));
    
    
    col_exp.setCellValueFactory(new PropertyValueFactory<>("experienciaUsuario"));
}    

    

    private ObservableList<Usuarios> getUsuarios() {
        control=new UsuariosJpaController();
        usuarios=FXCollections.observableArrayList(control.getUsuarios());
        return usuarios;
    }
    
}
