package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        rectangleDemo(stage);
    }

    public static void main(String[] args) {
        launch();
    }

    public static void flowPane(Stage stage) {
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setHgap(5);
        pane.setVgap(5);

        pane.getChildren().add(new Label("First Name:"));
        pane.getChildren().add(new TextField());
        pane.getChildren().add(new Label("MI:"));
        TextField miTf = new TextField();
        miTf.setPrefColumnCount(1);
        pane.getChildren().add(miTf);
        pane.getChildren().add(new Label("Last Name:"));
        pane.getChildren().add(new TextField());

        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("Flow Pane Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void gridPane(Stage stage) {

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5);

        gridPane.add(new Label("First Name"),0,0);
        gridPane.add(new TextField(), 1, 0);
        gridPane.add(new Label("MI:"), 0, 1);
        gridPane.add(new TextField(), 1, 1);
        gridPane.add(new Label("Last Name:"), 0, 2);
        gridPane.add(new TextField(), 1, 2);

        Scene scene = new Scene(gridPane, 320, 240);
        stage.setTitle("Grid Pane Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void rectangleDemo(Stage stage) {

        Rectangle rectangle = new Rectangle(25, 10, Color.BLACK);
        rectangle.setStroke(Color.RED);

        FlowPane pane = new FlowPane();

        pane.getChildren().add(rectangle);

        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("Flow Pane Demo");
        stage.setScene(scene);
        stage.show();

    }
}