package sample.controllers;

import javafx.animation.PathTransition;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Mesh implements Initializable {
    public void backTo(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent screenParent = FXMLLoader.load(getClass().getResource("/sample/views/conditions.fxml"));
        Scene tableViewScene = new Scene(screenParent);

        //obtenemos la informacion de estado
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }
    public void goForward(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent screenParent = FXMLLoader.load(getClass().getResource("/sample/views/table.fxml"));
        Scene tableViewScene = new Scene(screenParent);

        //obtenemos la informacion de estado
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }
    public void goHome(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent screenParent = FXMLLoader.load(getClass().getResource("/sample/views/sample.fxml"));
        Scene tableViewScene = new Scene(screenParent);

        //obtenemos la informacion de estado
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }
    public ImageView imagev;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imagev.setLayoutX(500); imagev.setLayoutY(380);
        Rectangle circle = new Rectangle(40,20);
        PathTransition pathTransition = new PathTransition();
        pathTransition.setNode(imagev);
        pathTransition.setDuration(Duration.seconds(3));
        pathTransition.setPath(circle);
        pathTransition.setCycleCount(PathTransition.INDEFINITE);
        pathTransition.play();
    }
}
