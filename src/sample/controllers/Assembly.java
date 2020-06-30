package sample.controllers;

import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import javax.net.ssl.HandshakeCompletedEvent;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Assembly implements Initializable, EventHandler<KeyEvent> {

    public Circle circle2;
    public Label textM;
    public Line line1;
    public Line line2;
    public Label title;
    public Line line3;
    public Line line4;
    public Button home;

    public void displayPosition(MouseEvent event){
        textM.setText("X: = " + event.getX() + "Y: = " + event.getY());
    }


    @FXML
    public Circle circle1;
    public Circle circle3;
    public Circle circle4;
    public Circle circle5;
    public Circle circle6;
    public Circle circle7;
    public Circle circle8;
    public Circle circle9;
    public Circle circle10;
    public Circle circle11;
    public Circle circle12;

    public Circle circle13,circle14,circle15,circle16,circle17,circle18,
    circle19,circle20,circle21,circle22,circle23,circle24,circle25,circle26,circle27,circle28,circle29,circle30,circle31,circle32,circle33
            ,circle34,circle35,circle36,circle37,circle38,circle39,circle40,circle41,circle42,circle43,circle44,circle45;

    public void goHome(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent screenParent = FXMLLoader.load(getClass().getResource("/sample/views/sample.fxml"));
        Scene tableViewScene = new Scene(screenParent);

        //obtenemos la informacion de estado
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        home.setVisible(false);
        Path path1 = new Path();
        path1.getElements().add(new MoveTo());
        path1.getElements().add(new LineTo(683.0-circle1.getLayoutX(),568.0-circle1.getLayoutY()));
        PathTransition transition1 = new PathTransition();
        transition1.setNode(circle1);
        transition1.setDuration(Duration.seconds(6));
        transition1.setPath(path1);
        transition1.play();
        transition1.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("x: " + circle1.getCenterX()+ "y: " + circle1.getLayoutY());
            }
        });

        PathTransition transition2 = new PathTransition();
        Path path2 = new Path();
        path2.getElements().add(new MoveTo());
        path2.getElements().add(new LineTo(247 -circle2.getLayoutX(),484 -circle2.getLayoutY()));
        transition2.setNode(circle2);
        transition2.setDuration(Duration.seconds(6));
        transition2.setPath(path2);
        transition2.play();

        PathTransition transition3 = new PathTransition();
        Path path3 = new Path();
        path3.getElements().add(new MoveTo());
        path3.getElements().add(new LineTo(626 - circle3.getLayoutX(),568 - circle3.getLayoutY()));
        transition3.setNode(circle3);
        transition3.setDuration(Duration.seconds(6));
        transition3.setPath(path3);
        transition3.play();

        PathTransition transition4 = new PathTransition();
        Path path4 = new Path();
        path4.getElements().add(new MoveTo());
        path4.getElements().add(new LineTo(626 - circle4.getLayoutX(),484 - circle4.getLayoutY()));
        transition4.setNode(circle4);
        transition4.setDuration(Duration.seconds(6));
        transition4.setPath(path4);
        transition4.play();

        PathTransition transition5 = new PathTransition();
        Path path5 = new Path();
        path5.getElements().add(new MoveTo());
        path5.getElements().add(new LineTo(683 - circle5.getLayoutX(),484 - circle5.getLayoutY()));
        transition5.setNode(circle5);
        transition5.setDuration(Duration.seconds(6));
        transition5.setPath(path5);
        transition5.play();


        PathTransition transition6 = new PathTransition();
        Path path6 = new Path();
        path6.getElements().add(new MoveTo());
        path6.getElements().add(new LineTo(140 - circle6.getLayoutX(),459 - circle6.getLayoutY()));
        transition6.setNode(circle6);
        transition6.setDuration(Duration.seconds(6));
        transition6.setPath(path6);
        transition6.play();

        PathTransition transition7 = new PathTransition();
        Path path7 = new Path();
        path7.getElements().add(new MoveTo());
        path7.getElements().add(new LineTo(626 - circle7.getLayoutX(),425 - circle7.getLayoutY()));
        transition7.setNode(circle7);
        transition7.setDuration(Duration.seconds(6));
        transition7.setPath(path7);
        transition7.play();

        PathTransition transition8 = new PathTransition();
        Path path8 = new Path();
        path8.getElements().add(new MoveTo());
        path8.getElements().add(new LineTo(626 - circle8.getLayoutX(),345 - circle8.getLayoutY()));
        transition8.setNode(circle8);
        transition8.setDuration(Duration.seconds(6));
        transition8.setPath(path8);
        transition8.play();

        PathTransition transition9 = new PathTransition();
        Path path9 = new Path();
        path9.getElements().add(new MoveTo());
        path9.getElements().add(new LineTo(247 - circle9.getLayoutX(),425 - circle9.getLayoutY()));
        transition9.setNode(circle9);
        transition9.setDuration(Duration.seconds(6));
        transition9.setPath(path9);
        transition9.play();

        PathTransition transition10 = new PathTransition();
        Path path10 = new Path();
        path10.getElements().add(new MoveTo());
        path10.getElements().add(new LineTo(306 - circle10.getLayoutX(),484 - circle10.getLayoutY()));
        transition10.setNode(circle10);
        transition10.setDuration(Duration.seconds(6));
        transition10.setPath(path10);
        transition10.play();

        PathTransition transition11 = new PathTransition();
        Path path11 = new Path();
        path11.getElements().add(new MoveTo());
        path11.getElements().add(new LineTo(306 - circle11.getLayoutX(),425 - circle11.getLayoutY()));
        transition11.setNode(circle11);
        transition11.setDuration(Duration.seconds(6));
        transition11.setPath(path11);
        transition11.play();

        PathTransition transition12 = new PathTransition();
        Path path12 = new Path();
        path12.getElements().add(new MoveTo());
        path12.getElements().add(new LineTo(411 - circle12.getLayoutX(),484 - circle12.getLayoutY()));
        transition12.setNode(circle12);
        transition12.setDuration(Duration.seconds(6));
        transition12.setPath(path12);
        transition12.play();

        PathTransition transition13 = new PathTransition();
        Path path13 = new Path();
        path13.getElements().add(new MoveTo());
        path13.getElements().add(new LineTo(469- circle13.getLayoutX(),484- circle13.getLayoutY()));
        transition13.setNode(circle13);
        transition13.setDuration(Duration.seconds(6));
        transition13.setPath(path13);
        transition13.play();

        PathTransition transition14 = new PathTransition();
        Path path14 = new Path();
        path14.getElements().add(new MoveTo());
        path14.getElements().add(new LineTo(469- circle14.getLayoutX(),425- circle14.getLayoutY()));
        transition14.setNode(circle14);
        transition14.setDuration(Duration.seconds(6));
        transition14.setPath(path14);
        transition14.play();

        PathTransition transition15 = new PathTransition();
        Path path15 = new Path();
        path15.getElements().add(new MoveTo());
        path15.getElements().add(new LineTo(411- circle15.getLayoutX(),425- circle15.getLayoutY()));
        transition15.setNode(circle15);
        transition15.setDuration(Duration.seconds(6));
        transition15.setPath(path15);
        transition15.play();

        PathTransition transition16 = new PathTransition();
        Path path16 = new Path();
        path16.getElements().add(new MoveTo());
        path16.getElements().add(new LineTo(525- circle16.getLayoutX(),425- circle16.getLayoutY()));
        transition16.setNode(circle16);
        transition16.setDuration(Duration.seconds(6));
        transition16.setPath(path16);
        transition16.play();

        PathTransition transition17 = new PathTransition();
        Path path17 = new Path();
        path17.getElements().add(new MoveTo());
        path17.getElements().add(new LineTo(525- circle17.getLayoutX(),484- circle17.getLayoutY()));
        transition17.setNode(circle17);
        transition17.setDuration(Duration.seconds(6));
        transition17.setPath(path17);
        transition17.play();

        PathTransition transition18 = new PathTransition();
        Path path18 = new Path();
        path18.getElements().add(new MoveTo());
        path18.getElements().add(new LineTo(683- circle18.getLayoutX(),345- circle18.getLayoutY()));
        transition18.setNode(circle18);
        transition18.setDuration(Duration.seconds(6));
        transition18.setPath(path18);
        transition18.play();

        PathTransition transition19 = new PathTransition();
        Path path19 = new Path();
        path19.getElements().add(new MoveTo());
        path19.getElements().add(new LineTo(140- circle19.getLayoutX(),345- circle19.getLayoutY()));
        transition19.setNode(circle19);
        transition19.setDuration(Duration.seconds(6));
        transition19.setPath(path19);
        transition19.play();

        PathTransition transition20 = new PathTransition();
        Path path20 = new Path();
        path20.getElements().add(new MoveTo());
        path20.getElements().add(new LineTo(247- circle20.getLayoutX(),345- circle20.getLayoutY()));
        transition20.setNode(circle20);
        transition20.setDuration(Duration.seconds(6));
        transition20.setPath(path20);
        transition20.play();

        PathTransition transition21 = new PathTransition();
        Path path21 = new Path();
        path21.getElements().add(new MoveTo());
        path21.getElements().add(new LineTo(247- circle21.getLayoutX(),264- circle21.getLayoutY()));
        transition21.setNode(circle21);
        transition21.setDuration(Duration.seconds(6));
        transition21.setPath(path21);
        transition21.play();

        PathTransition transition22 = new PathTransition();
        Path path22 = new Path();
        path22.getElements().add(new MoveTo());
        path22.getElements().add(new LineTo(306- circle22.getLayoutX(),264- circle22.getLayoutY()));
        transition22.setNode(circle22);
        transition22.setDuration(Duration.seconds(6));
        transition22.setPath(path22);
        transition22.play();

        PathTransition transition23 = new PathTransition();
        Path path23 = new Path();
        path23.getElements().add(new MoveTo());
        path23.getElements().add(new LineTo(247- circle23.getLayoutX(),204- circle23.getLayoutY()));
        transition23.setNode(circle23);
        transition23.setDuration(Duration.seconds(6));
        transition23.setPath(path23);
        transition23.play();

        PathTransition transition24 = new PathTransition();
        Path path24 = new Path();
        path24.getElements().add(new MoveTo());
        path24.getElements().add(new LineTo(411- circle24.getLayoutX(),345- circle24.getLayoutY()));
        transition24.setNode(circle24);
        transition24.setDuration(Duration.seconds(6));
        transition24.setPath(path24);
        transition24.play();

        PathTransition transition25 = new PathTransition();
        Path path25 = new Path();
        path25.getElements().add(new MoveTo());
        path25.getElements().add(new LineTo(469- circle25.getLayoutX(),345- circle25.getLayoutY()));
        transition25.setNode(circle25);
        transition25.setDuration(Duration.seconds(6));
        transition25.setPath(path25);
        transition25.play();

        PathTransition transition26 = new PathTransition();
        Path path26 = new Path();
        path26.getElements().add(new MoveTo());
        path26.getElements().add(new LineTo(436- circle26.getLayoutX(),259- circle26.getLayoutY()));
        transition26.setNode(circle26);
        transition26.setDuration(Duration.seconds(6));
        transition26.setPath(path26);
        transition26.play();

        PathTransition transition27 = new PathTransition();
        Path path27 = new Path();
        path27.getElements().add(new MoveTo());
        path27.getElements().add(new LineTo(272- circle27.getLayoutX(),575- circle27.getLayoutY()));
        transition27.setNode(circle27);
        transition27.setDuration(Duration.seconds(6));
        transition27.setPath(path27);
        transition27.play();

        PathTransition transition28 = new PathTransition();
        Path path28 = new Path();
        path28.getElements().add(new MoveTo());
        path28.getElements().add(new LineTo(626- circle28.getLayoutX(),254- circle28.getLayoutY()));
        transition28.setNode(circle28);
        transition28.setDuration(Duration.seconds(6));
        transition28.setPath(path28);
        transition28.play();

        PathTransition transition29 = new PathTransition();
        Path path29 = new Path();
        path29.getElements().add(new MoveTo());
        path29.getElements().add(new LineTo(140- circle29.getLayoutX(),204- circle29.getLayoutY()));
        transition29.setNode(circle29);
        transition29.setDuration(Duration.seconds(6));
        transition29.setPath(path29);
        transition29.play();

        transition29.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                PathTransition transitionL = new PathTransition();
                Path pathLine1 = new Path();
                pathLine1.getElements().add(new MoveTo());
                pathLine1.getElements().add(new LineTo(105, 20));
                transitionL.setDuration(Duration.seconds(2));
                transitionL.setNode(line1);
                transitionL.setPath(pathLine1);
                transitionL.play();

                PathTransition transitionL2 = new PathTransition();
                Path pathLine2 = new Path();
                pathLine2.getElements().add(new MoveTo());
                pathLine2.getElements().add(new LineTo(690, 20));
                transitionL2.setDuration(Duration.seconds(2));
                transitionL2.setNode(line2);
                transitionL2.setPath(pathLine2);
                transitionL2.play();
                transitionL2.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        title.setText("ENSAMBLAJE DE K GLOBAL COMPLETADO!");

                        PathTransition transition30 = new PathTransition();
                        Path path30 = new Path();
                        path30.getElements().add(new MoveTo());
                        path30.getElements().add(new LineTo(902- circle30.getLayoutX(),204- circle30.getLayoutY()));
                        transition30.setNode(circle30);
                        transition30.setDuration(Duration.seconds(6));
                        transition30.setPath(path30);
                        transition30.play();

                        PathTransition transition31 = new PathTransition();
                        Path path31 = new Path();
                        path31.getElements().add(new MoveTo());
                        path31.getElements().add(new LineTo(958 - circle31.getLayoutX(),204- circle31.getLayoutY()));
                        transition31.setNode(circle31);
                        transition31.setDuration(Duration.seconds(6));
                        transition31.setPath(path31);
                        transition31.play();

                        PathTransition transition44 = new PathTransition();
                        Path path44 = new Path();
                        path44.getElements().add(new MoveTo());
                        path44.getElements().add(new LineTo(958 - circle44.getLayoutX(),259- circle44.getLayoutY()));
                        transition44.setNode(circle44);
                        transition44.setDuration(Duration.seconds(6));
                        transition44.setPath(path44);
                        transition44.play();

                        PathTransition transition33 = new PathTransition();
                        Path path33 = new Path();
                        path33.getElements().add(new MoveTo());
                        path33.getElements().add(new LineTo(902 - circle33.getLayoutX(),345- circle33.getLayoutY()));
                        transition33.setNode(circle33);
                        transition33.setDuration(Duration.seconds(6));
                        transition33.setPath(path33);
                        transition33.play();

                        PathTransition transition32 = new PathTransition();
                        Path path32 = new Path();
                        path32.getElements().add(new MoveTo());
                        path32.getElements().add(new LineTo(958- circle32.getLayoutX(),345- circle32.getLayoutY()));
                        transition32.setNode(circle32);
                        transition32.setDuration(Duration.seconds(6));
                        transition32.setPath(path32);
                        transition32.play();

                        PathTransition transition34 = new PathTransition();
                        Path path34 = new Path();
                        path34.getElements().add(new MoveTo());
                        path34.getElements().add(new LineTo(902- circle34.getLayoutX(),400- circle34.getLayoutY()));
                        transition34.setNode(circle34);
                        transition34.setDuration(Duration.seconds(6));
                        transition34.setPath(path34);
                        transition34.play();

                        PathTransition transition39 = new PathTransition();
                        Path path39 = new Path();
                        path39.getElements().add(new MoveTo());
                        path39.getElements().add(new LineTo(902 - circle39.getLayoutX(),484 - circle39.getLayoutY()));
                        transition39.setNode(circle39);
                        transition39.setDuration(Duration.seconds(6));
                        transition39.setPath(path39);
                        transition39.play();

                        PathTransition transition37 = new PathTransition();
                        Path path37 = new Path();
                        path37.getElements().add(new MoveTo());
                        path37.getElements().add(new LineTo(958 - circle37.getLayoutX(),484- circle37.getLayoutY()));
                        transition37.setNode(circle37);
                        transition37.setDuration(Duration.seconds(6));
                        transition37.setPath(path37);
                        transition37.play();

                        PathTransition transition38 = new PathTransition();
                        Path path38 = new Path();
                        path38.getElements().add(new MoveTo());
                        path38.getElements().add(new LineTo(902- circle38.getLayoutX(),543 - circle38.getLayoutY()));
                        transition38.setNode(circle38);
                        transition38.setDuration(Duration.seconds(6));
                        transition38.setPath(path38);
                        transition38.play();

                        PathTransition transition36 = new PathTransition();
                        Path path36 = new Path();
                        path36.getElements().add(new MoveTo());
                        path36.getElements().add(new LineTo(902- circle36.getLayoutX(),638- circle36.getLayoutY()));
                        transition36.setNode(circle36);
                        transition36.setDuration(Duration.seconds(6));
                        transition36.setPath(path36);
                        transition36.play();

                        PathTransition transition35 = new PathTransition();
                        Path path35 = new Path();
                        path35.getElements().add(new MoveTo());
                        path35.getElements().add(new LineTo(958 - circle35.getLayoutX(),638 - circle35.getLayoutY()));
                        transition35.setNode(circle35);
                        transition35.setDuration(Duration.seconds(6));
                        transition35.setPath(path35);
                        transition35.play();

                        transition35.setOnFinished(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {

                                PathTransition transition3 = new PathTransition();
                                Path pathLine3 = new Path();
                                pathLine3.getElements().add(new MoveTo());
                                pathLine3.getElements().add(new LineTo(840, 20));
                                transition3.setDuration(Duration.seconds(2));
                                transition3.setNode(line3);
                                transition3.setPath(pathLine3);
                                transition3.play();

                                PathTransition transitionL4 = new PathTransition();
                                Path pathLine4 = new Path();
                                pathLine4.getElements().add(new MoveTo());
                                pathLine4.getElements().add(new LineTo(955, 20));
                                transitionL4.setDuration(Duration.seconds(2));
                                transitionL4.setNode(line4);
                                transitionL4.setPath(pathLine4);
                                transitionL4.play();


                                transitionL4.setOnFinished(new EventHandler<ActionEvent>() {
                                    @Override
                                    public void handle(ActionEvent actionEvent) {
                                        title.setText("ENSAMBLAJE DE B COMPLETADO!");
                                        PathTransition transition40 = new PathTransition();
                                        Path path40 = new Path();
                                        path40.getElements().add(new MoveTo());
                                        path40.getElements().add(new LineTo(791 - circle40.getLayoutX(),229 - circle40.getLayoutY()));
                                        transition40.setNode(circle40);
                                        transition40.setDuration(Duration.seconds(6));
                                        transition40.setPath(path40);
                                        transition40.play();

                                        PathTransition transition41 = new PathTransition();
                                        Path path41 = new Path();
                                        path41.getElements().add(new MoveTo());
                                        path41.getElements().add(new LineTo(791 - circle41.getLayoutX(),327 - circle41.getLayoutY()));
                                        transition41.setNode(circle41);
                                        transition41.setDuration(Duration.seconds(6));
                                        transition41.setPath(path41);
                                        transition41.play();

                                        PathTransition transition42 = new PathTransition();
                                        Path path42 = new Path();
                                        path42.getElements().add(new MoveTo());
                                        path42.getElements().add(new LineTo(791 - circle42.getLayoutX(),425 - circle42.getLayoutY()));
                                        transition42.setNode(circle42);
                                        transition42.setDuration(Duration.seconds(6));
                                        transition42.setPath(path42);
                                        transition42.play();

                                        PathTransition transition43 = new PathTransition();
                                        Path path43 = new Path();
                                        path43.getElements().add(new MoveTo());
                                        path43.getElements().add(new LineTo(791 - circle43.getLayoutX(),518 - circle43.getLayoutY()));
                                        transition43.setNode(circle43);
                                        transition43.setDuration(Duration.seconds(6));
                                        transition43.setPath(path43);
                                        transition43.play();
                                        transition43.setOnFinished(new EventHandler<ActionEvent>() {
                                            @Override
                                            public void handle(ActionEvent actionEvent) {
                                                title.setText("EXITO, ENSAMBLAJE COMPLETADO :D");
                                                home.setVisible(true);
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });




        /*
        transition1.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                transition2.play();
            }
        });
        */
    }


    @Override
    public void handle(KeyEvent keyEvent) {

    }


}
