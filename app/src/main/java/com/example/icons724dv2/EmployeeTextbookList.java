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

public class EmployeeTextbookList extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    TextView a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_textbook_list);

        a=(TextView) findViewById(R.id.textViewAPSC111S);
        b=(TextView) findViewById(R.id.textViewAPSC112S);
        c=(TextView) findViewById(R.id.textViewCALC6S);
        d=(TextView) findViewById(R.id.textViewCALC7S);
        e=(TextView) findViewById(R.id.textViewGEO4S);
        f=(TextView) findViewById(R.id.textViewELEC221S);
        g=(TextView) findViewById(R.id.textViewEE2S);
        h=(TextView) findViewById(R.id.textViewEE4S);
        i=(TextView) findViewById(R.id.textViewFLMS);
        j=(TextView) findViewById(R.id.textViewF341S);
        k=(TextView) findViewById(R.id.textViewFCAS);
        l=(TextView) findViewById(R.id.textViewFETS);
        m=(TextView) findViewById(R.id.textViewCHEM10S);
        n=(TextView) findViewById(R.id.textViewMM8S);
        o=(TextView) findViewById(R.id.textViewMM2S);
        p=(TextView) findViewById(R.id.textViewME12S);
        q=(TextView) findViewById(R.id.textViewMG3S);
        r=(TextView) findViewById(R.id.textViewMG4S);
        s=(TextView) findViewById(R.id.textViewMTHE406S);

        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference("Equipment").child("Textbooks");
        getdata();
    }

    private void getdata() {

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String a1=snapshot.child("APSC111").child("Stock").getValue().toString();
                a.setText("Stock:  "+a1);
                String b1=snapshot.child("APSC112").child("Stock").getValue().toString();
                b.setText("Stock:  "+b1);
                String c1=snapshot.child("Calc6th").child("Stock").getValue().toString();
                c.setText("Stock:  "+c1);
                String d1=snapshot.child("Calc7th").child("Stock").getValue().toString();
                d.setText("Stock:  "+d1);
                String e1=snapshot.child("PhysicalGeo").child("Stock").getValue().toString();
                e.setText("Stock:  "+e1);
                String f1=snapshot.child("ELEC221").child("Stock").getValue().toString();
                f.setText("Stock:  "+f1);
                String g1=snapshot.child("EngEcon2").child("Stock").getValue().toString();
                g.setText("Stock:  "+g1);
                String h1=snapshot.child("EngEcon4").child("Stock").getValue().toString();
                h.setText("Stock:  "+h1);
                String i1=snapshot.child("FluidMech").child("Stock").getValue().toString();
                i.setText("Stock:  "+i1);
                String j1=snapshot.child("Fluids341").child("Stock").getValue().toString();
                j.setText("Stock:  "+j1);
                String k1=snapshot.child("ComplexAnalysis").child("Stock").getValue().toString();
                k.setText("Stock:  "+k1);
                String l1=snapshot.child("EngThermo").child("Stock").getValue().toString();
                l.setText("Stock:  "+l1);
                String m1=snapshot.child("GenChem10").child("Stock").getValue().toString();
                m.setText("Stock:  "+m1);
                String n1=snapshot.child("MechMat").child("Stock").getValue().toString();
                n.setText("Stock:  "+n1);
                String o1=snapshot.child("MemMgt2").child("Stock").getValue().toString();
                o.setText("Stock:  "+o1);
                String p1=snapshot.child("Microecon12").child("Stock").getValue().toString();
                p.setText("Stock:  "+p1);
                String q1=snapshot.child("Graphics3").child("Stock").getValue().toString();
                q.setText("Stock:  "+q1);
                String r1=snapshot.child("Graphics4").child("Stock").getValue().toString();
                r.setText("Stock:  "+r1);
                String s1=snapshot.child("MTHE406").child("Stock").getValue().toString();
                s.setText("Stock:  "+s1);



            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(EmployeeTextbookList.this,"Failed to get data", Toast.LENGTH_SHORT).show();
            }
        });

    }
}