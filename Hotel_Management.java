package com.example.javaguiproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Hotel_Management extends Application {

    protected static String custName, custNum;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Hotel_Management.class.getResource("test-scene.fxml"));
        Scene mainPage = new Scene(fxmlLoader.load(), 640, 400);
        stage.setTitle("Hello!");
        stage.setScene(mainPage);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}