package login;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author enzo
 */
public class FXMLDocumentController implements Initializable {
    
  @FXML
    private AnchorPane pane_login;

    @FXML
    private TextField txt_username;

    @FXML
    private PasswordField txt_password;

    @FXML
    private ComboBox<String> type;

    @FXML
    private Button btn_login;

    @FXML
    private AnchorPane pane_signup;

    @FXML
    private TextField txt_username_up;

    @FXML
    private TextField txt_password_up;

    @FXML
    private TextField email_up;

    @FXML
    private ComboBox<String>  type_up;
    
    
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public void LoginpaneShow(){
    
        pane_login.setVisible(true);
        pane_signup.setVisible(false);
    }
    
    public void SignuppaneShow(){
    
        pane_login.setVisible(false);
        pane_signup.setVisible(true);
    }

    
    
    
    @FXML  
    private void Login (ActionEvent event) throws Exception{  
    conn = mysqlconnect.ConnectDb();
    String sql = "Select * from users where username = ? and password = ? and type = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_username.getText());
            pst.setString(2, txt_password.getText());
            pst.setString(3, type.getValue().toString());
            rs = pst.executeQuery();
            
            if(rs.next()){ 
                JOptionPane.showMessageDialog(null, "Pseudonyme et Mot de Passe correcte  !");
                
                if(type.getValue().toString() == "admin") {
                    btn_login.getScene().getWindow().hide();
                    Parent root = FXMLLoader.load(getClass().getResource("CPanelAdmin.fxml"));
                    Stage mainStage = new Stage();
                    Scene scene = new Scene(root);
                    mainStage.setScene(scene);
                    mainStage.show();
                }

                if(type.getValue().toString() == "scolarité") {
                    btn_login.getScene().getWindow().hide();
                    Parent root = FXMLLoader.load(getClass().getResource("CPanelSco.fxml"));
                    Stage mainStage = new Stage();
                    Scene scene = new Scene(root);
                    mainStage.setScene(scene);
                    mainStage.show();
                }

                if(type.getValue().toString() == "secrétariat") {
                    btn_login.getScene().getWindow().hide();
                    Parent root = FXMLLoader.load(getClass().getResource("CPanelSecr.fxml"));
                    Stage mainStage = new Stage();
                    Scene scene = new Scene(root);
                    mainStage.setScene(scene);
                    mainStage.show();
                }

            }else
                JOptionPane.showMessageDialog(null, "Pseudonyme ou Mot de Passe incorrecte (vérifier le type)");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
   
    }
    
    
    public void add_users(ActionEvent event){    
        conn = mysqlconnect.ConnectDb();
        String sql = "insert into users (username,password,type,email) values (?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_username_up.getText());
            pst.setString(2, txt_password_up.getText());
            pst.setString(3, type_up.getValue().toString());
            pst.setString(4, email_up.getText());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Inscription effectué !");
            txt_username_up.clear();
            txt_password_up.clear();
            email_up.clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }  
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        type_up.getItems().addAll("secrétariat","scolarité","admin");
        type.getItems().addAll("secrétariat","scolarité","admin");
        type_up.getSelectionModel().select("scolarité");
        type.getSelectionModel().select("scolarité");
    }    
    
}
