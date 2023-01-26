package com.example.hotelbookingsystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class singleRoomController {
    Hotel hotel = Hotel.getInstance();
    private Stage stage;
    private Scene scene;
    @FXML
    ImageView mainView;
    @FXML
    Image singleBed = new Image(Application.class.getResourceAsStream("/Images/SingleBedroom.jpeg"));
    @FXML
    Image singleBath = new Image(Application.class.getResourceAsStream("/Images/singleBathroom.jpg"));
    @FXML
    Image singleView = new Image(Application.class.getResourceAsStream("/Images/singleView.jpg"));
    @FXML
    Image singleDine = new Image(Application.class.getResourceAsStream("/Images/HotelCoffeTable.jpg"));

    @FXML
    public void displaySingleBedroom(){
        mainView.setImage(singleBed);
    }
    @FXML
    public void displaySingleBathroom(){
        mainView.setImage(singleBath);
    }
    @FXML
    public void displaySingleDining(){
        mainView.setImage(singleDine);
    }
    @FXML
    public void displaySingleView(){
        mainView.setImage(singleView);
    }
    @FXML
    public void reserveButton(MouseEvent event) throws IOException{
        hotel.setBookingDetails(1);
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Reservation.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void returnButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Rooms.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }


}
