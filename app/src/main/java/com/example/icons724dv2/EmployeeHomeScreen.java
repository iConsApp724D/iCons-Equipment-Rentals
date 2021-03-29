package com.example.icons724dv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class EmployeeHomeScreen extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_home_screen);
        firebaseDatabase= FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference("Employees");
        StringClass.employeePass="";
        Button setOnline=(Button)findViewById(R.id.employeeOnline);
        Button setOffline=(Button)findViewById(R.id.employeeOffline);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.child(StringClass.employeeName).child("Online").getValue().equals(true)){
                    setOffline.setVisibility(View.VISIBLE);
                    setOnline.setVisibility(View.INVISIBLE);
                }
                if (snapshot.child(StringClass.employeeName).child("Online").getValue().equals(false)){
                    setOnline.setVisibility(View.VISIBLE);
                    setOffline.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(EmployeeHomeScreen.this,"Failed to get data", Toast.LENGTH_SHORT).show();
            }
        });
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
    public void turnOnline(View v){
        databaseReference.child(StringClass.employeeName).child("Online").setValue(true);
    }

}