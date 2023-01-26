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

public class queenRoomController {
    Hotel hotel = Hotel.getInstance();
    private Stage stage;
    private Scene scene;

    @FXML
    ImageView mainView;
    @FXML
    Image queenBed = new Image(Application.class.getResourceAsStream("/Images/DoubleBedroom.jpg"));
    @FXML
    Image queenBath = new Image(Application.class.getResourceAsStream("/Images/queenBathroom.jpg"));
    @FXML
    Image queenDine = new Image(Application.class.getResourceAsStream("/Images/queenDining.jpg"));
    @FXML
    Image queenView = new Image(Application.class.getResourceAsStream("/Images/queenView.jpg"));

    @FXML
    public void displayQueenBedroom(){
        mainView.setImage(queenBed);
    }
    @FXML
    public void displayQueenBathroom(){
        mainView.setImage(queenBath);
    }
    @FXML
    public void displayQueenDining(){
        mainView.setImage(queenDine);
    }
    @FXML
    public void displayQueenView(){
        mainView.setImage(queenView);
    }
    @FXML
    public void reserveButton(MouseEvent event) throws IOException{
        hotel.setBookingDetails(2);
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
