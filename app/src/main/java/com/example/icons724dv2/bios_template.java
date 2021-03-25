package com.example.icons724dv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class bios_template extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bios_template);
        TextView name = (TextView) findViewById(R.id.textView5);
        TextView discipline = (TextView) findViewById(R.id.textView6);
        TextView year = (TextView) findViewById(R.id.textView7);
        TextView canhelpwith = (TextView) findViewById(R.id.textView8);
        TextView interests = (TextView) findViewById(R.id.textView9);
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
            interests.setText("Interests: Short walks on the beach");

        }
    }
}
