package com.example.demo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class SubmitBtnHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {
        System.out.println("Btn clicked");
    }
}
