package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LavBruger {

    @FXML
    private Label mylabel;

    @FXML
    private TextField myTextField;

    @FXML
    private Button myButton;

    String navnTextField;
    String tlfTextField;
    String emailTextField;
    int kontoNrTextField;
    int kontrolCifreTextField;
    String expirationDateTextField;
    String userNameTextField;
    String kodeTextField;

    /*
    @FXML
    protected void createUser() {

        navnTextField = myTextField.getText();
        tlfTextField = myTextField.getText();
        emailTextField = myTextField.getText();
        kontoNrTextField = Integer.parseInt(myTextField.getText());
        kontoNrTextField = Integer.parseInt(myTextField.getText());
        expirationDateTextField = myTextField.getText();
        userNameTextField = myTextField.getText();
        kodeTextField = myTextField.getText();

    }

    @Override
    public String toString() {
        return "LavBruger{" +
                "navnTextField=" + navnTextField +
                ", tlfTextField=" + tlfTextField +
                ", emailTextField=" + emailTextField +
                ", kontoNrTextField=" + kontoNrTextField +
                ", kontrolCifreTextField=" + kontrolCifreTextField +
                ", expirationDateTextField=" + expirationDateTextField +
                ", userNameTextField=" + userNameTextField +
                ", kodeTextField=" + kodeTextField +
                '}';
    }*/
}
