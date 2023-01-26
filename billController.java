package com.example.hotelbookingsystem;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class billController implements Initializable {
    Customer customer = Customer.getInstance();
    Hotel hotel = Hotel.getInstance();

    @FXML
    Label custName;
    @FXML
    Label custNum;
    @FXML
    Label custEmail;
    @FXML
    Label custIC;
    @FXML
    Label roomType;
    @FXML
    Label roomPrice;
    @FXML
    Label roomDuration;
    @FXML
    Label roomTotal;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    displayCustomer();
    displayRoomDetails();
    }
    @FXML
    private void displayCustomer(){
        custName.setText(customer.getCustName());
        custNum.setText(customer.getCustPhone());
        custEmail.setText(customer.getCustEmail());
        custIC.setText(customer.getCustIC());
    }

    @FXML
    private void displayRoomDetails(){
        roomType.setText(hotel.getRoomName());
        roomPrice.setText(Double.toString(hotel.getRoomPrice()));
        roomDuration.setText(Integer.toString(hotel.getTotDay()));
        roomTotal.setText(Double.toString(hotel.getTotPrice()));
    }
}
