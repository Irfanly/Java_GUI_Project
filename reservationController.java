package com.example.hotelbookingsystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class reservationController {
    Customer customer = Customer.getInstance();
    Hotel hotel = Hotel.getInstance();
    private Stage stage;
    private Scene scene;
    @FXML
    TextField custName;
    @FXML
    TextField custEmail;
    @FXML
    TextField custNum;
    @FXML
    TextField custIC;
    @FXML
    TextField date;
    @FXML
    TextField totalDays;
    @FXML
    public void confirmButton(MouseEvent event) throws IOException {

        customer.setCustInfo(custName.getText(),custNum.getText(),custEmail.getText(),custIC.getText());
        hotel.setCheckInDate(date.getText());
        hotel.setTotDay(Integer.parseInt(totalDays.getText()));
        hotel.calcTotPrice();

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Checkout.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
}
