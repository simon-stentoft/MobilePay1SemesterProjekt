package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

public class Controller {

    private Stage stage;
    private Scene scene;
    private Parent root;
    private Connection connection;
    private Statement stmt;

    public TextField navnTextField;
    public TextField tlfTextField;
    public TextField emailTextField;
    public TextField kontoNrTextField;
    public TextField kontrolCifreTextField;
    public TextField expirationDateTextField;
    public TextField usernameTextField;
    public TextField kodeTextField;
    public TextField brugernavnTextField;
    public PasswordField kodePasswordField;


    public void switchSceneToCreateUser(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("createUserView.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchSceneToLogIn(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("LogInView.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchSceneToStartScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("startScreenView.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchSceneToSendMoneyScreen(ActionEvent event) throws IOException {

        //Boolean registreret = false;
        //String loginUsername = brugernavnTextField.getText();
       //String loginPassword = kodePasswordField.getText();


        //registreret = Database.login(loginUsername,loginPassword);

       //if (registreret){
        root = FXMLLoader.load(getClass().getResource("sendMoneyView.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       // }
        //
        //System.out.println(brugernavn+" "+password);
    }



    public void switchSceneToRequestMoneyScreen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("requestMoneyView.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //CreateUser to Create User
    public void createUser2(ActionEvent event) {
        // kan ikke skrive bogstaver n??r skaber bruger!!!
        String testname = navnTextField.getText();
        int phone1 = Integer.parseInt(tlfTextField.getText());
        String email1 = emailTextField.getText();
        int kontonr1 = Integer.parseInt(kontoNrTextField.getText());
        int kontrolcifre1 = Integer.parseInt(kontrolCifreTextField.getText());
        String expirationdate1 = expirationDateTextField.getText();
        String username1 = usernameTextField.getText();
        String password1 = kodeTextField.getText();

        System.out.println(testname + ", " + phone1 + ", " + email1 + ", " + kontonr1 + ", " + kontrolcifre1 + ", " + expirationdate1 + ", " + username1 + ", " + password1);
        //LavBruger.class(navn,telefon,email1,kontonr1,kontrolcifre1,expirationdate1,username1,password1);
        Database bruger = new Database();
        //bruger.addNewUser(testname, phone1, email1, kontonr1, kontrolcifre1, expirationdate1, username1, password1);

    }

    public void createUser(ActionEvent event){
        Database bruger = new Database();
        bruger.addNewUser(event,navnTextField.getText(),Integer.parseInt(tlfTextField.getText()),emailTextField.getText(),kontoNrTextField.getText(),
                kontrolCifreTextField.getText(), expirationDateTextField.getText(), usernameTextField.getText(),kodeTextField.getText());

    }

    @Override
    public String toString()  {
        return "LavBruger{" +
                "navnTextField=" + navnTextField +
                ", tlfTextField=" + tlfTextField +
                ", emailTextField=" + emailTextField +
                ", kontoNrTextField=" + kontoNrTextField +
                ", kontrolCifreTextField=" + kontrolCifreTextField +
                ", expirationDateTextField=" + expirationDateTextField +
                ", userNameTextField=" + usernameTextField +
                ", kodeTextField=" + kodeTextField +
                '}';
    }

    public void switchSceneFromloginToSendMoneyScreen(ActionEvent event) throws IOException {

        Boolean registreret = false;
        String loginUsername = brugernavnTextField.getText();
        String loginPassword = kodePasswordField.getText();
        Database db = new Database();

        db.login(event, loginUsername,loginPassword);



        //db.login(loginUsername,loginPassword);
        /*if (registreret){
          root = FXMLLoader.load(getClass().getResource("sendMoneyView.fxml"));
         stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }*/
        //
        //System.out.println(brugernavn+" "+password);
    }
}