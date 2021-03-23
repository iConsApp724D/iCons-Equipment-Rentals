package com.example.icons724dv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class StudentMeetIcons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_meet_icons);


    }

    public void update(View v) {
        Button drakestoll=(Button)findViewById(R.id.button27);
        ImageView stolldrake=(ImageView)findViewById(R.id.imageView21);
        if (StringClass.employeeonshift.equals("Drake Stoll On Shift")){
            drakestoll.setVisibility(View.VISIBLE);
            stolldrake.setVisibility(View.VISIBLE);

        }

        Button ryanbaker=(Button)findViewById(R.id.button37);
        ImageView bakerryan=(ImageView)findViewById(R.id.imageView30);
        if (StringClass.employeeryanbakeronshift.equals("Ryan Baker On Shift")){
            ryanbaker.setVisibility(View.VISIBLE);
            bakerryan.setVisibility(View.VISIBLE);
        }
        Button michaelpatchell=(Button)findViewById(R.id.button2);
        ImageView patchellmichael=(ImageView)findViewById(R.id.imageView19);
        if (StringClass.employeemichaelpatchellonshift.equals("Michael Patchell On Shift")){
            michaelpatchell.setVisibility(View.VISIBLE);
            patchellmichael.setVisibility(View.VISIBLE);
        }
        Button antik=(Button)findViewById(R.id.button34);
        ImageView antikantik=(ImageView)findViewById(R.id.imageView34);
        if (StringClass.employeeantikantikonshift.equals("Antik Antik On Shift")){
            antik.setVisibility(View.VISIBLE);
            antikantik.setVisibility(View.VISIBLE);
        }
        Button tyler=(Button)findViewById(R.id.button47);
        ImageView sun=(ImageView)findViewById(R.id.imageView31);
        if (StringClass.employeetylersunonshift.equals("Tyler Sun On Shift")){
            tyler.setVisibility(View.VISIBLE);
            sun.setVisibility(View.VISIBLE);
        }
        Button deven=(Button)findViewById(R.id.button57);
        ImageView vyas=(ImageView)findViewById(R.id.imageView50);
        if (StringClass.employeedevenvyasonshift.equals("Deven Vyas On Shift")){
            deven.setVisibility(View.VISIBLE);
            vyas.setVisibility(View.VISIBLE);
        }
    }


    public void michaelpatchell(View v) {
        Intent O = new Intent(this, michael_patchell.class);
        startActivity(O);

    }

    public void launchbiotemplate(View v) {
        Intent K = new Intent(this, bios_template.class);
        startActivity(K);


    }
}