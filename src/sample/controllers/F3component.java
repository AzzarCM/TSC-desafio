package sample.controllers;

import javafx.animation.PathTransition;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class F3component implements Initializable {
    public void backTo(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent screenParent = FXMLLoader.load(getClass().getResource("/sample/views/f2component.fxml"));
        Scene tableViewScene = new Scene(screenParent);

        //obtenemos la informacion de estado
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    public void goForward(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent screenParent = FXMLLoader.load(getClass().getResource("/sample/views/qcomponent.fxml"));
        Scene tableViewScene = new Scene(screenParent);

        //obtenemos la informacion de estado
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }
    public ImageView imagev;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Path path = new Path();
        path.getElements().add(new MoveTo());
        path.getElements().add(new LineTo(375 , 100));

        PathTransition pathTransition2 = new PathTransition();
        pathTransition2.setNode(imagev);
        pathTransition2.setDuration(Duration.seconds(3));
        pathTransition2.setPath(path);
        //pathTransition2.setCycleCount(PathTransition.INDEFINITE);
        pathTransition2.play();
    }
}
