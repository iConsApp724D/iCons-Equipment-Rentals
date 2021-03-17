package com.example.icons724dv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EmployeeListSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_list_selection);
    }

    public void textbookList(View v){
        Intent a=new Intent(this, EmployeeTextbookList.class);
        startActivity(a);
    }

    public void SuppliesList(View v){
        Intent b=new Intent(this, EmployeeStockList.class);
        startActivity(b);
    }

    public void TechList(View v){
        Intent c=new Intent(this, EmployeeCablesChargers.class);
        startActivity(c);
    }

    public void workbooks(View v){
        Intent d=new Intent(this, EmployeeWorkbookCcList.class);
        startActivity(d);
    }

}