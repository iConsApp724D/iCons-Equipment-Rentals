package com.example.icons724dv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StudentCablesChargersList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_cables_chargers_list);
    }

    public void shopCart(View v){
        Intent a = new Intent(this, StudentCart.class);
        startActivity(a);
    }
}