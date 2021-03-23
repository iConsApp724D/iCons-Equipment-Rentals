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

public class EmployeeStockList extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    TextView a,b,c,d,e,f,g,h,i,j,k,l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_stock_list);

        a=(TextView) findViewById(R.id.textViewBPS);
        b=(TextView) findViewById(R.id.textViewHPS);
        c=(TextView) findViewById(R.id.textViewLGS);
        d=(TextView) findViewById(R.id.textViewMTS);
        e=(TextView) findViewById(R.id.textViewPS);
        f=(TextView) findViewById(R.id.textViewSGS);
        g=(TextView) findViewById(R.id.textViewSCIS);
        h=(TextView) findViewById(R.id.textViewSTAPS);
        i=(TextView) findViewById(R.id.textViewSTICS);
        j=(TextView) findViewById(R.id.textViewTAPES);
        k=(TextView) findViewById(R.id.textViewWBMS);
        l=(TextView) findViewById(R.id.textViewWOS);

        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference("Equipment").child("Supplies");
        getdata();
    }

    private void getdata() {

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String a1=snapshot.child("Paper").child("Stock").getValue().toString();
                a.setText("Stock:  "+a1);
                String b1=snapshot.child("Holepunch").child("Stock").getValue().toString();
                b.setText("Stock:  "+b1);
                String c1=snapshot.child("Goggles").child("Stock").getValue().toString();
                c.setText("Stock:  "+c1);
                String d1=snapshot.child("MeasureTape").child("Stock").getValue().toString();
                d.setText("Stock:  "+d1);
                String e1=snapshot.child("Pen").child("Stock").getValue().toString();
                e.setText("Stock:  "+e1);
                String f1=snapshot.child("SafeGlasses").child("Stock").getValue().toString();
                f.setText("Stock:  "+f1);
                String g1=snapshot.child("Scissors").child("Stock").getValue().toString();
                g.setText("Stock:  "+g1);
                String h1=snapshot.child("Stapler").child("Stock").getValue().toString();
                h.setText("Stock:  "+h1);
                String i1=snapshot.child("Stickers").child("Stock").getValue().toString();
                i.setText("Stock:  "+i1);
                String j1=snapshot.child("Tape").child("Stock").getValue().toString();
                j.setText("Stock:  "+j1);
                String k1=snapshot.child("DryErase").child("Stock").getValue().toString();
                k.setText("Stock:  "+k1);
                String l1=snapshot.child("WhiteOut").child("Stock").getValue().toString();
                l.setText("Stock:  "+l1);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(EmployeeStockList.this,"Failed to get data", Toast.LENGTH_SHORT).show();
            }
        });

    }
}