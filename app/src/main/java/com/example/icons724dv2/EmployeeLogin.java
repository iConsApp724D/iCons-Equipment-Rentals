package com.example.icons724dv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EmployeeLogin extends AppCompatActivity {
    EditText user, pass;
    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_login);
        user=(EditText) findViewById(R.id.enterLoginEmail);
        pass=(EditText) findViewById(R.id.employeePass);
    }

    public void employeeHome(View v){
        username=user.getText().toString();
        password=pass.getText().toString();
        if(password.equals("admin")){
            Intent a = new Intent(this, EmployeeHomeScreen.class);
            startActivity(a);
        }
    }
}