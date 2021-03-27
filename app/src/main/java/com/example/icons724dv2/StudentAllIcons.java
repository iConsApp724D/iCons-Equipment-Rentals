package com.example.icons724dv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StudentAllIcons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_all_icons);
    }


    public void michaelbio(View v){
        StringClass.employeeBioView="Michael";
        Intent a=new Intent(this,bios_template.class);
        startActivity(a);
    }
}