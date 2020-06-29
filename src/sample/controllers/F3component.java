package sample.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class F3component {
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
}
