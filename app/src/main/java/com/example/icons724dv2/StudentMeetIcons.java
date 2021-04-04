package com.example.icons724dv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class StudentMeetIcons extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_meet_icons);

        firebaseDatabase= FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference("Employees");
        ArrayList<String> onlineEmployees=new ArrayList<String>();

        Button michaelpatchell = (Button) findViewById(R.id.button2);
        ImageView patchellmichael = (ImageView) findViewById(R.id.imageView19);
        Button ryanbaker=(Button)findViewById(R.id.button37);
        ImageView bakerryan=(ImageView)findViewById(R.id.imageView30);
        Button antik=(Button)findViewById(R.id.button34);
        ImageView antikantik=(ImageView)findViewById(R.id.imageView34);
        Button tyler=(Button)findViewById(R.id.button47);
        ImageView sun=(ImageView)findViewById(R.id.imageView31);
        Button deven=(Button)findViewById(R.id.button57);
        ImageView vyas=(ImageView)findViewById(R.id.imageView50);
        Button drakestoll=(Button)findViewById(R.id.button27);
        ImageView stolldrake=(ImageView)findViewById(R.id.imageView21);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.child("Michael").child("Online").getValue().equals(true)) {
                    michaelpatchell.setVisibility(View.VISIBLE);
                    patchellmichael.setVisibility(View.VISIBLE);
                }
                if (snapshot.child("Michael").child("Online").getValue().equals(false)) {
                    michaelpatchell.setVisibility(View.GONE);
                    patchellmichael.setVisibility(View.GONE);
                }

                if (snapshot.child("Ryan").child("Online").getValue().equals(true)){
                    ryanbaker.setVisibility(View.VISIBLE);
                    bakerryan.setVisibility(View.VISIBLE);
                }
                if (snapshot.child("Ryan").child("Online").getValue().equals(false)){
                    ryanbaker.setVisibility(View.GONE);
                    bakerryan.setVisibility(View.GONE);
                }

                if (snapshot.child("Drake").child("Online").getValue().equals(true)){
                    drakestoll.setVisibility(View.VISIBLE);
                    stolldrake.setVisibility(View.VISIBLE);
                }
                if (snapshot.child("Drake").child("Online").getValue().equals(false)){
                    drakestoll.setVisibility(View.GONE);
                    stolldrake.setVisibility(View.GONE);
                }

                if (snapshot.child("Antik").child("Online").getValue().equals(true)){
                    antik.setVisibility(View.VISIBLE);
                    antikantik.setVisibility(View.VISIBLE);
                }
                if (snapshot.child("Antik").child("Online").getValue().equals(false)){
                    antik.setVisibility(View.GONE);
                    antikantik.setVisibility(View.GONE);
                }

                if (snapshot.child("Deven").child("Online").getValue().equals(true)){
                    deven.setVisibility(View.VISIBLE);
                    vyas.setVisibility(View.VISIBLE);
                }
                if (snapshot.child("Deven").child("Online").getValue().equals(false)){
                    deven.setVisibility(View.GONE);
                    vyas.setVisibility(View.GONE);
                }

                if (snapshot.child("Tyler").child("Online").getValue().equals(true)){
                    tyler.setVisibility(View.VISIBLE);
                    sun.setVisibility(View.VISIBLE);
                }
                if (snapshot.child("Tyler").child("Online").getValue().equals(false)){
                    tyler.setVisibility(View.GONE);
                    sun.setVisibility(View.GONE);
                }




            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(StudentMeetIcons.this,"Failed to get data", Toast.LENGTH_SHORT).show();
            }
        });



    }

    public void viewAllIcons(View v){
        Intent x = new Intent(this, StudentAllIcons.class);
        startActivity(x);
    }


    public void michaelpatchell(View v) {
        StringClass.employeeBioView="Michael";
        Intent O = new Intent(this, bios_template.class);
        startActivity(O);

    }
    public void ryanbaker(View v) {
        StringClass.employeeBioView="Ryan";
        Intent a = new Intent(this, bios_template.class);
        startActivity(a);

    }
    public void drakestoll(View v) {
        StringClass.employeeBioView="Drake";
        Intent b = new Intent(this, bios_template.class);
        startActivity(b);

    }
    public void antikantik(View v) {
        StringClass.employeeBioView="Antik";
        Intent c = new Intent(this, bios_template.class);
        startActivity(c);

    }
    public void tylersun(View v) {
        StringClass.employeeBioView="Tyler";
        Intent d = new Intent(this, bios_template.class);
        startActivity(d);

    }
    public void devenvyas(View v) {
        StringClass.employeeBioView="Deven";
        Intent e = new Intent(this, bios_template.class);
        startActivity(e);

    }

    public void launchbiotemplate(View v) {
        StringClass.employeeBioView="Template";
        Intent f =new Intent(this,bios_template.class);
        startActivity(f);
    }



}