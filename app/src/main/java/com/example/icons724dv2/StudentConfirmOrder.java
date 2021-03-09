package com.example.icons724dv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class StudentConfirmOrder extends AppCompatActivity {
    EditText room;
    String roomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_confirm_order);
        room=(EditText) findViewById(R.id.enterRoom);
        TextView text = (TextView) findViewById(R.id.textName);
        text.setText("Name:     "+StringClass.name1);

        TextView text2 = (TextView) findViewById(R.id.textStudentId);
        text2.setText("Student ID:   "+StringClass.studID);

    }

    public void confirm(View v){
        roomNumber=room.getText().toString();
        Intent a = new Intent(this, StudentAfterOrder.class);
        startActivity(a);
    }
}