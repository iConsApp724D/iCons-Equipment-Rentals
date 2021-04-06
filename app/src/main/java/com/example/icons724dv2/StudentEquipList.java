package com.example.icons724dv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class StudentEquipList extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    TextView a,b,c,d,e,f,g,h,i,j,k,l;
    Button as,bs,cs,ds,es,fs,gs,hs,is,js,ks, ls;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_equip_list);

        a=(TextView) findViewById(R.id.textViewBPS);
        as=(Button)findViewById(R.id.buttonBP);
        b=(TextView) findViewById(R.id.textViewHPS);
        bs=(Button)findViewById(R.id.buttonHP);
        c=(TextView) findViewById(R.id.textViewLGS);
        cs=(Button)findViewById(R.id.buttonLG);
        d=(TextView) findViewById(R.id.textViewMTS);
        ds=(Button)findViewById(R.id.buttonMT);
        e=(TextView) findViewById(R.id.textViewPS);
        es=(Button)findViewById(R.id.buttonP);
        f=(TextView) findViewById(R.id.textViewSGS);
        fs=(Button)findViewById(R.id.buttonSG);
        g=(TextView) findViewById(R.id.textViewSCIS);
        gs=(Button)findViewById(R.id.buttonSCI);
        h=(TextView) findViewById(R.id.textViewSTAPS);
        hs=(Button)findViewById(R.id.buttonSTAP);
        i=(TextView) findViewById(R.id.textViewSTICS);
        is=(Button)findViewById(R.id.buttonSTICK);
        j=(TextView) findViewById(R.id.textViewTAPES);
        js=(Button)findViewById(R.id.buttonTAPE);
        k=(TextView) findViewById(R.id.textViewWBMS);
        ks=(Button)findViewById(R.id.buttonWBM);
        l=(TextView) findViewById(R.id.textViewWOS);
        ls=(Button)findViewById(R.id.buttonWO);

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
                if(a1.equals("0")){as.setVisibility(View.GONE);}
                String b1=snapshot.child("Holepunch").child("Stock").getValue().toString();
                b.setText("Stock:  "+b1);
                if(b1.equals("0")){bs.setVisibility(View.GONE);}
                String c1=snapshot.child("Goggles").child("Stock").getValue().toString();
                c.setText("Stock:  "+c1);
                if(c1.equals("0")){cs.setVisibility(View.GONE);}
                String d1=snapshot.child("MeasureTape").child("Stock").getValue().toString();
                d.setText("Stock:  "+d1);
                if(d1.equals("0")){ds.setVisibility(View.GONE);}
                String e1=snapshot.child("Pen").child("Stock").getValue().toString();
                e.setText("Stock:  "+e1);
                if(e1.equals("0")){es.setVisibility(View.GONE);}
                String f1=snapshot.child("SafeGlasses").child("Stock").getValue().toString();
                f.setText("Stock:  "+f1);
                if(f1.equals("0")){fs.setVisibility(View.GONE);}
                String g1=snapshot.child("Scissors").child("Stock").getValue().toString();
                g.setText("Stock:  "+g1);
                if(g1.equals("0")){gs.setVisibility(View.GONE);}
                String h1=snapshot.child("Stapler").child("Stock").getValue().toString();
                h.setText("Stock:  "+h1);
                if(h1.equals("0")){hs.setVisibility(View.GONE);}
                String i1=snapshot.child("Stickers").child("Stock").getValue().toString();
                i.setText("Stock:  "+i1);
                if(i1.equals("0")){is.setVisibility(View.GONE);}
                String j1=snapshot.child("Tape").child("Stock").getValue().toString();
                j.setText("Stock:  "+j1);
                if(j1.equals("0")){js.setVisibility(View.GONE);}
                String k1=snapshot.child("DryErase").child("Stock").getValue().toString();
                k.setText("Stock:  "+k1);
                if(k1.equals("0")){ks.setVisibility(View.GONE);}
                String l1=snapshot.child("WhiteOut").child("Stock").getValue().toString();
                l.setText("Stock:  "+l1);
                if(l1.equals("0")){ls.setVisibility(View.GONE);}


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(StudentEquipList.this,"Failed to get data", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void shopCart(View v){
        Intent a = new Intent(this, StudentCart.class);
        startActivity(a);
    }

    public void bp(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentEquipList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.bp = true;
        }
        else{
            Toast.makeText(StudentEquipList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void hp(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentEquipList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.hp = true;
        }
        else{
            Toast.makeText(StudentEquipList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void LG(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentEquipList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.LG = true;
        }
        else{
            Toast.makeText(StudentEquipList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void MT(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentEquipList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.MT = true;
        }
        else{
            Toast.makeText(StudentEquipList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void P(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentEquipList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.P = true;
        }
        else{
            Toast.makeText(StudentEquipList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void SG(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentEquipList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.SG = true;
        }
        else{
            Toast.makeText(StudentEquipList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void SCI(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentEquipList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.SCI = true;
        }
        else{
            Toast.makeText(StudentEquipList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void STAP(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentEquipList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.STAP = true;
        }
        else{
            Toast.makeText(StudentEquipList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void STICK(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentEquipList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.STICK = true;
        }
        else{
            Toast.makeText(StudentEquipList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void TAPE(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentEquipList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.TAPE = true;
        }
        else{
            Toast.makeText(StudentEquipList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void WBM(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentEquipList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.WBM = true;
        }
        else{
            Toast.makeText(StudentEquipList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void WO(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentEquipList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.WO = true;
        }
        else{
            Toast.makeText(StudentEquipList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }





}