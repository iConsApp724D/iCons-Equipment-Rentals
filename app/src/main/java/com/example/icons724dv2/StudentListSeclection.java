package com.example.icons724dv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StudentListSeclection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list_seclection);
    }

    public void textbookList(View v){
        Intent a=new Intent(this, StudentTextbookList.class);
        startActivity(a);
    }

    public void SuppliesList(View v){
        Intent b=new Intent(this, StudentEquipList.class);
        startActivity(b);
    }

    public void TechList(View v){
        Intent c=new Intent(this, StudentCablesChargersList.class);
        startActivity(c);
    }

    public void workbooks(View v){
        Intent d=new Intent(this, StudentWorkbookCcList.class);
        startActivity(d);
    }
}