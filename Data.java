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
    private double totPrice;
    private String[] services = new String[5];

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

    public void setServices(int option)
    {
        switch (option)
        {
            case 1:
                stringArrayloop(services, "String");
                break;

            case 2:
                stringArrayloop(services, "String");
                break;

            case 3:
                stringArrayloop(services, "String");
                break;

            case 4:
                stringArrayloop(services, "String");
                break;

            case 5:
                stringArrayloop(services, "String");
                break;
        }
    }

    public void calcTotPrice()
    {
        totPrice = roomPrice*totDay;
    }

    void stringArrayloop(String [] arrString, String value) {
        for (int i = 0; i < arrString.length; i++) {
            if (arrString[i] == null) {
                arrString[i] = value;
                break;
            }
        }
    }

    public String getCustName() {return custName;}

    public String getCustPhone() {return custPhone;}

    public int getRoomType() {return roomType;}

    public String getRoomName() {return roomName;}

    public double getRoomPrice() {return roomPrice;}

    public int getTotDay() {return totDay;}

    public double getTotPrice() {return totPrice;}
}
