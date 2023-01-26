package com.example.hotelbookingsystem;

public class Customer {
    private static final Customer instance = new Customer();

    public static Customer getInstance(){
        return instance;
    }

    private String custName, custPhone, custEmail, custIC;

    public void setCustInfo(String name, String phoneNum, String email, String ic)
    {
        this.custName = name;
        this.custPhone = phoneNum;
        this.custEmail = email;
        this.custIC = ic;
    }

    public String getCustName() {return custName;}
    public String getCustPhone() {return custPhone;}
    public String getCustEmail() {return custEmail;}
    public String getCustIC() {return custIC;}

}