package com.example.javaguiproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.io.IOException;

public class Controller {

    private Stage stage;
    private Parent root;
    private Scene scene;

    Data data = Data.getInstance();

    @FXML
    private Label welcomeText;

    @FXML
    private TextField nameField, numField;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Label labelSatu;

    @FXML
    protected void displayMessage()
    {
        if(Hotel_Management.custName == null)
            {labelSatu.setText("Cat Susah Anjing");}
        else
            labelSatu.setText(data.getCustName());
    };

    @FXML
    protected void roomDetails(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Hotel_Management.class.getResource("room-details.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void bookRoom(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Hotel_Management.class.getResource("book-hotel-page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void hilang(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Hotel_Management.class.getResource("room-details.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void displayMain(ActionEvent event) throws IOException{
        root = FXMLLoader.load(Hotel_Management.class.getResource("test-scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void saveCustData (ActionEvent event) throws IOException{
        Hotel_Management.custName = nameField.getText();
        Hotel_Management.custNum = numField.getText();

        data.setCustInfo(nameField.getText(), numField.getText());

        root = FXMLLoader.load(Hotel_Management.class.getResource("test-scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}