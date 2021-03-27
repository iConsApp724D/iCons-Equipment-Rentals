package com.example.icons724dv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class StudentMeetIcons extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_meet_icons);

        firebaseDatabase= FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference("Employees");

        Button michaelpatchell = (Button) findViewById(R.id.button2);
        ImageView patchellmichael = (ImageView) findViewById(R.id.imageView19);
        if (StringClass.employeeName.equals("Michael")) {
            michaelpatchell.setVisibility(View.VISIBLE);
            patchellmichael.setVisibility(View.VISIBLE);
        }

        Button ryanbaker=(Button)findViewById(R.id.button37);
        ImageView bakerryan=(ImageView)findViewById(R.id.imageView30);
        if (StringClass.employeeName.equals("Ryan")){
            ryanbaker.setVisibility(View.VISIBLE);
            bakerryan.setVisibility(View.VISIBLE);
        }

        Button antik=(Button)findViewById(R.id.button34);
        ImageView antikantik=(ImageView)findViewById(R.id.imageView34);
        if (StringClass.employeeName.equals("Antik")){
            antik.setVisibility(View.VISIBLE);
            antikantik.setVisibility(View.VISIBLE);
        }
        Button tyler=(Button)findViewById(R.id.button47);
        ImageView sun=(ImageView)findViewById(R.id.imageView31);
        if (StringClass.employeeName.equals("Tyler")){
            tyler.setVisibility(View.VISIBLE);
            sun.setVisibility(View.VISIBLE);
        }
        Button deven=(Button)findViewById(R.id.button57);
        ImageView vyas=(ImageView)findViewById(R.id.imageView50);
        if (StringClass.employeeName.equals("Deven")){
            deven.setVisibility(View.VISIBLE);
            vyas.setVisibility(View.VISIBLE);
        }
        Button drakestoll=(Button)findViewById(R.id.button27);
        ImageView stolldrake=(ImageView)findViewById(R.id.imageView21);
        if (StringClass.employeeName.equals("Drake")) {
            drakestoll.setVisibility(View.VISIBLE);
            stolldrake.setVisibility(View.VISIBLE);
        }



    }


    public void michaelpatchell(View v) {
        //launch a new activity
        Intent O = new Intent(this, michael_patchell.class);
        startActivity(O);

    }

    public void launchbiotemplate(View v) {
        //launch a new activity
        Intent K = new Intent(this, bios_template.class);
        startActivity(K);


    }
}