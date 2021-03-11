package com.example.icons724dv2;

public class Equipment {

    public String name;
    public int stock;

    public Equipment (String a, int b){
        name=a;
        stock=b;
    }

    public void rented(){
        stock=stock-1;
    }

    public void returned(){
        stock=stock+1;
    }
}






