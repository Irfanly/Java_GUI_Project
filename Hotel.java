package com.example.hotelbookingsystem;

public class Hotel {
    private static final Hotel instance = new Hotel();

    private String roomName;
    private double roomPrice;
    private int totDay;
    private double totPrice;
    private String checkInDate;

    public static Hotel getInstance(){
        return instance;
    }



    public void setBookingDetails(int roomType)
    {

        switch(roomType)
        {
            case 1:
                this.roomPrice = 150;
                this.roomName = "Standard Single Room";
                break;

            case 2:
                this.roomPrice = 230;
                this.roomName = "Standard Single Room";
                break;

            case 3:
                this.roomPrice = 350;
                this.roomName = "Deluxe King Room";
                break;
        }
    }

    public void setCheckInDate(String checkInDate)
    {
        this.checkInDate = checkInDate;
    }

    public void setTotDay(int totDay)
    {
        this.totDay = totDay;
    }

    public void calcTotPrice()
    {
        totPrice = roomPrice*totDay;
    }

    public String getRoomName() {return roomName;}
    public double getRoomPrice() {return roomPrice;}
    public int getTotDay() {return totDay;}
    public double getTotPrice() {return totPrice;}
}
