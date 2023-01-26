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

public class kingRoomController {
    Hotel hotel = Hotel.getInstance();
    private Stage stage;
    private Scene scene;
    @FXML
    ImageView MainView;
    @FXML
    Image kingBed = new Image(Application.class.getResourceAsStream("/Images/KingBedroom2.jpg"));
    @FXML
    Image kingBath = new Image(Application.class.getResourceAsStream("/Images/KingBathroom.jpg"));
    @FXML
    Image kingDine = new Image(Application.class.getResourceAsStream("/Images/KingDining.jpg"));
    @FXML
    Image View = new Image(Application.class.getResourceAsStream("/Images/KingView.jpg"));

    @FXML
    public void displayKingBedroom(){
        MainView.setImage(kingBed);
    }
    @FXML
    public void displayKingBathroom(){
        MainView.setImage(kingBath);
    }
    @FXML
    public void displayKingDining(){
        MainView.setImage(kingDine);
    }
    @FXML
    public void displayKingView(){
        MainView.setImage(View);
    }

    @FXML
    public void reserveButton(MouseEvent event) throws IOException{
        hotel.setBookingDetails(3);
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
