package com.example.demo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

public class SubmitBtnHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Alert!");
        alert.setContentText("Submit Button clicked");
        alert.show();
    }
}
