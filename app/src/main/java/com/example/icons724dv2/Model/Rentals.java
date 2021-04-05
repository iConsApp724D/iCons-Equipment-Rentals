package com.example.icons724dv2.Model;

public class Rentals {
    private String Name,StudentID, Email, RoomNumber, Item1="", Item2="", Item3="", Item4="", Item5="";
    private String Item1T="", Item2T="", Item3T="", Item4T="", Item5T="";
    private String orderID="";

    public Rentals() {
    }

    public Rentals(String name, String studentID, String email, String roomNumber, String item1, String item2, String item3, String item4, String item5, String item1T, String item2T, String item3T, String item4T, String item5T, String orderID) {
        Name = name;
        StudentID = studentID;
        Email = email;
        RoomNumber = roomNumber;
        Item1 = item1;
        Item2 = item2;
        Item3 = item3;
        Item4 = item4;
        Item5 = item5;
        Item1T = item1T;
        Item2T = item2T;
        Item3T = item3T;
        Item4T = item4T;
        Item5T = item5T;
        this.orderID = orderID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        RoomNumber = roomNumber;
    }

    public String getItem1() {
        return Item1;
    }

    public void setItem1(String item1) {
        Item1 = item1;
    }

    public String getItem2() {
        return Item2;
    }

    public void setItem2(String item2) {
        Item2 = item2;
    }

    public String getItem3() {
        return Item3;
    }

    public void setItem3(String item3) {
        Item3 = item3;
    }

    public String getItem4() {
        return Item4;
    }

    public void setItem4(String item4) {
        Item4 = item4;
    }

    public String getItem5() {
        return Item5;
    }

    public void setItem5(String item5) {
        Item5 = item5;
    }

    public String getItem1T() {
        return Item1T;
    }

    public void setItem1T(String item1T) {
        Item1T = item1T;
    }

    public String getItem2T() {
        return Item2T;
    }

    public void setItem2T(String item2T) {
        Item2T = item2T;
    }

    public String getItem3T() {
        return Item3T;
    }

    public void setItem3T(String item3T) {
        Item3T = item3T;
    }

    public String getItem4T() {
        return Item4T;
    }

    public void setItem4T(String item4T) {
        Item4T = item4T;
    }

    public String getItem5T() {
        return Item5T;
    }

    public void setItem5T(String item5T) {
        Item5T = item5T;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
}
