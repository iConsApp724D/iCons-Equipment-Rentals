package com.example.icons724dv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class bios_template extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bios_template);
        Switch simpleSwitch = (Switch) findViewById(R.id.SimpleSwitch);
        Button requesthelp= (Button)findViewById(R.id.button36);

        simpleSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    requesthelp.setVisibility(View.VISIBLE);
                }
                else{
                    requesthelp.setVisibility(View.GONE);
                }
            }
        });



    }
}
