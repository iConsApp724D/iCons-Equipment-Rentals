package com.example.icons724dv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.net.Inet4Address;

public class StudentHomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_home_screen);
    }

    public void meetIcons(View v){
        Intent a=new Intent(this,StudentMeetIcons.class);
        startActivity(a);
    }

    public void generalInfo(View v){
        Intent b=new Intent(this, GeneralInfo.class);
        startActivity(b);
    }

    public void equipList(View v){
        Intent c=new Intent(this, StudentListSeclection.class);
        startActivity(c);
    }
}