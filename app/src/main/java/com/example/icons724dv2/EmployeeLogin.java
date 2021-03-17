package com.example.icons724dv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EmployeeLogin extends AppCompatActivity {
    EditText user, pass;
    String username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_login);
        user=(EditText) findViewById(R.id.enterUsername);
        pass=(EditText) findViewById(R.id.employeePass);
    }

    public void employeeHome(View v){
        login();
    }

    private void login() {
        username=user.getText().toString();
        password=pass.getText().toString();

        if (TextUtils.isEmpty(username)){
            Toast.makeText(this,"Please enter your username", Toast.LENGTH_SHORT).show();
        }

        else if (TextUtils.isEmpty(password)){
            Toast.makeText(this,"Please enter your password", Toast.LENGTH_SHORT).show();
        }

        else{
            if (username.equals("admin") && password.equals("admin"))
            {
                Intent a = new Intent(this, EmployeeHomeScreen.class);
                startActivity(a);
            }
    }



    }
}
