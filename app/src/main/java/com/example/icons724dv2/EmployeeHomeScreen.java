package com.example.icons724dv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EmployeeHomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_home_screen);
    }

    public void stock(View v){
        Intent a=new Intent(this,EmployeeStockList.class);
        startActivity(a);
    }

    public void rentals(View v){
        Intent b=new Intent(this, EmployeeRentals.class);
        startActivity(b);
    }

    public void requests(View v){
        Intent c=new Intent(this, EmployeeRequests.class);
        startActivity(c);
    }
}