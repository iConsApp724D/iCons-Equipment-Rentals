package com.example.icons724dv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class EmployeeLogin extends AppCompatActivity {
    EditText user, pass;
    String username, password;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_login);
        user=(EditText) findViewById(R.id.enterUsername);
        pass=(EditText) findViewById(R.id.employeePass);

        firebaseDatabase= FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference("Employees");
        boolean online=false;
    }



    public void employeeHome(View v){
        login();
    }

    private void login() {
        StringClass.employeeName=user.getText().toString();
        StringClass.employeePass=pass.getText().toString();

        if (TextUtils.isEmpty(StringClass.employeeName)){
            Toast.makeText(this,"Please enter your username", Toast.LENGTH_SHORT).show();
        }

        else if (TextUtils.isEmpty(StringClass.employeePass)){
            Toast.makeText(this,"Please enter your password", Toast.LENGTH_SHORT).show();
        }

        else{
            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (snapshot.child(StringClass.employeeName).exists()){
                        if (StringClass.employeePass.equals(snapshot.child(StringClass.employeeName).child("Password").getValue().toString())){
                            Intent a = new Intent(EmployeeLogin.this, EmployeeHomeScreen.class);
                            startActivity(a);
                            settoOnline();



                        }
                        else if (StringClass.employeePass!=""){
                            Toast.makeText(EmployeeLogin.this,"Invalid Password", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(EmployeeLogin.this,"User does not exist", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                    Toast.makeText(EmployeeLogin.this,"Failed to get data", Toast.LENGTH_SHORT).show();

                }
            });
        }

    }

    private void settoOnline(){
        finish();
        databaseReference.child(StringClass.employeeName).child("Online").setValue(true);
        }

}