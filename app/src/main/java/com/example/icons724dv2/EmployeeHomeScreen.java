package com.example.icons724dv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class EmployeeHomeScreen extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_home_screen);
        firebaseDatabase= FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference("Employees");
    }

    public void stock(View v){
        Intent a=new Intent(this,EmployeeListSelection.class);
        startActivity(a);
    }

    public void rentals(View v){
        Intent b=new Intent(this, EmployeeRentals.class);
        startActivity(b);
    }

    public void requests(View v){
        Intent c=new Intent(this, EmployeeRequests.class);
        startActivity(c);
    }

    public void turnOffline(View v){
          databaseReference.child(StringClass.employeeName).child("Online").setValue(false);
    }

}