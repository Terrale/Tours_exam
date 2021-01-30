package login;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author enzo
 */
public class mysqlconnect {
    Connection conn = null;
    public static Connection ConnectDb(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/app_exam","root","");
            JOptionPane.showMessageDialog(null, "Connexion avec la base de donnée effectué");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
    }
}
