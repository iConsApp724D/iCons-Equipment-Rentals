package com.example.icons724dv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class onshiftsignin extends AppCompatActivity {
    EditText onshift,onshiftryanbaker,onshiftmichaelpatchell,onshiftantikantik,onshifttylersun,onshiftdevenvyas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onshiftsignin);
        Switch simpleSwitch = (Switch) findViewById(R.id.switch3);
        TextView text = (TextView) findViewById(R.id.editTextTextPersonName2);
        onshift = (EditText) findViewById(R.id.editTextTextPersonName2);
        onshiftryanbaker = (EditText) findViewById(R.id.editTextRyanBaker);
        Switch s6 = (Switch) findViewById(R.id.switch6);
        Switch s7 = (Switch) findViewById(R.id.switch7);


        simpleSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    text.setText("Drake Stoll On Shift");
                    StringClass.employeeonshift = onshift.getText().toString();
                }
            }
        });
        s6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    text.setText("Drake Stoll Off Shift");
                    StringClass.employeeonshift = onshift.getText().toString();
                }
            }
        });

        Switch rbaker = (Switch) findViewById(R.id.switch4);
        TextView rbakeronshift = (TextView) findViewById(R.id.editTextRyanBaker);

        rbaker.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    rbakeronshift.setText("Ryan Baker On Shift");
                    StringClass.employeeryanbakeronshift = onshiftryanbaker.getText().toString();
                }
            }
        });
        s7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    rbakeronshift.setText("Ryan Baker Off Shift");
                    StringClass.employeeryanbakeronshift = onshiftryanbaker.getText().toString();
                }
            }
        });
        Switch s10 = (Switch) findViewById(R.id.switch10);
        TextView mpatchellonshift = (TextView) findViewById(R.id.editTextMichaelPatchell);
        onshiftmichaelpatchell = (EditText) findViewById(R.id.editTextMichaelPatchell);

        s10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mpatchellonshift.setText("Michael Patchell On Shift");
                    StringClass.employeemichaelpatchellonshift = onshiftmichaelpatchell.getText().toString();
                }
            }
        });
        Switch s11=(Switch) findViewById(R.id.switch11);
        s11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mpatchellonshift.setText("Michael Patchell Off Shift");
                    StringClass.employeemichaelpatchellonshift = onshiftmichaelpatchell.getText().toString();
                }
            }
        });
        Switch s12 = (Switch) findViewById(R.id.switch12);
        TextView aantikonshift = (TextView) findViewById(R.id.editTextAntikAntik);
        onshiftantikantik = (EditText) findViewById(R.id.editTextAntikAntik);

        s12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    aantikonshift.setText("Antik Antik On Shift");
                    StringClass.employeeantikantikonshift = onshiftantikantik.getText().toString();
                }
            }
        });
        Switch s13=(Switch) findViewById(R.id.switch13);
        s13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    aantikonshift.setText("Antik Antik Off Shift");
                    StringClass.employeeantikantikonshift = onshiftantikantik.getText().toString();
                }
            }
        });
        Switch s14 = (Switch) findViewById(R.id.switch14);
        TextView tsunonshift = (TextView) findViewById(R.id.editTextTylerSun);
        onshifttylersun = (EditText) findViewById(R.id.editTextTylerSun);

        s14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    tsunonshift.setText("Tyler Sun On Shift");
                    StringClass.employeetylersunonshift = onshifttylersun.getText().toString();
                }
            }
        });
        Switch s15=(Switch) findViewById(R.id.switch15);
        s15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    tsunonshift.setText("Tyler Sun Off Shift");
                    StringClass.employeetylersunonshift = onshifttylersun.getText().toString();
                }
            }
        });
        Switch s16 = (Switch) findViewById(R.id.switch16);
        TextView dvyasonshift = (TextView) findViewById(R.id.editTextDevenVyas);
        onshiftdevenvyas = (EditText) findViewById(R.id.editTextDevenVyas);

        s16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dvyasonshift.setText("Deven Vyas On Shift");
                    StringClass.employeedevenvyasonshift=onshiftdevenvyas.getText().toString();
                }
            }
        });
        Switch s17=(Switch) findViewById(R.id.switch17);
        s17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dvyasonshift.setText("Deven Vyas Off Shift");
                    StringClass.employeedevenvyasonshift = onshiftdevenvyas.getText().toString();
                }
            }
        });
    }
}