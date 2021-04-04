package com.example.icons724dv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class StudentCablesChargersList extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    TextView a,b,c,d,e,f,g,h,i,j,k,l,m,n,o;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_cables_chargers_list);

        a=(TextView) findViewById(R.id.textViewACERCS);
        b=(TextView) findViewById(R.id.textViewASUSCS);
        c=(TextView) findViewById(R.id.textViewHDMIS);
        d=(TextView) findViewById(R.id.textViewHDTOLS);
        e=(TextView) findViewById(R.id.textViewHDTOUCS);
        f=(TextView) findViewById(R.id.textViewIPCS);
        g=(TextView) findViewById(R.id.textViewLENCS);
        h=(TextView) findViewById(R.id.textViewMACCS);
        i=(TextView) findViewById(R.id.textViewMICROUS);
        j=(TextView) findViewById(R.id.textViewMOUSS);
        k=(TextView) findViewById(R.id.textViewUSBCS);
        l=(TextView) findViewById(R.id.textViewUSBTO35S);
        m=(TextView) findViewById(R.id.textViewVGAS);
        n=(TextView) findViewById(R.id.textViewVGATOHDS);
        o=(TextView) findViewById(R.id.textViewVGATOLS);

        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference("Equipment").child("Tech");
        getdata();

    }

    private void getdata() {

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String a1=snapshot.child("AcerCharger").child("Stock").getValue().toString();
                a.setText("Stock:  "+a1);
                String b1=snapshot.child("AsusCharger").child("Stock").getValue().toString();
                b.setText("Stock:  "+b1);
                String c1=snapshot.child("HDMI").child("Stock").getValue().toString();
                c.setText("Stock:  "+c1);
                String d1=snapshot.child("HDMItoLightning").child("Stock").getValue().toString();
                d.setText("Stock:  "+d1);
                String e1=snapshot.child("HDMItoUSBC").child("Stock").getValue().toString();
                e.setText("Stock:  "+e1);
                String f1=snapshot.child("LightningCable").child("Stock").getValue().toString();
                f.setText("Stock:  "+f1);
                String g1=snapshot.child("LenovoCharger").child("Stock").getValue().toString();
                g.setText("Stock:  "+g1);
                String h1=snapshot.child("MacbookCharger").child("Stock").getValue().toString();
                h.setText("Stock:  "+h1);
                String i1=snapshot.child("MicroUSB").child("Stock").getValue().toString();
                i.setText("Stock:  "+i1);
                String j1=snapshot.child("Mouse").child("Stock").getValue().toString();
                j.setText("Stock:  "+j1);
                String k1=snapshot.child("USBC").child("Stock").getValue().toString();
                k.setText("Stock:  "+k1);
                String l1=snapshot.child("USBCto35").child("Stock").getValue().toString();
                l.setText("Stock:  "+l1);
                String m1=snapshot.child("VGA").child("Stock").getValue().toString();
                m.setText("Stock:  "+m1);
                String n1=snapshot.child("VGAtoHDMI").child("Stock").getValue().toString();
                n.setText("Stock:  "+n1);
                String o1=snapshot.child("VGAtoLightning").child("Stock").getValue().toString();
                o.setText("Stock:  "+o1);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(StudentCablesChargersList.this,"Failed to get data", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void shopCart(View v){
        Intent a = new Intent(this, StudentCart.class);
        startActivity(a);
    }

    public void ACERC(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.ACERC = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void ASUSC(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.ASUSC = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void HDMI(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.HDMI = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void HDTOL(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.HDTOL = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void HDTOUC(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.HDTOUC = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void IPC(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.IPC = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void LENC(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.LENC = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void MACC(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.MACC = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void MICROU(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.MICROU = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void MOUS(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.MOUS = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void USBC(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.USBC = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }

    }
    public void USBTO35(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.USBTO35 = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void VGA(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.VGA = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void VGATOHD(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.VGATOHD = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }
    public void VGATOL(View v){
        if(inCart.cartCounter<5){
            inCart.cartCounter=inCart.cartCounter+1;
            Toast.makeText(StudentCablesChargersList.this,"Item added to cart", Toast.LENGTH_SHORT).show();
            inCart.VGATOL = true;
        }
        else{
            Toast.makeText(StudentCablesChargersList.this,"Cart has too many items. Please remove an item to add another", Toast.LENGTH_SHORT).show();
        }
    }














}