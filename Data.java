package com.example.javaguiproject;

public class Data {

    private static final Data instance = new Data();

    //Store cust booking info
    private String custName, custPhone;

    //Store Customer room details
    private int roomType;
    private String roomName;
    private double roomPrice;
    private int totDay;


    private Data(){}

    public static Data getInstance()
    {return instance;}

    public void setCustInfo(String name, String phoneNum)
    {
        custName = name;
        custPhone = phoneNum;
    }

    public void setRoomType(int roomType)
    {this.roomType = roomType; }

    public void setBookingDetails(int roomType, int days)
    {
        this.totDay = days;

        switch(roomType)
        {
            case 1:
                this.roomPrice = 1200;
                this.roomName = "Deluxe Single Room";
                break;

            case 2:
                this.roomPrice = 2200;
                this.roomName = "Luxury Single Room";
                break;

            case 3:
                this.roomPrice = 3000;
                this.roomName = "Deluxe Double Room";
                break;

            case 4:
                this.roomPrice = 4000;
                this.roomName = "Luxury Double Room";
                break;
        }
    }

    public String getCustName() {return custName;}

    public String getCustPhone() {return custPhone;}

    public int getRoomType() {return roomType;}
}
