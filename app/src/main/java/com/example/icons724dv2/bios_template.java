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
        TextView interests = (TextView) findViewById(R.id.textView9);



        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                name1 =StringClass.employeeBioView;
                name.setText(snapshot.child(name1).child("Bio").child("Name").getValue().toString());
                discipline.setText(snapshot.child(name1).child("Bio").child("Year").getValue().toString()+snapshot.child(name1).child("Bio").child("Discipline").getValue().toString());
                interests.setText("• Enjoys " +snapshot.child(name1).child("Bio").child("Interests").getValue().toString());
                if (StringClass.employeeBioView.equals("Michael")){
                    photo.setImageResource(R.drawable.michaelportrait);
                }
                if (StringClass.employeeBioView.equals("Ryan")){
                    photo.setImageResource(R.drawable.ryanportrait);
                }
                if (StringClass.employeeBioView.equals("Antik")){
                    photo.setImageResource(R.drawable.antikimage);
                }
                if (StringClass.employeeBioView.equals("Drake")){
                    photo.setImageResource(R.drawable.antikimage);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(bios_template.this,"Failed to get data", Toast.LENGTH_SHORT).show();

            }
        });





    }
    }

