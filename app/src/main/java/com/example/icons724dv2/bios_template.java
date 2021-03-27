package com.example.icons724dv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.GenericLifecycleObserver;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.squareup.picasso.Picasso;

public class bios_template extends AppCompatActivity {
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    FirebaseStorage storage = FirebaseStorage.getInstance();
    String name1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        firebaseDatabase= FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference("Employees");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bios_template);
        ImageView photo=(ImageView) findViewById(R.id.profile_image);
        TextView name = (TextView) findViewById(R.id.textView5);
        TextView discipline = (TextView) findViewById(R.id.textView6);
        TextView year = (TextView) findViewById(R.id.textView7);
        TextView canhelpwith = (TextView) findViewById(R.id.textView8);
        TextView interests = (TextView) findViewById(R.id.textView9);




        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                name1 =StringClass.employeeBioView;
                name.setText(snapshot.child(name1).child("Bio").child("Name").getValue().toString());
                discipline.setText(snapshot.child(name1).child("Bio").child("Year").getValue().toString()+snapshot.child(name1).child("Bio").child("Discipline").getValue().toString());
                interests.setText("• Enjoys " +snapshot.child(name1).child("Bio").child("Interests").getValue().toString());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(bios_template.this,"Failed to get data", Toast.LENGTH_SHORT).show();

            }
        });



        /*
        if (StringClass.employeeName.equals("Ryan")) {
            name.setText("Name: Ryan");
            discipline.setText("Discipline: Computer Eng");
            year.setText("Year: Class of 2024");
            canhelpwith.setText("Can help with MNTC 313");
            interests.setText("Interests: App development");

        }
        if (StringClass.employeeName.equals("Drake")) {
            name.setText("Name: Drake");
            discipline.setText("Discipline: Computer Eng");
            year.setText("Year: Class of 2024");
            canhelpwith.setText("Can help with APSC 112, 174");
            interests.setText("Interests: Short walks on the beach");*/

    }
    }

