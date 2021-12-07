
package model;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static model.ConnectionPoolMySQL.EXCEPCIONES;
import utilities.ControllerGeneralModel;


public class AccountsDAO {
        
    public boolean insertAccount(Account account){

        EXCEPCIONES = new ArrayList<>();
        boolean state = false;
        
        Connection connection = null;
        PreparedStatement pst;
        
        try{
            
            connection = ConnectionPoolMySQL.getInstance().getConnection();
            
            if(connection!=null){
                
                String sql = "INSERT INTO accounts (password, user) "
                        + "VALUES (AES_ENCRYPT(?, 'key'), ?)"; 
                 
                pst = connection.prepareStatement(sql);
                pst.setString(1, account.getPassword());
                pst.setString(2, account.getUser());
                
                
                state = pst.executeUpdate() > 0;
                
            }else{                
                EXCEPCIONES.add(ControllerGeneralModel.enumSizeExcepcion(EXCEPCIONES)+"- "+"Error al conectar con la base de datos");
            }
            
        }catch(HeadlessException | SQLException ex){
            EXCEPCIONES.add(ControllerGeneralModel.enumSizeExcepcion(EXCEPCIONES)+"- "+ex.getMessage());            
        }finally{
            
            try{
                if(connection != null){
                    ConnectionPoolMySQL.getInstance().closeConnection(connection);            
                }            
            }catch(SQLException ex){
                EXCEPCIONES.add(ControllerGeneralModel.enumSizeExcepcion(EXCEPCIONES)+"- "+ex.getMessage());
            }

        }
        
        
        return state;
    }    
    
    public Account selectAccount(String user){
        
        EXCEPCIONES = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement pst;
        ResultSet rs;        
        
        Account account=null;

        try{
            
            connection = ConnectionPoolMySQL.getInstance().getConnection();
            
            if(connection!=null){
                
                String sql = "SELECT accounts.id AS idAccounts, accounts.user, CAST(AES_DECRYPT(accounts.password, 'key') AS CHAR(50)) AS password"
                        + " FROM accounts "
                        + " WHERE BINARY user=? ";
                
                
                
                pst = connection.prepareStatement(sql);
                pst.setString(1, user);
                
                rs = pst.executeQuery();
                
                if(rs.next()){
                    
                    account = new Account();
                    
                    account.setId(rs.getInt("idAccounts"));
                    account.setUser(rs.getString("user"));
                    account.setPassword(rs.getString("password"));
     
                }
                
            }else{                
                EXCEPCIONES.add(ControllerGeneralModel.enumSizeExcepcion(EXCEPCIONES)+"- "+"Error al conectar con la base de datos");
            }
            
        }catch(HeadlessException | SQLException ex){
            EXCEPCIONES.add(ControllerGeneralModel.enumSizeExcepcion(EXCEPCIONES)+"- "+ex.getMessage());            
        }finally{
            
            try{
                if(connection != null){
                    ConnectionPoolMySQL.getInstance().closeConnection(connection);            
                }            
            }catch(SQLException ex){
                EXCEPCIONES.add(ControllerGeneralModel.enumSizeExcepcion(EXCEPCIONES)+"- "+ex.getMessage());
            }

        }
        
        return account;
        
    }    
}
