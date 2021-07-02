package MODEL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio Aquino
 */
public class ConexaoBD {
    String user = "root";
    String password = "";
    String nameDB = "java_login";
    String local = "localhost:3306";
    
    public Connection conectaBD(){   
        
        Connection conn = null;
                
        try {
            String url = "jdbc:mysql://"+ local +"/"+ nameDB +"?user="+ user +"&password="+ password;
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoBD" + erro.getMessage());
        }
        return conn;
    }
}
