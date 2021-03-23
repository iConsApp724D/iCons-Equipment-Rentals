package com.example.icons724dv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class EmployeeWorkbookCcList extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    TextView a,b,c,d,e,f,g,h,i,j,k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_workbook_cc_list);

        a=(TextView) findViewById(R.id.textView111EXAMS);
        b=(TextView) findViewById(R.id.textView112EXAMS);
        c=(TextView) findViewById(R.id.textView131EXAMS);
        d=(TextView) findViewById(R.id.textView132EXAMS);
        e=(TextView) findViewById(R.id.textView172EXAMS);
        f=(TextView) findViewById(R.id.textView172MIDS);
        g=(TextView) findViewById(R.id.textView174EXAMS);
        h=(TextView) findViewById(R.id.textViewECON110112S);
        i=(TextView) findViewById(R.id.textView1112014S);
        j=(TextView) findViewById(R.id.textView1112015S);
        k=(TextView) findViewById(R.id.textViewMTHE225ES);

        firebaseDatabase= FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference("Equipment").child("Workbooks");
        getdata();
    }

    private void getdata() {

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String a1=snapshot.child("APSC111E").child("Stock").getValue().toString();
                a.setText("Stock:  "+a1);
                String b1=snapshot.child("APSC112E").child("Stock").getValue().toString();
                b.setText("Stock:  "+b1);
                String c1=snapshot.child("APSC131E").child("Stock").getValue().toString();
                c.setText("Stock:  "+c1);
                String d1=snapshot.child("APSC132E").child("Stock").getValue().toString();
                d.setText("Stock:  "+d1);
                String e1=snapshot.child("APSC172E").child("Stock").getValue().toString();
                e.setText("Stock:  "+e1);
                String f1=snapshot.child("APSC172M").child("Stock").getValue().toString();
                f.setText("Stock:  "+f1);
                String g1=snapshot.child("APSC174E").child("Stock").getValue().toString();
                g.setText("Stock:  "+g1);
                String h1=snapshot.child("ECON110112").child("Stock").getValue().toString();
                h.setText("Stock:  "+h1);
                String i1=snapshot.child("2014APSC111").child("Stock").getValue().toString();
                i.setText("Stock:  "+i1);
                String j1=snapshot.child("2015APSC111").child("Stock").getValue().toString();
                j.setText("Stock:  "+j1);
                String k1=snapshot.child("MTHE225Workbook").child("Stock").getValue().toString();
                k.setText("Stock:  "+k1);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(EmployeeWorkbookCcList.this,"Failed to get data", Toast.LENGTH_SHORT).show();
            }
        });

    }


}