package com.example.icons724dv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
        StringClass.firstID=studid.getText().toString();

        if(TextUtils.isEmpty(StringClass.name1)){
            Toast.makeText(this,"Please enter your name", Toast.LENGTH_SHORT).show();
        }
        if(TextUtils.isEmpty(StringClass.studID)){
            Toast.makeText(this,"Please enter your student ID", Toast.LENGTH_SHORT).show();
        }
        if(TextUtils.isEmpty(StringClass.email)){
            Toast.makeText(this,"Please enter your email", Toast.LENGTH_SHORT).show();
        }
        if (!TextUtils.isEmpty(StringClass.email) && !TextUtils.isEmpty(StringClass.studID) && !TextUtils.isEmpty(StringClass.name1)){
            if (!StringClass.email.contains("@queensu.ca")){
                Toast.makeText(this,"Please enter a valid Queen's email", Toast.LENGTH_SHORT).show();
            }
            else{
                Intent a = new Intent(this, StudentHomeScreen.class);
                startActivity(a);
                finish();
            }
        }




    }


}