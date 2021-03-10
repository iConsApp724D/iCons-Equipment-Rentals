package com.example.icons724dv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StudentMeetIcons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_meet_icons);
    }

    public void michaelpatchell(View v) {
        //launch a new activity
        Intent O = new Intent(this, michael_patchell.class);
        startActivity(O);
    }
// This is a test of Git push on Android studio

}