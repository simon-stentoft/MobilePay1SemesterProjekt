package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    private Stage stage;
    private Scene scene;
    private Parent root;

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
        root = FXMLLoader.load(getClass().getResource("sendMoneyView.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchSceneToRequestMoneyScreen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("requestMoneyView.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
