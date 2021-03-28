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
    public void ryanbio(View v){
        StringClass.employeeBioView="Ryan";
        Intent b=new Intent(this,bios_template.class);
        startActivity(b);
    }
    public void drakebio(View v){
        StringClass.employeeBioView="Drake";
        Intent c=new Intent(this,bios_template.class);
        startActivity(c);
    }
    public void antikbio(View v){
        StringClass.employeeBioView="Antik";
        Intent d=new Intent(this,bios_template.class);
        startActivity(d);
    }
    public void tylerbio(View v){
        StringClass.employeeBioView="Tyler";
        Intent e=new Intent(this,bios_template.class);
        startActivity(e);
    }
    public void devenbio(View v){
        StringClass.employeeBioView="Deven";
        Intent f=new Intent(this,bios_template.class);
        startActivity(f);
    }
    public void emptybio(View v){
        StringClass.employeeBioView="Template";
        Intent g=new Intent(this,bios_template.class);
        startActivity(g);
    }
}