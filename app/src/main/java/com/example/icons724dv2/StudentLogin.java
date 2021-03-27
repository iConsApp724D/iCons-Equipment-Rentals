package com.example.icons724dv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class StudentLogin extends AppCompatActivity {
    EditText studname, studid, studemail ;
    String name, studentID, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);
        studname = (EditText) findViewById(R.id.enterName);
        studid = (EditText) findViewById(R.id.enterStudentNum);
        studemail = (EditText) findViewById(R.id.enterEmail);
    }

    public void studentHome(View v){
        StringClass.name1=studname.getText().toString();
        StringClass.studID=studid.getText().toString();
        StringClass.email=studemail.getText().toString();
        Intent a = new Intent(this, StudentHomeScreen.class);
        startActivity(a);
        finish();


    }


}