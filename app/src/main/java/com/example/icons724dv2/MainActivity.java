package com.example.icons724dv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void studentLogin(View v) {
        //launch a new activity
        Intent a = new Intent(this, StudentLogin.class);
        startActivity(a);
    }

    public void employeeLogin(View v) {
        Intent b = new Intent(this, EmployeeLogin.class);
        startActivity(b);
    }

    public void aboutIcons(View v) {
        Intent c = new Intent(this, AboutIcons.class);
        startActivity(c);
    }
}