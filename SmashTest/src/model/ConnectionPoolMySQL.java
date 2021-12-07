package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.commons.dbcp2.BasicDataSource;

public class ConnectionPoolMySQL {
 
    public static ArrayList<String> EXCEPCIONES;
    
    private final String DB="usuarios";
    private final String URL="jdbc:mysql://127.0.0.1:3306/"+DB;
    private final String USER="wilbert";
    private final String PASS="123456";
    
    private static ConnectionPoolMySQL dataSource;
    private BasicDataSource basicDataSource=null;
    
    private ConnectionPoolMySQL(){
     
        basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        basicDataSource.setUsername(USER);
        basicDataSource.setPassword(PASS);
        basicDataSource.setUrl(URL);
        
        basicDataSource.setMinIdle(5);
        basicDataSource.setMaxIdle(20);
        basicDataSource.setMaxTotal(50);
        basicDataSource.setMaxWaitMillis(-1);
        
    }
    
    public static ConnectionPoolMySQL getInstance() {
        if (dataSource == null) {
            dataSource = new ConnectionPoolMySQL();
        }
        return dataSource;
    }

    public Connection getConnection() throws SQLException{
      return this.basicDataSource.getConnection();
    }
    
    public void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }    
    
}
