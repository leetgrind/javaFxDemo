package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setHgap(5);
        pane.setVgap(5);

        pane.getChildren().add(new Label("First Name:"));
        pane.getChildren().add(new TextField());
        pane.getChildren().add(new Label("MI:"));
        pane.getChildren().add(new TextField());
        pane.getChildren().add(new Label("Last Name:"));
        pane.getChildren().add(new TextField());




        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("Flow Pane Demo");
        stage.setScene(scene);


        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        //stage.setTitle("Hello!");
        //stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}