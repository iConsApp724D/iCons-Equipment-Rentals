package com.example.icons724dv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
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
        ImageView requestsRed=(ImageView) findViewById(R.id.circle1);
        TextView requestsNumber=(TextView) findViewById(R.id.requestsNumber);


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

        final DatabaseReference requestsRef = FirebaseDatabase.getInstance().getReference();


        requestsRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(!snapshot.child("Requests").hasChildren()){
                    requestsRed.setVisibility(View.GONE);
                    requestsNumber.setVisibility(View.GONE);
                }
                else{
                    long requestsNum=snapshot.child("Requests").getChildrenCount();
                    requestsNumber.setText(requestsNum+"");
                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

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
    public void openCalendar(View v){
        Intent d=new Intent(this, EmployeeCalendar.class);
        startActivity(d);
    }

    public void turnOffline(View v){
        databaseReference.child(StringClass.employeeName).child("Online").setValue(false);
    }
    public void turnOnline(View v){
        databaseReference.child(StringClass.employeeName).child("Online").setValue(true);
    }

}